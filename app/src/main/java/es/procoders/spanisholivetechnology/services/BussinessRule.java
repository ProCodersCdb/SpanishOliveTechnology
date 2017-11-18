package es.procoders.spanisholivetechnology.services;

import java.util.ArrayList;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

//Interfaz que declara el funcionamiento genérico de una regla de negocio
public interface BussinessRule<T> {
    Boolean isReady(ArrayList<T> t);
    /**
     *
     */
}
