package es.procoders.spanisholivetechnology.beans;

import java.io.Serializable;


public class Usuario implements Serializable{

    private String email;
    private String nombre;
    private String pass;

    public Usuario(){
    }

    public Usuario(String email, String nombre, String pass) {
        this.email = email;
        this.nombre = nombre;
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
