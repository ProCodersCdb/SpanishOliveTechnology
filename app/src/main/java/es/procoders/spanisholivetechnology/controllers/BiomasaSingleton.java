package es.procoders.spanisholivetechnology.controllers;

import java.util.ArrayList;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.BiomasaBean;
import es.procoders.spanisholivetechnology.questions.BiomasaQuestions;
import es.procoders.spanisholivetechnology.questions.Options;

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
    private ArrayList<Options> bioQ;

    public ArrayList<Options> getBioQ() {
        return bioQ;

    }

    public void setBioQ(ArrayList<Options> arraybioQ) {
        if (bioQ==null) {
            this.bioQ = arraybioQ;
        }

    }

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
