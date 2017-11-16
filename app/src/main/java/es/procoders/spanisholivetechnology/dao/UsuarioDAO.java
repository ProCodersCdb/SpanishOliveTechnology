package es.procoders.spanisholivetechnology.dao;

import java.sql.SQLException;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public class UsuarioDAO extends DBConnection implements IUsuarioDAO {

    //Propiedades
    private String table = "jperez_app.usuarios";

    //TODO Pasar el nombre de la tabla a una constante
    //Constructor
    public UsuarioDAO() {
        super();
    }

    //Métodos
    @Override
    public Boolean crearUsuario (String email, String pass){
        Boolean retVal = false;
        try {
            conectar();
            consultaSQL = "INSERT INTO "+table+" SET email='"+email+"', pass='"+pass+"'";
            retVal = conexionSQL.createStatement().execute(consultaSQL);
            desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return retVal;
    }

    @Override
    public Boolean crearUsuario(String email, String pass, String datos) {
        //TODO comprobar true or false en .execute
        Boolean retVal = true;
        try {
            conectar();
            consultaSQL = "INSERT INTO "+table+" SET email='"+email+"', pass='"+pass+"', data='"+datos+"'";
            retVal = conexionSQL.createStatement().execute(consultaSQL);
            desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return !retVal;
    }

    @Override
    public Boolean actualizarPass(String email, String pass) {
        Boolean retVal = false;
        try {
            conectar();
            consultaSQL = "update "+table+" set pass='"+pass+"' WHERE email = '"+email+"'";
            if (conexionSQL.createStatement().executeUpdate(consultaSQL)==1) {
                retVal = true;
            }
            desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return retVal;
    }

    @Override
    public Boolean comprobarPass(String email, String pass) {
        Boolean retVal = false;
        try {
            conectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        consultaSQL = "SELECT pass FROM "+table+" WHERE email = '"+email+"'";
        try {
            stmt = conexionSQL.createStatement();
            rs = stmt.executeQuery(consultaSQL);
            rs.next();
            retVal = pass.equals(rs.getString("pass"));
            desconectar();
        }catch (Exception e){
            System.out.printf(e.getMessage());
        }

        return retVal;
    }
}
