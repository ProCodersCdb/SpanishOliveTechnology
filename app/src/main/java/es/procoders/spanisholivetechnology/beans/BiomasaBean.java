package es.procoders.spanisholivetechnology.beans;

import java.io.Serializable;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */
public class BiomasaBean implements Serializable {

    //Propiedades
    private String bioQ1;
    private String bioQ2;
    private String bioQ3;
    private String bioQ4;
    private Float bioQ5;
    private String bioQ6;
    private String bioQ7;
    private String bioQ8;

    /**
     * Se declaran las variables que representan a las diferentes preguntas del apartado biomasa
     * de la aplicacion. Se declaran sus getters y setters así como los hash code y equals para
     * poder trabajar con ellos
     */

    //Constructor por defecto
    public BiomasaBean() {
    }

    //Getters & Setters
    public String getBioQ1() {
        return bioQ1;
    }

    public void setBioQ1(String bioQ1) {
        this.bioQ1 = bioQ1;
    }

    public String getBioQ2() {
        return bioQ2;
    }

    public void setBioQ2(String bioQ2) {
        this.bioQ2 = bioQ2;
    }

    public String getBioQ3() {
        return bioQ3;
    }

    public void setBioQ3(String bioQ3) {
        this.bioQ3 = bioQ3;
    }

    public String getBioQ6() {
        return bioQ6;
    }

    public void setBioQ6(String bioQ6) {
        this.bioQ6 = bioQ6;
    }

    public String getBioQ4() {
        return bioQ4;

    }

    public void setBioQ4(String bioQ4) {
        this.bioQ4 = bioQ4;
    }

    public Float getBioQ5() {return bioQ5;}

    public void setBioQ5(Float bioQ5) {this.bioQ5 = bioQ5;}

    public String getBioQ7() {
        return bioQ7;
    }

    public void setBioQ7(String bioQ7) {
        this.bioQ7 = bioQ7;
    }

    public String getBioQ8() {
        return bioQ8;
    }

    public void setBioQ8(String bioQ8) {
        this.bioQ8 = bioQ8;
    }

    //Equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BiomasaBean that = (BiomasaBean) o;

        if (bioQ1 != null ? !bioQ1.equals(that.bioQ1) : that.bioQ1 != null) return false;
        if (bioQ2 != null ? !bioQ2.equals(that.bioQ2) : that.bioQ2 != null) return false;
        if (bioQ3 != null ? !bioQ3.equals(that.bioQ3) : that.bioQ3 != null) return false;
        if (bioQ4 != null ? !bioQ4.equals(that.bioQ4) : that.bioQ4 != null) return false;
        if (bioQ5 != null ? !bioQ5.equals(that.bioQ5) : that.bioQ5 != null) return false;
        if (bioQ6 != null ? !bioQ6.equals(that.bioQ6) : that.bioQ6 != null) return false;
        if (bioQ7 != null ? !bioQ7.equals(that.bioQ7) : that.bioQ7 != null) return false;
        return bioQ8 != null ? bioQ8.equals(that.bioQ8) : that.bioQ8 == null;
    }

    @Override
    public int hashCode() {
        int result = bioQ1 != null ? bioQ1.hashCode() : 0;
        result = 31 * result + (bioQ2 != null ? bioQ2.hashCode() : 0);
        result = 31 * result + (bioQ3 != null ? bioQ3.hashCode() : 0);
        result = 31 * result + (bioQ4 != null ? bioQ4.hashCode() : 0);
        result = 31 * result + (bioQ5 != null ? bioQ5.hashCode() : 0);
        result = 31 * result + (bioQ6 != null ? bioQ6.hashCode() : 0);
        result = 31 * result + (bioQ7 != null ? bioQ7.hashCode() : 0);
        result = 31 * result + (bioQ8 != null ? bioQ8.hashCode() : 0);
        return result;
    }
}

