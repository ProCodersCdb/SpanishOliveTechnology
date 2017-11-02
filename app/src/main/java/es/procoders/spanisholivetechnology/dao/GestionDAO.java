package es.procoders.spanisholivetechnology.dao;

import android.content.Context;


/**
 * Created by Jose on 31/10/2017.
 */

public interface GestionDAO<T> {

    //Método que guarda en local el objeto pasado como parámetro
    public void guardarLocal (T e, Context c);

    //Método que recupera, si existe, el objeto previamente guardado
    public T recuperarLocal (Context c);

}
