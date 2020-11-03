/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Database;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import model.aluno;


/**
 *
 * @author Cimol
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TableView<aluno> tblAlunos;

    @FXML
    private TableColumn<aluno, Integer> tcId;

    @FXML
    private TableColumn<aluno, Integer> tcMatricula;

    @FXML
    private TableColumn<aluno, String> tcNome;

    @FXML
    private TableColumn<aluno, String> tcDataNascimento;

    @FXML
    private TableColumn<aluno, String> tcEmail;

    @FXML
    private Button btnAdicionar;

    @FXML
    private Button btnAlterar;

    @FXML
    private Button btnDeletar;

    @FXML
    private TextField txtMatricula;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtDataNascimento;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnLimpar;
    
    int indiceAlterar;
    
    private int id = 1;
    
    int flag = 0;
    
    public void mostrarMensagemErro(String titulo, String mensagem, String acao) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(mensagem);
        alert.setContentText("Selecione uma linha antes de "+acao+" um registro.");
        alert.showAndWait();
    }
    public void mostraMensagemInformacao(String titulo, String mensagem){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(mensagem);
        alert.showAndWait();
    }
    
    public boolean mostrarMensagemConfirmacao(String titulo, String mensagem){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(mensagem);
        alert.getButtonTypes().clear();
        alert.getButtonTypes().add(ButtonType.YES);
        alert.getButtonTypes().add(ButtonType.NO);
        Optional<ButtonType> option = alert.showAndWait();

        return option.get() == ButtonType.YES; 
    }
    
    public void atualizaTabela(){
        ObservableList<aluno> listaAluno = FXCollections.observableArrayList();
        Database db = new Database();
        db.startConnection();
        System.out.print(db.getAlertError());
        aluno aluno = new aluno(db.getConnection());
        try{
            ResultSet listaResult = aluno.getListaAlunos();
            while(listaResult.next()){
                aluno alunoAux = new aluno();
                alunoAux.setId(listaResult.getInt("id"));
                alunoAux.setNome(listaResult.getString("Nome"));
                alunoAux.setMatricula(listaResult.getString("Matricula"));
                alunoAux.setEmail(listaResult.getString("Email"));
                alunoAux.setDataNascimento(listaResult.getString("DataNascimento"));
                listaAluno.add(alunoAux);
            }
            db.endConnection();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        tblAlunos.setItems(listaAluno);
    }
    
    public void cliqueSalvar(MouseEvent mouse){
        if(flag == 0){
            Database db = new Database();
            db.startConnection();
            aluno alunoSalvar = new aluno(db.getConnection());
            alunoSalvar.setNome(txtNome.getText());
            alunoSalvar.setEmail(txtEmail.getText());
            alunoSalvar.setMatricula(txtMatricula.getText());
            alunoSalvar.setDataNascimento(txtDataNascimento.getText());
            try{
                alunoSalvar.setAluno();
            }catch (SQLException ex){
                mostrarMensagemErro("Erro", "Não foi possível adicionar o aluno!","");
            }
        }else{
            if(tblAlunos.getSelectionModel().getSelectedItem() != null){
                aluno verifica = tblAlunos.getSelectionModel().getSelectedItem();
                Database db = new Database();
                db.startConnection();
                aluno animeSalvar = new aluno(db.getConnection());
                animeSalvar.setId(verifica.getId());
                animeSalvar.setNome(txtNome.getText());
                animeSalvar.setEmail(txtEmail.getText());
                animeSalvar.setMatricula(txtMatricula.getText());
                animeSalvar.setDataNascimento(txtDataNascimento.getText());
                try {
                    animeSalvar.updateAluno();
                } catch (SQLException ex) {
                    mostrarMensagemErro("Erro", "Não foi possível adicionar o anime!", "");
                }
                flag = 0;
            }
        }
        
        txtNome.setEditable(false);
        txtEmail.setEditable(false);
        txtMatricula.setEditable(false);
        txtDataNascimento.setEditable(false);
        
        atualizaTabela();
        limpar();
    }
    
    public void cliqueAdicionar(MouseEvent mouse){
        txtNome.setEditable(true);
        txtEmail.setEditable(true);
        txtMatricula.setEditable(true);
        txtDataNascimento.setEditable(true);
    }
    
    public void cliqueAlterar(MouseEvent mouse){
        if(tblAlunos.getSelectionModel().getSelectedItem() != null){
            aluno verifica = tblAlunos.getSelectionModel().getSelectedItem();
            
            txtNome.setEditable(true);
            txtEmail.setEditable(true);
            txtMatricula.setEditable(true);
            txtDataNascimento.setEditable(true);
            
            txtNome.setText(verifica.getNome());
            txtEmail.setText(verifica.getEmail());
            txtMatricula.setText(verifica.getMatricula());
            txtDataNascimento.setText(verifica.getDataNascimento());
            flag = 1; 
        }      
    }
    
    public void cliqueExcluir(MouseEvent mouse){
        if(tblAlunos.getSelectionModel().getSelectedItem() != null){
            Database db = new Database();
            db.startConnection();
            aluno alunoExclui = tblAlunos.getSelectionModel().getSelectedItem();
            alunoExclui.setConnection(db.getConnection());
            if(mostrarMensagemConfirmacao("Excluir Aluno?", "Deseja mesmo excluir este aluno? "+alunoExclui.getNome()));
            try{
                alunoExclui.deleteAluno(alunoExclui.getId());
                atualizaTabela();
            }
            catch(SQLException ex){
                mostrarMensagemErro("Erro ao Excluir", "Não foi possivel excluir o registro!", "");
            }
            db.endConnection();
        }
        else{
            mostrarMensagemErro("Erro", "Selecione uma linha", "excluir");
        }
    }
    
    public void limpar(){
        txtEmail.setText("");
        txtNome.setText("");
        txtMatricula.setText("");
        txtDataNascimento.setText("");
    }
    
    public void limparCampos(MouseEvent mouse){
        limpar();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tcId.setCellValueFactory(new PropertyValueFactory("id"));
        tcNome.setCellValueFactory(new PropertyValueFactory("Nome"));
        tcMatricula.setCellValueFactory(new PropertyValueFactory("Matricula"));
        tcEmail.setCellValueFactory(new PropertyValueFactory("Email"));
        tcDataNascimento.setCellValueFactory(new PropertyValueFactory("DataNascimento"));
        
        txtNome.setEditable(false);
        txtEmail.setEditable(false);
        txtMatricula.setEditable(false);
        txtDataNascimento.setEditable(false);
        
        atualizaTabela();
    }    
}
