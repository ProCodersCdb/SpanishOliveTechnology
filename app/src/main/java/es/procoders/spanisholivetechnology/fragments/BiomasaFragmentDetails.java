package es.procoders.spanisholivetechnology.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;


import java.util.ArrayList;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.Respuesta;

import es.procoders.spanisholivetechnology.controllers.BiomasaController;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;
import es.procoders.spanisholivetechnology.questions.Questions;
import es.procoders.spanisholivetechnology.questions.Options;

/**
 * A simple {@link Fragment} subclass.
 * @author Procoders
 * @version 1.0
 * @since API 21
 */
public class BiomasaFragmentDetails extends android.support.v4.app.Fragment {
    /**
     *
     */

    GeneralSingleton controller;
    ImageButton save, back;


    public BiomasaFragmentDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        controller = GeneralSingleton.getInstance();

        save = (ImageButton) getActivity().findViewById(R.id.btnOptionSave);
        back = (ImageButton) getActivity().findViewById(R.id.btnBack);

        View rootView = inflater.inflate(controller.getRespuesta().get(controller.getPosition()).getPregunta().getLayout(), container, false);
        switch (controller.getRespuesta().get(controller.getPosition()).getPregunta().getTipo()){
            case BIOMASA:
                new BiomasaController(rootView, getActivity());
                break;
        }





        return rootView;
    }



}
