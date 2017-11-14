package es.procoders.spanisholivetechnology.dao;

import android.content.Context;

import java.util.ArrayList;

import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.beans.Usuario;

/**
 * Created by joser on 13/11/2017.
 */

public interface IFormularioDAO {
    public Boolean crearFormulario (Formulario formulario);
    public ArrayList<Formulario> consultarFormularios (Usuario usuario, Context context);

}
