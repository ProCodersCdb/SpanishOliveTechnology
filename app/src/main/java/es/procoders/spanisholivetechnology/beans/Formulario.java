package es.procoders.spanisholivetechnology.beans;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by bjfem on 11/11/2017.
 */

public class Formulario implements Serializable {
//Bean del formulario, el cual registramos en la BBDD.
    private TipoRespuesta tipo;
    private Usuario user;
    private ArrayList<Respuesta> respuestas;
    private String date;
    private String estado;

    public Formulario() {
    }

    public void setTipo(TipoRespuesta tipo) {
        this.tipo = tipo;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public void setRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TipoRespuesta getTipo() {
        return tipo;
    }

    public Usuario getUser() {
        return user;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    public String getDate() {
        return date;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
