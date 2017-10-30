package es.procoders.spanisholivetechnology.services;

import es.procoders.spanisholivetechnology.activities.BiomasaActivity;

public class BiomasaService {

    private BiomasaActivity = new BiomasaActivity();

    public Boolean CheckAnswer() {

        /* con esta linea de codigo nos cubrimos de que las preguntas que son de obligatoria
        cumplimentacion no queden sin rellenar. Una vez que quedan rellenas, se confirma. En caso
        de no cumplirse la condicion devuelve un false */

        if (BiomasaActivity.bioQ2 != null && BiomasaActivity.bioQ3 != null && BiomasaActivity.bioQ5 != null && BiomasaActivity.bioQ6 != null) {

            return true;
        }
        return false;
    }
}
