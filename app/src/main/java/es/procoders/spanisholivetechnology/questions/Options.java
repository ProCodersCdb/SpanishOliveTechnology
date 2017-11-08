package es.procoders.spanisholivetechnology.questions;

import android.text.Layout;

/**
 * Created by Apps on 07/11/2017.
 */

public class Options {

    private String tituloOpcion;
    private boolean required;
    private int layout;
    private String description;

    public Options(String tituloOpcion, boolean required, int layout) {
        this.tituloOpcion = tituloOpcion;
        this.required = required;
        this.layout = layout;
    }
    public Options(){

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public String getTituloOpcion() {
        return tituloOpcion;
    }

    public void setTituloOpcion(String tituloOpcion) {
        this.tituloOpcion = tituloOpcion;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    @Override
    public String toString() {
        return "Options{" +
                "tituloOpcion='" + tituloOpcion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Options)) return false;

        Options options = (Options) o;

        if (required != options.required) return false;
        if (layout != options.layout) return false;
        return tituloOpcion != null ? tituloOpcion.equals(options.tituloOpcion) : options.tituloOpcion == null;
    }

    @Override
    public int hashCode() {
        int result = tituloOpcion != null ? tituloOpcion.hashCode() : 0;
        result = 31 * result + (required ? 1 : 0);
        result = 31 * result + layout;
        return result;
    }
}
