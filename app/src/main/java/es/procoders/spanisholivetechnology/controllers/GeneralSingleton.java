package es.procoders.spanisholivetechnology.controllers;

import android.annotation.SuppressLint;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import es.procoders.spanisholivetechnology.beans.Pregunta;
import es.procoders.spanisholivetechnology.beans.Respuesta;

/**
 * Created by Apps on 10/11/2017.
 */

public class GeneralSingleton {
    /**
     *
     */


    private  static GeneralSingleton single;
    private ArrayList<Respuesta> respuesta;

    public ArrayList<Respuesta> getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(ArrayList<Respuesta> respuesta) {
        this.respuesta = respuesta;
    }

    private Map<Pregunta, Respuesta> mapa;


    public FragmentManager getFragmentManager() {
        return fragmentManager;
    }

    public void setFragmentManager(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    private android.support.v4.app.FragmentManager fragmentManager;


    @SuppressLint("UseSparseArrays")
    private GeneralSingleton(){
        mapa = new TreeMap<>();
    }




    public Map<Pregunta, Respuesta> getMapa() {
        return mapa;
    }

    public void setMapa(Map<Pregunta, Respuesta> mapa) {
        this.mapa = mapa;
    }


    public static GeneralSingleton getInstance(){
        if (single == null){
            single = new GeneralSingleton();
        }
        return single;
    }


}
