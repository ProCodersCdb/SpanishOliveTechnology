package es.procoders.spanisholivetechnology.questions;


import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.Pregunta;
import es.procoders.spanisholivetechnology.beans.Respuesta;
import es.procoders.spanisholivetechnology.beans.TipoRespuesta;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */


public class Questions implements GeneralControler {
    /**
     * Declaracion de variables utiles dentro de la clase
     */
    private ArrayList<Respuesta> bioPreguntas = new ArrayList<>();
    private Context ctx;
    Resources res;

    public Questions(Context ctx) {
        this.ctx = ctx;
        res = ctx.getResources();
    }

    @Override
    public ArrayList<Respuesta> getBiomasa() {
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.txtDetails1), false, R.layout.bio_details_1), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.txtDetails2), true, R.layout.bio_details_2), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.txtDetails3), true, R.layout.bio_details_3), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.txtDetails4), false, R.layout.bio_details_4), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.txtDetails5), false, R.layout.bio_details_5), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.txtDetails6), true, R.layout.bio_details_6), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.txtDetails7), true, R.layout.bio_details_7), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.txtDetails8), false, R.layout.bio_details_8), null));
        return bioPreguntas;
    }

    @Override
    public ArrayList<Respuesta> getPlantacion() {
        return null;
    }

    @Override
    public ArrayList<Respuesta> getFabricaAceituna() {
        return null;
    }

    @Override
    public ArrayList<Respuesta> getComercioAceite() {
        return null;
    }

    @Override
    public ArrayList<Respuesta> getComercioAceituna() {
        return null;
    }

    @Override
    public ArrayList<Respuesta> getAlmazara() {
        return null;
    }
}
