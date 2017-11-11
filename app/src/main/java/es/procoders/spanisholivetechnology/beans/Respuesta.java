package es.procoders.spanisholivetechnology.beans;

import java.io.Serializable;

public class Respuesta implements Serializable{
    private Pregunta respuesta;
    private String str;

    public Respuesta(Pregunta respuesta, String str) {
        this.respuesta = respuesta;
        this.str = str;
    }

    public Pregunta getPregunta() {
        return respuesta;
    }

    public void setPregunta(Pregunta respuesta) {
        this.respuesta = respuesta;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

