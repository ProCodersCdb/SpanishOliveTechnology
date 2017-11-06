package es.procoders.spanisholivetechnology.questions;




import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;

import es.procoders.spanisholivetechnology.R;


public class BiomasaQuestions {
    private ArrayList<String> bioPreguntas=new ArrayList<>();
    private Context ctx;
    Resources res;

    public BiomasaQuestions() {
    }

    public BiomasaQuestions(Context ctx) {
        this.ctx = ctx;
        res= ctx.getResources();
    }

    public ArrayList<String> getBioPreguntas() {
        return rellenarBioPreguntas();
    }

    public ArrayList<String> rellenarBioPreguntas(){


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
