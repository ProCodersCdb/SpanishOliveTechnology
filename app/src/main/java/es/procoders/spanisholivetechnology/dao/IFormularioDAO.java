package es.procoders.spanisholivetechnology.dao;

import android.content.Context;

import java.sql.SQLException;
import java.util.ArrayList;

import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.beans.Usuario;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public interface IFormularioDAO {
     Boolean crearFormulario (Formulario formulario) throws SQLException;
     ArrayList<Formulario> consultarFormularios (Usuario usuario, Context context) throws SQLException;
     Boolean upgradeForm (Formulario formulario) throws SQLException;

}
