/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cimol
 */
public class aluno {
    private String nome;
    private String email;
    private int id;
    private String matricula;
    private String dataNascimento;
    private Connection connection;

    public aluno(String nome, String email, int id, String matricula, String dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.id = id;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }
    
    public aluno() {
        
    }

    public aluno(Connection connection) {
        this.connection = connection;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public void setConnection(Connection connection){
        this.connection = connection;
    }
    
    public ResultSet getListaAlunos() throws SQLException{
        String sql = "select id,"
                + "Nome,"
                + "Email,"
                + "Matricula,"
                + "DataNascimento"
                + " from aluno";
        PreparedStatement request = this.connection.prepareStatement(sql);
        return request.executeQuery();  
    }
    public void setAluno() throws SQLException{
        String sql = "insert into aluno(Nome,"
                + "Matricula,"
                + "DataNascimento,"
                + "Email"
                + ") values (?, ?, ?, ?)";
        PreparedStatement request;
        request = this.connection.prepareStatement(sql);
        request.setString(1, this.nome);
        request.setString(2, this.matricula);
        request.setString(3, this.dataNascimento);
        request.setString(4, this.email);
        request.executeUpdate();
        request.close();
    }
    public void updateAluno() throws SQLException{
        String sql = "update aluno set Nome=?,"
                + "Matricula=?,"
                + "Email=?,"
                + "DataNascimento=? where id=?";
        PreparedStatement request = this.connection.prepareStatement(sql);
        request.setString(1, this.nome);
        request.setString(2, this.matricula);
        request.setString(3, this.email);
        request.setString(4, this.dataNascimento);
        request.setInt(5, this.id);
        System.out.print(request);
        request.executeUpdate();
        request.close();   
    }   
    public void deleteAluno(int id) throws SQLException{
        String sql = "delete from aluno where id = ?";
        PreparedStatement request = this.connection.prepareStatement(sql);
        request.setInt(1, id);
        request.executeUpdate();
        request.close();      
    }
}
