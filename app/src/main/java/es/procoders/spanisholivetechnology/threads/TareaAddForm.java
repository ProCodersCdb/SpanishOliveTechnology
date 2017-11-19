package es.procoders.spanisholivetechnology.threads;

import android.os.AsyncTask;

import java.sql.SQLException;

import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.dao.FormularioDAO;
import es.procoders.spanisholivetechnology.dao.IFormularioDAO;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public class TareaAddForm extends AsyncTask<Void, Void, Boolean> {

    private IFormularioDAO dao = new FormularioDAO();
    private Formulario formulario;

    public TareaAddForm(Formulario formulario) {
        this.formulario = formulario;
    }

    @Override
    protected Boolean doInBackground(Void... voids) {

        Boolean retVal = false;
        try{
            retVal = dao.crearFormulario(formulario);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return retVal;
    }
}
