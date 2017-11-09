package es.procoders.spanisholivetechnology.questions;


import android.content.Context;
import android.content.res.Resources;

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
        bioPreguntas.add(new Options(res.getString(R.string.bioQTittle1), false, R.layout.bio_details_1));
        bioPreguntas.add(new Options(res.getString(R.string.bioQTittle2), true, R.layout.bio_details_2));
        bioPreguntas.add(new Options(res.getString(R.string.bioQTittle3), true, R.layout.bio_details_3));
        bioPreguntas.add(new Options(res.getString(R.string.bioQTittle4), false, R.layout.bio_details_4));
        bioPreguntas.add(new Options(res.getString(R.string.bioQTittle5), true, R.layout.bio_details_5));
        bioPreguntas.add(new Options(res.getString(R.string.bioQTittle6), true, R.layout.bio_details_6));
        bioPreguntas.add(new Options(res.getString(R.string.bioQTittle7), false, R.layout.bio_details_7));
        bioPreguntas.add(new Options(res.getString(R.string.bioQTittle8), false, R.layout.bio_details_8));
        return bioPreguntas;

    }
}
