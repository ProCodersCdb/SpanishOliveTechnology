package es.procoders.spanisholivetechnology.dao;

import android.content.Context;


/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public interface GestionDAO<T> {

    /**
     * @param e parametro usado en metodo guardarLocal. Este método guarda en local el objeto pasado
     *          como parametro
     * @param c parametro usado en metodo recuperarLocal. Este método comprueba que existe un objeto
     *          ya guardado y en caso afirmativo lo recupera
     */

    public void guardarLocal (T e, Context c);


    public T recuperarLocal (Context c);

}
