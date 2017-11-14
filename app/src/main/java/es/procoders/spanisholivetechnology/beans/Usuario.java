package es.procoders.spanisholivetechnology.beans;

import java.io.Serializable;


public class Usuario implements Serializable{

    //Propiedades
    private String email;
    private String nombre;
    private String pass;

    //Constructores
    public Usuario() {
    }

    public Usuario(String email, String nombre, String pass) {
        this.email = email;
        this.nombre = nombre;
        this.pass = pass;
    }

    //Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
