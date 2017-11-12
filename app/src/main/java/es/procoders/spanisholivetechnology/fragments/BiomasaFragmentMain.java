package es.procoders.spanisholivetechnology.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.adapters.ListViewAdapter;
import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.beans.Pregunta;
import es.procoders.spanisholivetechnology.beans.Respuesta;
import es.procoders.spanisholivetechnology.beans.TipoRespuesta;
import es.procoders.spanisholivetechnology.beans.Usuario;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;
import es.procoders.spanisholivetechnology.dao.BiomasaDAO;
import es.procoders.spanisholivetechnology.questions.Questions;
import es.procoders.spanisholivetechnology.services.BiomasaService;


/**
 * A simple {@link Fragment} subclass.
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public class BiomasaFragmentMain extends ListFragment implements AdapterView.OnItemClickListener {

    /**
     * Esta clase hace llamada a clases secundarias que se precisan para el correcto funcionamiento
     * del sistema de Fragment
     */

   //ListView lv;
    Questions bq;
    BaseAdapter adapter;
    GeneralSingleton single;
    FloatingActionButton floating;

    View rootView;



    public BiomasaFragmentMain() {
        // Required empty public constructor
    }


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_biomasa_fragment_main, container, false);
        // Inflate the layout for this fragment
        single = GeneralSingleton.getInstance();
        bq = new Questions(rootView.getContext());

        initViews(rootView);
        return rootView;

        /**
         *
         */

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        adapter = new ListViewAdapter(rootView.getContext(), single.getRespuesta());
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    private void initViews(View view) {
        floating = view.findViewById(R.id.fab);
        final BiomasaDAO biomasaDAO= new BiomasaDAO();
        final BiomasaService finalServices = new BiomasaService();
        floating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(finalServices.isReady(single.getRespuesta())) {
                    ArrayList<Formulario> formulario = single.getFormularios();
                    formulario.add(createFormulary());
                    single.setFormularios(formulario);
                    biomasaDAO.guardarLocal(single.getFormularios(), view.getContext());
                } else{
                    Snackbar.make(view, "Se deben rellenar los campos requeridos", Snackbar.LENGTH_SHORT).show();
                }
            }
        });

        /**
         * Tras la declaracion de las variables, se procede a la comprobacion de que las variables
         * desiganadas en BiomasaServices
         */

    }

    private Formulario createFormulary() {
        TipoRespuesta tipo = single.getRespuesta().get(0).getPregunta().getTipo();
        Usuario user = single.getUser();
        ArrayList<Respuesta> respuestas = single.getRespuesta();
        Date date = new Date();
        Formulario form = new Formulario(tipo, user, respuestas, date);
        return form;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        single.setPosition(i);
        FragmentController.callFragment(single.getFragmentManager(), R.id.fragment_activityBiomasa, new BiomasaFragmentDetails()).commit();
    }


}
