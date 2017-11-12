package es.procoders.spanisholivetechnology.questions;

import java.util.ArrayList;

import es.procoders.spanisholivetechnology.beans.Respuesta;

/**
 * Created by bjfem on 10/11/2017.
 */

interface GeneralControler {
    abstract ArrayList<Respuesta> getBiomasa();
    abstract ArrayList<Respuesta> getPlantacion();
    abstract ArrayList<Respuesta> getFabricaAceituna();
    abstract ArrayList<Respuesta> getComercioAceite();
    abstract ArrayList<Respuesta> getComercioAceituna();
    abstract ArrayList<Respuesta> getAlmazara();
}
