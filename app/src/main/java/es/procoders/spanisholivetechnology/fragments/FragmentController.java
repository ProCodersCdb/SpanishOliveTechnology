package es.procoders.spanisholivetechnology.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by bjfem on 10/11/2017.
 */

class FragmentController {
    public static FragmentTransaction callFragment(FragmentManager fragmentManager, int id, Fragment fragment) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(id, fragment);
        fragmentTransaction.addToBackStack(null);
        return fragmentTransaction;
    }
}
