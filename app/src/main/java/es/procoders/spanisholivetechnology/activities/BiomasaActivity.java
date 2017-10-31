package es.procoders.spanisholivetechnology.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.controllers.BiomasaController;
import es.procoders.spanisholivetechnology.fragments.BiomasaFragmentDetails;
import es.procoders.spanisholivetechnology.fragments.BiomasaFragmentMain;
import es.procoders.spanisholivetechnology.beans.BiomasaBean;
import es.procoders.spanisholivetechnology.services.BiomasaService;

public class BiomasaActivity extends AppCompatActivity {

    private BiomasaController biomasaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biomasa);
        biomasaController = new BiomasaController(this);


        BiomasaBean datosBiomasa = new BiomasaBean();

        /*BiomasaService serv = new BiomasaService();

        serv.CheckAnswer(datosBiomasa);*/

    }
}
