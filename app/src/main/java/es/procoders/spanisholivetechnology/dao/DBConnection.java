package es.procoders.spanisholivetechnology.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
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
        dbUser = "jperez_app";
        dbPass = ")mSL!,^ub{7op{]1){p";
        urlServer = "jdbc:mariadb://164.138.209.89/";
    }

    protected void conectar() {
        //create connection to a server in "urlServer", with a user "dbUser" using password "dbPass"
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conexionSQL = DriverManager.getConnection(urlServer, dbUser, dbPass);
        }
         catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
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
