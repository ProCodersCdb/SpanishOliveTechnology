package es.procoders.spanisholivetechnology.beans;

import android.support.annotation.NonNull;

import java.io.Serializable;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public class Pregunta implements Comparable<Pregunta>, Serializable {

    private TipoRespuesta tipo;
    private String str;
    private boolean requerido;
    private int layout;

    public Pregunta(TipoRespuesta tipo, String str, boolean requerido, int layout) {
        this.tipo = tipo;
        this.str = str;
        this.requerido = requerido;
        this.layout = layout;
    }
    public boolean isRequired() {
        return requerido;
    }

    public TipoRespuesta getTipo() {
        return tipo;
    }

    public String getStr() {
        return str;
    }

    public int getLayout() {
        return layout;
    }

    @Override
    public int compareTo(@NonNull Pregunta pregunta) {
        return str.compareTo(pregunta.getStr());
    }
}
