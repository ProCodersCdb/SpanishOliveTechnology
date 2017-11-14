package es.procoders.spanisholivetechnology.beans;

import java.io.Serializable;


public class Usuario implements Serializable{

    private String email;
    private String nombre;
    private String pass;

    public Usuario(String email, String nombre, String password) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNombre(String nombre, String pass) {
        this.nombre = nombre;
        this.pass = pass;
    }

    public Usuario() {

    }

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

    public String getPassword() {
        return pass;
    }

    public void setPassword(String password) {
        this.pass = password;
    }
}
