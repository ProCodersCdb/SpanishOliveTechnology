package es.procoders.spanisholivetechnology.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.adapters.ListViewAdapter;
import es.procoders.spanisholivetechnology.questions.BiomasaQuestions;

/**
 * A simple {@link Fragment} subclass.
 */
public class BiomasaFragmentMain extends Fragment {

    ListView lv;
    BiomasaQuestions bq;
    BaseAdapter adapter;

    //array bioPreguntas;


    public BiomasaFragmentMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_biomasa_fragment_main, container, false);
        // Inflate the layout for this fragment
        initViews(rootView);

        return rootView;

    }

    private void initViews(View view) {
        bq = new BiomasaQuestions();
        lv = (ListView) view.findViewById(R.id.listView_mainFragment);
        adapter = new ListViewAdapter(view, bq.getBioPreguntas());
        lv.setAdapter(adapter);
    }

}
