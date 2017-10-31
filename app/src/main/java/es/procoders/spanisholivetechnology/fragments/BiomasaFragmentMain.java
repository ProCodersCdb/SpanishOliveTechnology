package es.procoders.spanisholivetechnology.fragments;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.activities.BiomasaActivity;
import es.procoders.spanisholivetechnology.adapters.ListViewAdapter;
import es.procoders.spanisholivetechnology.controllers.BiomasaSingleton;
import es.procoders.spanisholivetechnology.questions.BiomasaQuestions;

/**
 * A simple {@link Fragment} subclass.
 */
public class BiomasaFragmentMain extends android.support.v4.app.Fragment implements AdapterView.OnItemClickListener {

    ListView lv;
    BiomasaQuestions bq;
    BaseAdapter adapter;
    BiomasaSingleton controller;


    public BiomasaFragmentMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_biomasa_fragment_main, container, false);
        // Inflate the layout for this fragment
        initViews(rootView);
        controller = BiomasaSingleton.getInstance();


        return rootView;

    }

    private void initViews(View view) {
        bq = new BiomasaQuestions();
        lv = (ListView) view.findViewById(R.id.listView_mainFragment);
        adapter = new ListViewAdapter(view.getContext(), bq.rellenarBioPreguntas());
        lv.setAdapter(adapter);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Fragment nuevoFragmento = new BiomasaFragmentDetails();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        controller.setPosition(i);
        transaction.replace(R.id.fragment_activityBiomasa, nuevoFragmento);
        transaction.addToBackStack(null);
        transaction.commit();

    }
}
