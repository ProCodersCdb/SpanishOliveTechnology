package es.procoders.spanisholivetechnology.controllers;

import android.annotation.SuppressLint;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.beans.Pregunta;
import es.procoders.spanisholivetechnology.beans.Respuesta;
import es.procoders.spanisholivetechnology.beans.Usuario;
import es.procoders.spanisholivetechnology.dao.BiomasaDAO;

/**
 * Created by Apps on 10/11/2017.
 */

public class GeneralSingleton {
    /**
     *
     */


    private  static GeneralSingleton single;
    private ArrayList<Respuesta> respuesta;
    private int position;
    private android.support.v4.app.FragmentManager fragmentManager;
    private Usuario user;
    private ArrayList<Formulario> formularios;



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

    public ArrayList<Respuesta> getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(ArrayList<Respuesta> respuesta) {
        this.respuesta = respuesta;
    }




    public FragmentManager getFragmentManager() {
        return fragmentManager;
    }

    public void setFragmentManager(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }





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


}
