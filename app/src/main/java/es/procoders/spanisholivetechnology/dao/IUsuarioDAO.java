package es.procoders.spanisholivetechnology.dao;

import java.sql.SQLException;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public interface IUsuarioDAO {

//    public Boolean crearUsuario(String email, String pass) throws SQLException;
    public Boolean crearUsuario(String email, String pass, String datos) throws SQLException;
    public Boolean actualizarPass(String email, String pass) throws SQLException;
    public Boolean comprobarPass(String email, String pass) throws SQLException;
}
