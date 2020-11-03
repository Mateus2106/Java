/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cimol
 */
public class BancoDados {
    private boolean statusConexao;
    private Connection conexao;
    private String mensagemErro;
    private String nomeDriver = "com.mysql.cj.jdbc.Driver";
    private String nomeServidor = "localhost";
    private String portaServidor = "3307";
    private String nomeUsuario = "mateus";
    private String senha = "@mateus";
    private String nomeBanco = "mateus";
    private String url;
    
    public BancoDados(){
        url = "jds bc:mysql://" + this.nomeServidor;
        url += ":" + this.portaServidor + "/" + this.nomeBanco;
        url += "?autoreconnect=true&useSSL=false&useTimezone=true&serverTimezone=UTC";
        this.realizaConexao();
    }
    
    public boolean getStatusConexao(){
        return statusConexao;
    }
    
    public Connection getConexao(){
        return conexao;
    }
    
    public String getMensagemErro(){
        return mensagemErro;
    }
    
    public void realizaConexao(){
        try{
            Class.forName(this.nomeDriver);
            this.conexao = DriverManager.getConnection(this.url, this.nomeUsuario, this.senha);
            this.statusConexao = true;
        }catch(ClassNotFoundException ex){
            this.mensagemErro = ex.toString();
            this.statusConexao = false;
        }
        catch(SQLException ex){
            this.mensagemErro = ex.toString();
            this.statusConexao = false;
        }
    }
}
