package es.procoders.spanisholivetechnology.services;


import java.util.TreeMap;

import es.procoders.spanisholivetechnology.beans.Pregunta;
import es.procoders.spanisholivetechnology.beans.Respuesta;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;

public class BiomasaService {

//    public BussinessRule [] rules = new BussinessRule[1];


    public Boolean isReady(TreeMap<Pregunta, Respuesta> mapa) {
        boolean retVal= true;
        GeneralSingleton single= GeneralSingleton.getInstance();
        for (int i=0; i<single.getRespuesta().size();i++){
            if (single.getRespuesta().get(i).getPregunta().isRequired() && retVal){
                if (mapa.get(single.getRespuesta().get(i).getPregunta()) == null){
                    retVal=false;
                }
            }
        }
        return retVal;
    }

//    public BussinessRule getRule ()
}