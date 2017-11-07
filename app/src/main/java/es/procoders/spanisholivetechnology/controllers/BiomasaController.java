package es.procoders.spanisholivetechnology.controllers;

import android.app.Activity;
import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;



import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.fragments.BiomasaFragmentMain;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class BiomasaController {

    private Activity activity;

    private android.support.v4.app.FragmentManager fmanager;

    /**
     * @param activity recibe la actividad que esta en curso en el momento de la llamada
     *                 para trabajar sobre ella
     * @param fmanager controla el proceso del FragmentManager
     */


    public BiomasaController (Activity activity, android.support.v4.app.FragmentManager fmanager){
        this.fmanager = fmanager;
        this.activity = activity;
        callFragment().commit();
    }


    private android.support.v4.app.FragmentTransaction callFragment() {
        Fragment newfragment = new BiomasaFragmentMain();
        android.support.v4.app.FragmentTransaction transaction = fmanager.beginTransaction();
        transaction.replace(R.id.fragment_activityBiomasa, newfragment);
        transaction.addToBackStack(null);
        return transaction;
    }

}
