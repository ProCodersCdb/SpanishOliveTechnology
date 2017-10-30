package es.procoders.spanisholivetechnology.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.controllers.BiomasaController;

/**
 * A simple {@link Fragment} subclass.
 */
public class BiomasaFragmentDetails extends Fragment {

    BiomasaController controller;
    private int position;


    public BiomasaFragmentDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        controller = BiomasaController.getInstance();
        position = controller.getPosition();
        inflate(position);
        View rootView = inflater.inflate(inflate(position), container, false);

        return rootView;
    }


    public int inflate(int i){
        int layout;
        switch (i){
            case 0:
                layout = R.layout.fragment_biomasa_fragment_details;
                break;
            case 1:
                layout = R.layout.fragment_biomasa_fragment_details;
                break;
            case 2:
                layout = R.layout.fragment_biomasa_fragment_details;
                break;
            case 3:
                layout = R.layout.fragment_biomasa_fragment_details;
                break;
            case 4:
                layout = R.layout.fragment_biomasa_fragment_details;
                break;
            case 5:
                layout = R.layout.fragment_biomasa_fragment_details;
                break;
            case 6:
                layout = R.layout.fragment_biomasa_fragment_details;
                break;
            default:
                layout = R.layout.fragment_biomasa_fragment_details;
                break;
        }
        return layout;
    }


}
