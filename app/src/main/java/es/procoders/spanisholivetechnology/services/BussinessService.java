package es.procoders.spanisholivetechnology.services;


import java.util.ArrayList;
import java.util.TreeMap;

import es.procoders.spanisholivetechnology.beans.Pregunta;
import es.procoders.spanisholivetechnology.beans.Respuesta;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;

public class BussinessService implements BussinessRule<Respuesta>{

    @Override
    public Boolean isReady(ArrayList<Respuesta> mapa) {
        boolean retVal= true;
        GeneralSingleton single= GeneralSingleton.getInstance();
        for (int i=0; i<single.getFormularios().get(single.getPositionformulario()).getRespuestas().size();i++){
            if (single.getFormularios().get(single.getPositionformulario()).getRespuestas().get(i).getPregunta().isRequired() && retVal){
                if (mapa.get(i).getStr() == null){
                    retVal=false;
                }
            }
        }
        return retVal;
    }
}
