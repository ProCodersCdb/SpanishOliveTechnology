package es.procoders.spanisholivetechnology.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import es.procoders.spanisholivetechnology.R;

import es.procoders.spanisholivetechnology.controllers.BiomasaController;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;
import es.procoders.spanisholivetechnology.controllers.MainController;
import es.procoders.spanisholivetechnology.fragments.FragmentMain;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class BiomasaActivity extends FragmentActivity {

    private GeneralSingleton single;
    private BiomasaController biomasaController;
    private MainController mController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biomasa);
        single = GeneralSingleton.getInstance();
        single.setFragmentManager(getSupportFragmentManager());
 /*      try {
           android.support.v4.app.FragmentTransaction trans = FragmentController.callFragment(single.getFragmentManager(), R.layout.fragment_biomasa_fragment_main, new FragmentMain());
           trans.commit();
       }catch (Exception e ){
           Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
       }*/


        mController = new MainController(this);
        mController.loadToolbar(this);

        FragmentMain fragment = new FragmentMain();
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fragment_activityBiomasa, fragment);
        //ft.addToBackStack(null);
        ft.commit();


    }

}
