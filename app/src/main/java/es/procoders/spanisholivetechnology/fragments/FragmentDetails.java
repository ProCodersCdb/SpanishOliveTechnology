package es.procoders.spanisholivetechnology.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import es.procoders.spanisholivetechnology.controllers.AlmazaraController;
import es.procoders.spanisholivetechnology.controllers.BiomasaController;
import es.procoders.spanisholivetechnology.controllers.ComercioAceiteOlivaController;
import es.procoders.spanisholivetechnology.controllers.ComercioAceitunaMesaController;
import es.procoders.spanisholivetechnology.controllers.FabricaAceitunaController;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;
import es.procoders.spanisholivetechnology.controllers.PlantacionController;

/**
 * A simple {@link Fragment} subclass.
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public class FragmentDetails extends android.support.v4.app.Fragment {
    /**
     *
     */

    private GeneralSingleton controller;
    private ImageButton save, back;


    public FragmentDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        controller = GeneralSingleton.getInstance();
        View rootView = inflater.inflate(controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).getPregunta().getLayout(), container, false);
        switch (controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).getPregunta().getTipo()){
            case BIOMASA:
                new BiomasaController(rootView, getActivity());
                break;
            case PLANTACION:
                new PlantacionController(rootView, getActivity());
                break;
            case ALMAZARA:
                new AlmazaraController(rootView, getActivity());
                break;
            case FABRICAACEITUNA:
                new FabricaAceitunaController(rootView, getActivity());
                break;
            case COMERCIOACEITE:
                new ComercioAceiteOlivaController(rootView, getActivity());
                break;
            case COMERCIOACEITUNA:
                new ComercioAceitunaMesaController(rootView, getActivity());
                break;

        }





        return rootView;
    }



}
