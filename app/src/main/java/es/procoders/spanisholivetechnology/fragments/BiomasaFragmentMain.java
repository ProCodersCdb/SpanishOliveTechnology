package es.procoders.spanisholivetechnology.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.OnItemClickListener;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.activities.BiomasaActivity;
import es.procoders.spanisholivetechnology.adapters.ListViewAdapter;
import es.procoders.spanisholivetechnology.adapters.SimpleAdapterSave;
import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.beans.Pregunta;
import es.procoders.spanisholivetechnology.beans.Respuesta;
import es.procoders.spanisholivetechnology.beans.TipoRespuesta;
import es.procoders.spanisholivetechnology.beans.Usuario;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;
import es.procoders.spanisholivetechnology.dao.BiomasaDAO;
import es.procoders.spanisholivetechnology.dao.FormularioDAO;
import es.procoders.spanisholivetechnology.dao.IFormularioDAO;
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
    private IFormularioDAO dao = new FormularioDAO();

    BaseAdapter adapter;
    GeneralSingleton single;
    FloatingActionButton floating;
    BaseAdapter adapter2;

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


        initViews(rootView);
        return rootView;

        /**
         *
         */

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        adapter = new ListViewAdapter(rootView.getContext(), single.getFormularios().get(single.getPositionformulario()).getRespuestas());
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
                adapter2 = new SimpleAdapterSave(getContext());
                DialogPlus dialog = DialogPlus.newDialog(view.getContext())
                        .setAdapter(adapter2)
                        .setInAnimation(R.transition.slide_in_bottom)
                        .setOutAnimation(R.transition.slide_out_bottom)
                        .setMargin(20,0,20,20)
                        .setCancelable(false)
                        .setOnItemClickListener(new OnItemClickListener() {
                            @Override
                            public void onItemClick(DialogPlus dialog, Object item, View view, int position) {

                                Formulario form = new Formulario();
                                switch (position){
                                    case 0:
                                        biomasaDAO.guardarLocal(single.getFormularios(), view.getContext());
                                        getActivity().onBackPressed();
                                        break;
                                    case 1:
                                        if(finalServices.isReady(single.getFormularios().get(single.getPositionformulario()).getRespuestas())) {
//                                            single.getFormularios().get(single.getPositionformulario()).setDate(new Date());
                                            biomasaDAO.guardarLocal(single.getFormularios(), view.getContext());
                                            dao.crearFormulario(single.getFormularios().get(single.getPositionformulario()));
                                            getActivity().onBackPressed();
                                        } else{
                                            Toast.makeText(view.getContext()    , "Formulario no enviado, debes rellenar todos los campos requeridos", Toast.LENGTH_SHORT).show();
                                            biomasaDAO.guardarLocal(single.getFormularios(), view.getContext());
                                            getActivity().onBackPressed();
                                        }
                                        break;
                                    case 2:
                                        dialog.dismiss();
                                        break;
                                }

                                dialog.dismiss();

                            }
                        })
                        .setExpanded(false)
                        .setContentBackgroundResource(R.drawable.rounded_dialog)
                        .setGravity(Gravity.BOTTOM)
                        .setCancelable(true)
                        .create();
                dialog.show();
            }
        });

        /**
         * Tras la declaracion de las variables, se procede a la comprobacion de que las variables
         * desiganadas en BiomasaServices
         */

    }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        single.setPosition(i);
        FragmentController.callFragment(single.getFragmentManager(), R.id.fragment_activityBiomasa, new BiomasaFragmentDetails()).commit();
    }


}
