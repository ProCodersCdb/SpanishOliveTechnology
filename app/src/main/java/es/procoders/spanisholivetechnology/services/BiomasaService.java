package es.procoders.spanisholivetechnology.services;

import es.procoders.spanisholivetechnology.activities.BiomasaActivity;
import es.procoders.spanisholivetechnology.beans.BiomasaBean;

public class BiomasaService {

    public Boolean CheckAnswer(BiomasaBean datosBio) {

        /* con esta linea de codigo nos cubrimos de que las preguntas que son de obligatoria
        cumplimentacion no queden sin rellenar. Una vez que quedan rellenas, se confirma. En caso
        de no cumplirse la condicion devuelve un false */

        if (datosBio.getBioQ2().toString() != null && datosBio.getBioQ3().toString() != null && datosBio.getBioQ5().toString() != null && datosBio.getBioQ6().toString() != null) {

            return true;
        }

        return false;
    }
}
