package es.procoders.spanisholivetechnology.services;

import android.text.TextUtils;

import java.util.Objects;

import es.procoders.spanisholivetechnology.activities.BiomasaActivity;
import es.procoders.spanisholivetechnology.beans.BiomasaBean;

public class BiomasaService {

//    public BussinessRule [] rules = new BussinessRule[1];

    public Boolean isReady(BiomasaBean datosBio) {

        /* con esta linea de codigo nos cubrimos de que las preguntas que son de obligatoria
        cumplimentacion no queden sin rellenar. Una vez que quedan rellenas, se confirma. En caso
        de no cumplirse la condicion devuelve un false */

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
