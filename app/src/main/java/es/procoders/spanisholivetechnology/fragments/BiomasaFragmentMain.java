package es.procoders.spanisholivetechnology.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.adapters.ListViewAdapter;
import es.procoders.spanisholivetechnology.controllers.FragmentController;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;
import es.procoders.spanisholivetechnology.questions.Questions;


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

        adapter = new ListViewAdapter(rootView.getContext(), bq.getBiomasa());
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    private void initViews(View view) {
        floating = view.findViewById(R.id.fab);

        //lv.setAdapter(adapter);
//Hay que mejorar la capa de servicio para poder utilizar el mapa.
/*        floating.setOnClickListener(new View.OnClickListener() {
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
        });*/

        /**
         * Tras la declaracion de las variables, se procede a la comprobacion de que las variables
         * desiganadas en BiomasaServices
         */

    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        single.setRespuesta(i);
        single.setRespuesta(bq.getBiomasa().get(i));
        FragmentController.callFragment(single.getFragmentManager(), R.id.fragment_activityBiomasa, new BiomasaFragmentDetails()).commit();

    }


}
