package es.procoders.spanisholivetechnology.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by joser on 13/11/2017.
 */

class DBConnection {

    //Propiedades
    private String dbUser;
    private String dbPass;
    private String urlServer;

    protected Connection conexionSQL = null;
    protected Statement stmt = null;
    protected PreparedStatement preparedStmt = null;
    protected ResultSet rs = null;
    protected String consultaSQL = "";

    //Constructor por defecto
    protected DBConnection() {
        dbUser = "root"; //TODO sustituir cadenas por strings dentro de los recursos
        dbPass = "010883"; //TODO sustituir cadenas por strings dentro de los recursos
        //urlServer = "jdbc:mariadb://192.168.1.36"; //TODO sustituir cadenas por strings dentro de los recursos
        urlServer = "jdbc:mariadb://10.20.32.115";
        //dbUser = " jperez_app";
        //dbPass = ")mSL!,^ub{7op{]1){p";
        //urlServer = "jdbc:mariadb://164.138.209.89/phpmyadmin";
    }

    protected void conectar() {
        //create connection for a server installed in localhost, with a user "root" with no password
        try {
            conexionSQL = DriverManager.getConnection(urlServer, dbUser, dbPass);
        }
         catch (SQLException e){
            e.printStackTrace();
        }
    }

    protected void desconectar() {
        try {
            if (rs != null) {
                rs.close();
            }
            if(stmt != null) {
                stmt.close();
            }
            if (conexionSQL != null) {
                conexionSQL.close();
            }
        } catch (SQLException e) {
                //Do nothing
        }
    }



}
