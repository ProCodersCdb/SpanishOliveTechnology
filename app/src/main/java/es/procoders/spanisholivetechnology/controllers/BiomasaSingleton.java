package es.procoders.spanisholivetechnology.controllers;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.BiomasaBean;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class BiomasaSingleton {

    /**
     *
     */


    private  static BiomasaSingleton bio;
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int i) {
        switch (i){
            case 0:
                i = R.layout.bio_details_1;
                break;
            case 1:
                i = R.layout.bio_details_2;
                break;
            case 2:
                i = R.layout.bio_details_3;
                break;
            case 3:
                i = R.layout.bio_details_4;
                break;
            case 4:
                i = R.layout.bio_details_5;
                break;
            case 5:
                i = R.layout.bio_details_6;
                break;
            case 6:
                i = R.layout.bio_details_7;
                break;
            default:
                i = R.layout.bio_details_8;
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
