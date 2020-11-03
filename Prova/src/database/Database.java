/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mateus
 */
public class Database {
    private boolean connectionStatus = false;
    private Connection connection;
    private String alertError;
    private String driverName = "com.mysql.cj.jdbc.Driver";
    private String serverName = "localhost";
    private String serverPort = "3307";
    private String userName = "root";
    private String password = "vertrigo";
    private String nomeBanco = "alunos";
    private String url = "jdbc:mysql://"+this.serverName+":"+this.serverPort+"/"+this.nomeBanco+"?autoReconnect=true&useSSL=false&useTimezone=true&serverTimezone=UTC";

    
    public boolean getConnectionStatus() {
        return connectionStatus;
    }

    public Connection getConnection() {
        return connection;
    }

    public String getAlertError() {
        return alertError;
    }
    public void startConnection(){
        try{
            Class.forName(this.driverName);
            this.connection = DriverManager.getConnection(this.url, this.userName, this.password);
            this.connectionStatus = true;
        }
        catch(ClassNotFoundException | SQLException ex){
            this.alertError = ex.toString();
            this.connectionStatus = false;
        }
    }
    public void endConnection(){
        try{
            this.connection.close();
        }
        catch(SQLException ex){
            this.alertError = "Não foi possível encerrar a conexão "+ex;
        }
    }
}
