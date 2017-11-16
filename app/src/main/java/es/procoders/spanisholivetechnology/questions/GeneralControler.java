package es.procoders.spanisholivetechnology.questions;

import java.util.ArrayList;

import es.procoders.spanisholivetechnology.beans.Respuesta;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

interface GeneralControler {
     ArrayList<Respuesta> getBiomasa();
     ArrayList<Respuesta> getPlantacion();
     ArrayList<Respuesta> getFabricaAceituna();
     ArrayList<Respuesta> getComercioAceite();
     ArrayList<Respuesta> getComercioAceituna();
     ArrayList<Respuesta> getAlmazara();
}
