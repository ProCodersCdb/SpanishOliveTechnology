package es.procoders.spanisholivetechnology.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

class FragmentController {
    public static FragmentTransaction callFragment(FragmentManager fragmentManager, int id, Fragment fragment) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(id, fragment);
        fragmentTransaction.addToBackStack(null);
        return fragmentTransaction;
    }
}
