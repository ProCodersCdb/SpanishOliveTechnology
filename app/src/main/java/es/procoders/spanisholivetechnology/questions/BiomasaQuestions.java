package es.procoders.spanisholivetechnology.questions;


import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

import es.procoders.spanisholivetechnology.R;


public class BiomasaQuestions {
    private ArrayList<Options> bioPreguntas = new ArrayList<>();
    private Context ctx;
    Resources res;

    public BiomasaQuestions() {
    }

    public BiomasaQuestions(Context ctx) {
        this.ctx = ctx;
        res = ctx.getResources();
    }

    public ArrayList<Options> getBioPreguntas() {
        return rellenarBioPreguntas();
    }

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
