package es.procoders.spanisholivetechnology.beans;

/**
 * Created by Apps on 10/11/2017.
 */

public class Pregunta {
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
}
