/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula32;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Cimol
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Label label1;
    
    @FXML
    private Label label2;
    
    @FXML
    private Label label3;
    
    @FXML
    private Button button;

    @FXML
    private DatePicker data;

    @FXML
    private TableView<Pessoa> tabelaPessoa;

    @FXML
    private TableColumn<Pessoa, Integer> clID;
    
    @FXML
    private TableColumn<Pessoa, String> clNome;
    
    @FXML
    private TableColumn<Pessoa, String> clEmail;

    @FXML
    private TableColumn<Pessoa, String> clEndereco;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        LocalDate dataSelecionada = data.getValue();
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String dataFormatada = formatoBR.format(dataSelecionada);
        label.setText(dataFormatada);
        
        Pessoa selecionada = tabelaPessoa.getSelectionModel().getSelectedItem();
        label1.setText("Nome: "+selecionada.getNome());
        label2.setText("Email: "+selecionada.getEmail());
        label3.setText("Endereço: "+selecionada.getEndereco());
        
        /*Alert informacao = new Alert(Alert.AlertType.INFORMATION);
        informacao.setHeaderText("Cabeçalho");
        informacao.setContentText("Conteúdo");
        informacao.setTitle("Título");
        informacao.showAndWait();*/
        /*Alert confirmacao = new Alert(Alert.AlertType.CONFIRMATION);
        confirmacao.setHeaderText("Cabeçalho");
        confirmacao.setContentText("Conteúdo");
        confirmacao.setTitle("Título");
        confirmacao.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        Optional<ButtonType> retorno = confirmacao.showAndWait();
        if(retorno.get() == ButtonType.YES){
            System.out.println("Clicou no botão SIM!");
        }else if(retorno.get() == ButtonType.NO){
            System.out.println("Clicou no botão NÃO!");
        }else{
            System.out.println("Clicou no botão CANCELAR!");
        }*/
        TextInputDialog leitura = new TextInputDialog();
        leitura.setHeaderText("Texto de cabeçalho");
        leitura.setContentText("Nome:");
        leitura.setTitle("Entre com seu nome");
        Optional<String> retorno = leitura.showAndWait();
        if(retorno.isPresent()){
            System.out.println("Bem vindo "+retorno.get());
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        clID.setCellValueFactory(new PropertyValueFactory("id"));
        clNome.setCellValueFactory(new PropertyValueFactory("nome"));
        clEmail.setCellValueFactory(new PropertyValueFactory("email"));
        clEndereco.setCellValueFactory(new PropertyValueFactory("endereco"));
        
        ObservableList<Pessoa> listaPessoa = FXCollections.observableArrayList();
        listaPessoa.add(new Pessoa(1, "Pessoa 1", "pessoa1@gmail.com", "Endereço pessoal"));
        listaPessoa.add(new Pessoa(2, "Pessoa 2", "pessoa2@gmail.com", "Endereço pessoal"));
        listaPessoa.add(new Pessoa(3, "Pessoa 3", "pessoa3@gmail.com", "Endereço pessoal"));
        tabelaPessoa.setItems(listaPessoa);
    }    
    
}
