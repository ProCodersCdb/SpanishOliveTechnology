package es.procoders.spanisholivetechnology.beans;

import java.io.Serializable;

/**
 * Created by bjfem on 11/11/2017.
 */

public class Usuario implements Serializable{

    private String email;
    private String nombre;
    private String phone;

    public Usuario(String email, String nombre, String phone) {
        this.email = email;
        this.nombre = nombre;
        this.phone = phone;
    }
}
