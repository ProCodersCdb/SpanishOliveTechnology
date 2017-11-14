package es.procoders.spanisholivetechnology.dao;

/**
 * Created by joser on 13/11/2017.
 */

public interface IUsuarioDAO {

    public Boolean crearUsuario(String email, String pass);
    public Boolean crearUsuario(String email, String pass, String datos);
    public Boolean actualizarPass(String email, String pass);
    public Boolean comprobarPass(String email, String pass);
}
