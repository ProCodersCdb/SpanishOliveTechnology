package es.procoders.spanisholivetechnology.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;

/**
 * Created by bjfem on 11/11/2017.
 */

public class Formulario implements Serializable {

    private TipoRespuesta tipo;
    private Usuario user;
    private ArrayList<Respuesta> respuestas;
    private Date date;

    public TipoRespuesta getTipo() {
        return tipo;
    }

    public Usuario getUser() {
        return user;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    public Date getDate() {
        return date;
    }

    public Formulario(TipoRespuesta tipo, Usuario user, ArrayList<Respuesta> respuestas, Date date) {
        this.tipo = tipo;
        this.user = user;
        this.respuestas = respuestas;
        this.date = date;

    }
}
