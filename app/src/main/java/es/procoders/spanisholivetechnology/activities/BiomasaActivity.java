package es.procoders.spanisholivetechnology.activities;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageButton;
import android.widget.Toast;

import es.procoders.spanisholivetechnology.R;

import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;
import es.procoders.spanisholivetechnology.fragments.BiomasaFragmentMain;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class BiomasaActivity extends FragmentActivity {

    private GeneralSingleton single;
    ImageButton save, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biomasa);
        single = GeneralSingleton.getInstance();
        single.setFragmentManager(getSupportFragmentManager());

        save = (ImageButton) findViewById(R.id.btnOptionSave);
        back = (ImageButton) findViewById(R.id.btnBack);

 /*      try {


           android.support.v4.app.FragmentTransaction trans = FragmentController.callFragment(single.getFragmentManager(), R.layout.fragment_biomasa_fragment_main, new BiomasaFragmentMain());
           trans.commit();
       }catch (Exception e ){
           Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
       }*/
        BiomasaFragmentMain fragment = new BiomasaFragmentMain();
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fragment_activityBiomasa, fragment);
        //ft.addToBackStack(null);
        ft.commit();


    }

}
