package es.procoders.spanisholivetechnology.dao;

import android.content.Context;

import java.util.ArrayList;

import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.beans.Usuario;

/**
 * Created by joser on 13/11/2017.
 */

public interface IFormularioDAO {
     Boolean crearFormulario (Formulario formulario);
     ArrayList<Formulario> consultarFormularios (Usuario usuario, Context context);
     Boolean upgradeForm (Formulario formulario);

}
