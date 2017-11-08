package es.procoders.spanisholivetechnology.services;

import android.text.TextUtils;

import java.util.Objects;

import es.procoders.spanisholivetechnology.activities.BiomasaActivity;
import es.procoders.spanisholivetechnology.beans.BiomasaBean;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public class BiomasaService {

//    public BussinessRule [] rules = new BussinessRule[1];

    /**
     * @see "Boolean retVal"
     *
     * con esta linea de codigo nos cubrimos de que las preguntas que son de obligatoria
     * cumplimentacion no queden sin rellenar. Una vez que quedan rellenas, se confirma. En caso
     * de no cumplirse la condicion devuelve un false
     *
     *
     * @param datosBio responde como parametro al objeto BiomasaBean
     *
     * @return devuelve el valor por defecto de retVal si no se cumple ninguna de las condiciones
     */

    public Boolean isReady(BiomasaBean datosBio) {



        Boolean retVal = false;

        if (datosBio.getBioQ2() == null){
            retVal = false;
        } else if (datosBio.getBioQ3() == null){
            retVal = false;
        } else if (datosBio.getBioQ5() == null){
            retVal = false;
        } else if (datosBio.getBioQ6() == null){
            retVal = false;
        }else {
            retVal = true;
        }
        return retVal;

    }

//    public BussinessRule getRule ()
}
