package es.procoders.spanisholivetechnology.services;


import java.util.ArrayList;
import java.util.TreeMap;

import es.procoders.spanisholivetechnology.beans.Pregunta;
import es.procoders.spanisholivetechnology.beans.Respuesta;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;

public class BiomasaService {




    public Boolean isReady(ArrayList<Respuesta> mapa) {
        boolean retVal= true;
        GeneralSingleton single= GeneralSingleton.getInstance();
        for (int i=0; i<single.getRespuesta().size();i++){
            if (single.getRespuesta().get(i).getPregunta().isRequired() && retVal){
                if (mapa.get(i).getStr() == null){
                    retVal=false;
                }
            }
        }
        return retVal;
    }

//    public BussinessRule getRule ()
}
