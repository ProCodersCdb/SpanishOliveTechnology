package es.procoders.spanisholivetechnology.controllers;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;


import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.fragments.BiomasaFragmentMain;

/**
 * Created by bjfem on 31/10/2017.
 */

public class BiomasaController extends FragmentActivity{

    private Activity activity;

    public BiomasaController (Activity activity){
        this.activity = activity;

        Fragment fragment = new BiomasaFragmentMain();
        FragmentTransaction transaction = activity.getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_activityBiomasa, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
