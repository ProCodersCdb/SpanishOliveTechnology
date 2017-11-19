package es.procoders.spanisholivetechnology.controllers;

import android.support.v4.app.FragmentManager;

import java.util.ArrayList;

import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.beans.Usuario;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public class GeneralSingleton {

    private  static GeneralSingleton single;
    private int position;
    private android.support.v4.app.FragmentManager fragmentManager;
    private Usuario user;
    private ArrayList<Formulario> formularios;
    private int positionformulario;


    private GeneralSingleton(){
    }

    public static GeneralSingleton getInstance(){
        if (single == null){
            single = new GeneralSingleton();
        }
        return single;
    }

    public void resetSingleton(){
        single= new GeneralSingleton();
    }

    public int getPositionformulario() {
        return positionformulario;
    }

    public void setPositionformulario(int positionformulario) {
        this.positionformulario = positionformulario;
    }

    public ArrayList<Formulario> getFormularios() {
        return formularios;
    }

    public void setFormularios(ArrayList<Formulario> formularios) {
        this.formularios = formularios;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public FragmentManager getFragmentManager() {
        return fragmentManager;
    }

    public void setFragmentManager(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }


}
