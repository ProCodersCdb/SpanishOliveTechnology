package es.procoders.spanisholivetechnology.dao;

import android.content.Context;


/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public interface GestionDAO<T> {

    public void guardarLocal (T e, Context c);
    public T recuperarLocal (Context c);

}
