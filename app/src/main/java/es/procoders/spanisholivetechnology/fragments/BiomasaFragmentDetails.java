package es.procoders.spanisholivetechnology.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import es.procoders.spanisholivetechnology.controllers.BiomasaSingleton;

/**
 * A simple {@link Fragment} subclass.
 */
public class BiomasaFragmentDetails extends android.support.v4.app.Fragment {

    BiomasaSingleton controller;


    public BiomasaFragmentDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        controller = controller.getInstance();
        View rootView = inflater.inflate(controller.getPosition(), container, false);


        return rootView;
    }





}
