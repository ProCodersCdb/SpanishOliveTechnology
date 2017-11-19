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

public class TareaLogin extends AsyncTask<Void, Void, Boolean> {

    private IUsuarioDAO dao = new UsuarioDAO();
    private String email;
    private String pass;

    public TareaLogin(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    @Override
    protected Boolean doInBackground(Void... voids) {
        Boolean retVal = false;
        try{
            retVal = dao.comprobarPass(email,pass);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return retVal;
    }

}
