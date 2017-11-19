package es.procoders.spanisholivetechnology.threads;

import android.os.AsyncTask;

import java.sql.SQLException;

import es.procoders.spanisholivetechnology.dao.IUsuarioDAO;
import es.procoders.spanisholivetechnology.dao.UsuarioDAO;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public class TareaRegister extends AsyncTask<Void, Void, Boolean> {

    private IUsuarioDAO dao = new UsuarioDAO();
    private String email;
    private String pass;
    private String name;

    public TareaRegister(String email, String pass, String name) {
        this.email = email;
        this.pass = pass;
        this.name = name;
    }

    @Override
    protected Boolean doInBackground(Void... voids) {
        Boolean retVal = false;
        try{
            retVal = dao.crearUsuario(email,pass,name);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return retVal;
    }
}
