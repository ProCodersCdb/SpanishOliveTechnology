package es.procoders.spanisholivetechnology.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.BiomasaBean;
import es.procoders.spanisholivetechnology.controllers.BiomasaController;
import es.procoders.spanisholivetechnology.fragments.BiomasaFragmentMain;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class BiomasaActivity extends AppCompatActivity {

    private BiomasaController biomasaController;

    /**
     * @param savedInstanceState guarda el resultado obtenido en la actividad activity_biomasa
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biomasa);
        android.support.v4.app.FragmentManager fragmentManager= getSupportFragmentManager();
        biomasaController = new BiomasaController(this, fragmentManager);


        BiomasaBean datosBiomasa = new BiomasaBean();


        /*BiomasaService serv = new BiomasaService();

        serv.CheckAnswer(datosBiomasa);*/



    }

}
