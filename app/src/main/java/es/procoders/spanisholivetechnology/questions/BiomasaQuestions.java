package es.procoders.spanisholivetechnology.questions;


import android.app.Activity;
import android.app.VoiceInteractor;
import android.content.Context;
import android.content.res.Resources;

import java.lang.reflect.Array;
import java.util.ArrayList;

import es.procoders.spanisholivetechnology.R;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */


public class BiomasaQuestions {

    /**
     * Declaracion de variables utiles dentro de la clase
     */
    private ArrayList<Options> bioPreguntas = new ArrayList<>();
    private Context ctx;
    Resources res;

    public BiomasaQuestions(Context ctx) {

        /**
         * Constructor de BiomasaQuestions
         */
        this.ctx = ctx;
        res = ctx.getResources();
    }

    public ArrayList<Options> getBioPreguntas() {
        return rellenarBioPreguntas();
    }
    public void setBioPreguntas(ArrayList<Options> array){
        this.bioPreguntas = array;
    }

        /**
         * @see "ArrayList" El array se rellena con los diferentes tipos de preguntas
         * que posee el programa.
         */

    public ArrayList<Options> rellenarBioPreguntas() {
        bioPreguntas.add(new Options(res.getString(R.string.txtDetails1), false, R.layout.bio_details_1));
        bioPreguntas.add(new Options(res.getString(R.string.txtDetails2), true, R.layout.bio_details_2));
        bioPreguntas.add(new Options(res.getString(R.string.txtDetails3), true, R.layout.bio_details_3));
        bioPreguntas.add(new Options(res.getString(R.string.txtDetails4), false, R.layout.bio_details_4));
        bioPreguntas.add(new Options(res.getString(R.string.txtDetails5), true, R.layout.bio_details_5));
        bioPreguntas.add(new Options(res.getString(R.string.txtDetails6), true, R.layout.bio_details_6));
        bioPreguntas.add(new Options(res.getString(R.string.txtDetails7), false, R.layout.bio_details_7));
        bioPreguntas.add(new Options(res.getString(R.string.txtDetails8), false, R.layout.bio_details_8));
        return bioPreguntas;

    }
}
