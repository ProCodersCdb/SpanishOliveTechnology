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
        switch (i){
            case 0:
                i = R.layout.fragment_biomasa_fragment_details;
                break;
            case 1:
                i = R.layout.fragment_biomasa_fragment_details;
                break;
            case 2:
                i = R.layout.fragment_biomasa_fragment_details;
                break;
            case 3:
                i = R.layout.fragment_biomasa_fragment_details;
                break;
            case 4:
                i = R.layout.fragment_biomasa_fragment_details;
                break;
            case 5:
                i = R.layout.fragment_biomasa_fragment_details;
                break;
            case 6:
                i = R.layout.fragment_biomasa_fragment_details;
                break;
            default:
                i = R.layout.fragment_biomasa_fragment_details;
                break;
        }
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
        return biomasa;
    }

    public void setBiomasa(BiomasaBean biomasa) {
        this.biomasa = biomasa;
    }

    private BiomasaSingleton() {
    }

    public static BiomasaSingleton getInstance(){
        if( bio == null){
            bio = new BiomasaSingleton();
        }
        return bio;
    }
}
