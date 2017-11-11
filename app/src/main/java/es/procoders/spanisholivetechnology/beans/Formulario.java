package es.procoders.spanisholivetechnology.beans;

import java.io.Serializable;
import java.util.ArrayList;

import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;

/**
 * Created by bjfem on 11/11/2017.
 */

public class Formulario implements Serializable {

    private TipoRespuesta tipo;
    private Usuario user;
    private ArrayList<Respuesta> respuestas;


}
