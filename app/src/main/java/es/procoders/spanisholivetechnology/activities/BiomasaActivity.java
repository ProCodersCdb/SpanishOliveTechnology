package es.procoders.spanisholivetechnology.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.BiomasaBean;
import es.procoders.spanisholivetechnology.services.BiomasaService;

public class BiomasaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biomasa);

        BiomasaBean datosBiomasa = new BiomasaBean();

        /*BiomasaService serv = new BiomasaService();

        serv.CheckAnswer(datosBiomasa);*/

    }
}
