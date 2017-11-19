package es.procoders.spanisholivetechnology.threads;

import android.content.Context;
import android.os.AsyncTask;

import java.sql.SQLException;
import java.util.ArrayList;

import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.beans.Usuario;
import es.procoders.spanisholivetechnology.dao.FormularioDAO;
import es.procoders.spanisholivetechnology.dao.IFormularioDAO;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public class TareaReadForms extends AsyncTask<Void, Void, ArrayList<Formulario>> {

    private IFormularioDAO dao = new FormularioDAO();
    private Usuario usuario;
    private Context contexto;

    public TareaReadForms(Usuario usuario, Context context) {
        this.usuario = usuario;
        this.contexto = context;
    }

    @Override
    protected ArrayList<Formulario> doInBackground(Void... voids) {
        ArrayList<Formulario> formularios = new ArrayList<>();
        try {
            formularios = dao.consultarFormularios(usuario, contexto);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return formularios;
    }
}
