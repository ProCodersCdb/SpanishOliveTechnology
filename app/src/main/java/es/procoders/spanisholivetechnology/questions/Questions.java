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
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQTittle1), false, R.layout.bio_details_1), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQTittle2), true, R.layout.bio_details_2), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQTittle3), true, R.layout.bio_details_3), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQTittle4), false, R.layout.bio_details_4), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQTittle5), false, R.layout.bio_details_5), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQTittle6), true, R.layout.bio_details_6), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQTittle7), true, R.layout.bio_details_7), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQTittle8), false, R.layout.bio_details_8), null));
        return bioPreguntas;
    }
}
