package es.procoders.spanisholivetechnology.services;

import java.util.ArrayList;

import es.procoders.spanisholivetechnology.beans.Respuesta;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

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
