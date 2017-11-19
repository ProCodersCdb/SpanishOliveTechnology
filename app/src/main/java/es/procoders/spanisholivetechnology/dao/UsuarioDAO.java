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
    public Boolean crearUsuario(String email, String pass, String datos) throws SQLException {

        Boolean retVal = true;
        try {
            conectar();
            consultaSQL = "INSERT INTO "+table+" SET email='"+email+"', pass='"+pass+"', data='"+datos+"'";
            retVal = conexionSQL.createStatement().execute(consultaSQL);
            desconectar();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return !retVal;
    }

    //No implementado aún en la aplicación
    @Override
    public Boolean actualizarPass(String email, String pass) throws SQLException {
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
            throw e;
        }

        return retVal;
    }

    @Override
    public Boolean comprobarPass(String email, String pass) throws SQLException {
        Boolean retVal = false;
        try {
            conectar();
            consultaSQL = "SELECT pass FROM "+table+" WHERE email = '"+email+"'";
            stmt = conexionSQL.createStatement();
            rs = stmt.executeQuery(consultaSQL);
            rs.next();
            retVal = pass.equals(rs.getString("pass"));
            desconectar();
        }catch (SQLException e){
            e.printStackTrace();
            throw e;
        }
        return retVal;
    }
}
