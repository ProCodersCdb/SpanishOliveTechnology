package es.procoders.spanisholivetechnology.controllers;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.BiomasaBean;

public class BiomasaSingleton {


    private  static BiomasaSingleton bio;
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int i) {
       this.position = i;
    }

    private BiomasaBean biomasa;

    public static BiomasaSingleton getBio() {
        return bio;
    }

    public static void setBio(BiomasaSingleton bio) {
        BiomasaSingleton.bio = bio;
    }

    public BiomasaBean getBiomasa() {
        if (biomasa==null){
            biomasa= new BiomasaBean();
        }
        return biomasa;
    }

    public void setBiomasa(BiomasaBean biomasa) {
        this.biomasa = biomasa;
    }

    public BiomasaSingleton() {
    }

    public static BiomasaSingleton  getInstance() {
        if(bio == null){
            bio = new BiomasaSingleton();
        }
        return  bio;
    }

}
