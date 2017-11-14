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
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQ1), false, R.layout.bio_details_1), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQ2), true, R.layout.bio_details_2), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQ3), true, R.layout.bio_details_3), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQ4), false, R.layout.bio_details_4), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQ5), false, R.layout.bio_details_5), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQ6), true, R.layout.bio_details_6), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQ7), true, R.layout.bio_details_7), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.BIOMASA, res.getString(R.string.bioQ8), false, R.layout.bio_details_8), null));
        return bioPreguntas;
    }

    @Override
    public ArrayList<Respuesta> getPlantacion() {
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.PLANTACION, res.getString(R.string.plantacionQ1), true, R.layout.plantacion_details_1), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.PLANTACION, res.getString(R.string.plantacionQ2), true, R.layout.plantacion_details_2), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.PLANTACION, res.getString(R.string.plantacionQ3), true, R.layout.plantacion_details_3), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.PLANTACION, res.getString(R.string.plantacionQ4), true, R.layout.plantacion_details_4), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.PLANTACION, res.getString(R.string.plantacionQ5), true, R.layout.plantacion_details_5), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.PLANTACION, res.getString(R.string.plantacionQ6), false, R.layout.plantacion_details_6), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.PLANTACION, res.getString(R.string.plantacionQ7), false, R.layout.plantacion_details_7), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.PLANTACION, res.getString(R.string.plantacionQ8), false, R.layout.plantacion_details_8), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.PLANTACION, res.getString(R.string.plantacionQ9), false, R.layout.plantacion_details_9), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.PLANTACION, res.getString(R.string.plantacionQ10), false, R.layout.plantacion_details_10), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.PLANTACION, res.getString(R.string.plantacionQ11), false, R.layout.plantacion_details_11), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.PLANTACION, res.getString(R.string.plantacionQ12), false, R.layout.plantacion_details_12), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.PLANTACION, res.getString(R.string.plantacionQ13), false, R.layout.plantacion_details_13), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.PLANTACION, res.getString(R.string.plantacionQ14), false, R.layout.plantacion_details_14), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.PLANTACION, res.getString(R.string.plantacionQ15), false, R.layout.plantacion_details_15), null));
        return bioPreguntas;
    }

    @Override
    public ArrayList<Respuesta> getFabricaAceituna() {
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.FABRICAACEITUNA, res.getString(R.string.fabricaQ1), true, R.layout.fabricaaceitunamesa_details_1), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.FABRICAACEITUNA, res.getString(R.string.fabricaQ2), true, R.layout.fabricaaceitunamesa_details_2), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.FABRICAACEITUNA, res.getString(R.string.fabricaQ3), true, R.layout.fabricaaceitunamesa_details_3), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.FABRICAACEITUNA, res.getString(R.string.fabricaQ4), true, R.layout.fabricaaceitunamesa_details_4), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.FABRICAACEITUNA, res.getString(R.string.fabricaQ5), true, R.layout.fabricaaceitunamesa_details_5), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.FABRICAACEITUNA, res.getString(R.string.fabricaQ6), false, R.layout.fabricaaceitunamesa_details_6), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.FABRICAACEITUNA, res.getString(R.string.fabricaQ7), true, R.layout.fabricaaceitunamesa_details_7), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.FABRICAACEITUNA, res.getString(R.string.fabricaQ8), false, R.layout.fabricaaceitunamesa_details_8), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.FABRICAACEITUNA, res.getString(R.string.fabricaQ9), false, R.layout.fabricaaceitunamesa_details_9), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.FABRICAACEITUNA, res.getString(R.string.fabricaQ10), true, R.layout.fabricaaceitunamesa_details_10), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.FABRICAACEITUNA, res.getString(R.string.fabricaQ11), false, R.layout.fabricaaceitunamesa_details_11), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.FABRICAACEITUNA, res.getString(R.string.fabricaQ12), false, R.layout.fabricaaceitunamesa_details_12), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.FABRICAACEITUNA, res.getString(R.string.fabricaQ13), false, R.layout.fabricaaceitunamesa_details_13), null));
        return bioPreguntas;
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
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.ALMAZARA, res.getString(R.string.almazaraQ1), true, R.layout.almazara_details_1), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.ALMAZARA, res.getString(R.string.almazaraQ2), true, R.layout.almazara_details_2), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.ALMAZARA, res.getString(R.string.almazaraQ3), true, R.layout.almazara_details_3), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.ALMAZARA, res.getString(R.string.almazaraQ4), false, R.layout.almazara_details_4), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.ALMAZARA, res.getString(R.string.almazaraQ5), false, R.layout.almazara_details_5), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.ALMAZARA, res.getString(R.string.almazaraQ6), true, R.layout.almazara_details_6), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.ALMAZARA, res.getString(R.string.almazaraQ7), false, R.layout.almazara_details_7), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.ALMAZARA, res.getString(R.string.almazaraQ8), false, R.layout.almazara_details_8), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.ALMAZARA, res.getString(R.string.almazaraQ9), false, R.layout.almazara_details_9), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.ALMAZARA, res.getString(R.string.almazaraQ10), false, R.layout.almazara_details_10), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.ALMAZARA, res.getString(R.string.almazaraQ11), false, R.layout.almazara_details_11), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.ALMAZARA, res.getString(R.string.almazaraQ12), true, R.layout.almazara_details_12), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.ALMAZARA, res.getString(R.string.almazaraQ13), false, R.layout.almazara_details_13), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.ALMAZARA, res.getString(R.string.almazaraQ14), false, R.layout.almazara_details_14), null));
        bioPreguntas.add(new Respuesta(new Pregunta(TipoRespuesta.ALMAZARA, res.getString(R.string.almazaraQ15), false, R.layout.almazara_details_15), null));
        return bioPreguntas;
    }
}
