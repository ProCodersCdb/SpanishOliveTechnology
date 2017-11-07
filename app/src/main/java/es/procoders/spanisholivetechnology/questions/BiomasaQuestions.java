package es.procoders.spanisholivetechnology.questions;




import android.app.Activity;
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

    private ArrayList<String> bioPreguntas=new ArrayList<>();
    private Context ctx;
    Resources res;


    public BiomasaQuestions() {
    }

    public BiomasaQuestions(Context ctx) {

        /**
         * Constructor de BiomasaQuestions
         */
        this.ctx = ctx;
        res= ctx.getResources();
    }

    public ArrayList<String> getBioPreguntas() {
        return rellenarBioPreguntas();
    }

    public ArrayList<String> rellenarBioPreguntas(){

        /**
         * @see "ArrayList" El array se rellena con los diferentes tipos de preguntas
         * que posee el programa.
         */

        bioPreguntas.add(res.getString(R.string.txtDetails1));
        bioPreguntas.add(res.getString(R.string.txtDetails2));
        bioPreguntas.add(res.getString(R.string.txtDetails3));
        bioPreguntas.add(res.getString(R.string.txtDetails4));
        bioPreguntas.add(res.getString(R.string.txtDetails5));
        bioPreguntas.add(res.getString(R.string.txtDetails6));
        bioPreguntas.add(res.getString(R.string.txtDetails7));
        bioPreguntas.add(res.getString(R.string.txtDetails8));

        return bioPreguntas;

    }
}
