package es.procoders.spanisholivetechnology.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.BiomasaBean;
import es.procoders.spanisholivetechnology.controllers.BiomasaController;
import es.procoders.spanisholivetechnology.fragments.BiomasaFragmentMain;

public class BiomasaActivity extends FragmentActivity {

    private BiomasaController biomasaController;

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
