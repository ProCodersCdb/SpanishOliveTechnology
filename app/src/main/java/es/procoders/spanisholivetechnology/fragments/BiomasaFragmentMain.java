package es.procoders.spanisholivetechnology.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.procoders.spanisholivetechnology.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BiomasaFragmentMain extends Fragment {


    public BiomasaFragmentMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_biomasa_fragment_main, container, false);
        // Inflate the layout for this fragment
        return rootView;
    }

}
