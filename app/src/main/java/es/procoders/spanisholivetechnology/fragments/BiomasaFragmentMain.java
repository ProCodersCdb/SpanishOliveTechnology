package es.procoders.spanisholivetechnology.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.activities.ResultActivity;
import es.procoders.spanisholivetechnology.adapters.ListViewAdapter;
import es.procoders.spanisholivetechnology.controllers.BiomasaSingleton;
import es.procoders.spanisholivetechnology.questions.BiomasaQuestions;
import es.procoders.spanisholivetechnology.services.BiomasaService;

/**
 * A simple {@link Fragment} subclass.
 */
public class BiomasaFragmentMain extends android.support.v4.app.Fragment implements AdapterView.OnItemClickListener {

    ListView lv;
    BiomasaQuestions bq;
    BaseAdapter adapter;
    BiomasaSingleton controller;
    FloatingActionButton floating;
    BiomasaService services;


    public BiomasaFragmentMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_biomasa_fragment_main, container, false);
        // Inflate the layout for this fragment
        initViews(rootView);
        controller = controller.getInstance();
        services = new BiomasaService();


        return rootView;

    }

    private void initViews(View view) {
        bq = new BiomasaQuestions(view.getContext());
        lv = (ListView) view.findViewById(R.id.listView_mainFragment);
        floating = view.findViewById(R.id.fab);
        adapter = new ListViewAdapter(view.getContext(), bq.getBioPreguntas());
        lv.setOnItemClickListener(this);
        lv.setAdapter(adapter);
        floating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(services.isReady(controller.getBiomasa())) {
                    Intent intent = new Intent(view.getContext(), ResultActivity.class);
                    intent.putExtra("datos", controller.getBiomasa());
                    startActivity(intent);
                } else{
                    Toast.makeText(view.getContext(), "No se puede enviar la petición. Formulario no relleno.", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        controller.setPosition(i);
        Fragment nuevoFragmento = new BiomasaFragmentDetails();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_activityBiomasa, nuevoFragmento);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}
