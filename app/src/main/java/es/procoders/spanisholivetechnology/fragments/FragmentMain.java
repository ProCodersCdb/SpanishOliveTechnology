package es.procoders.spanisholivetechnology.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
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

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.adapters.ListViewAdapter;
import es.procoders.spanisholivetechnology.adapters.SimpleAdapterSave;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;
import es.procoders.spanisholivetechnology.dao.LocalDAO;
import es.procoders.spanisholivetechnology.dao.FormularioDAO;
import es.procoders.spanisholivetechnology.dao.IFormularioDAO;
import es.procoders.spanisholivetechnology.services.BussinessService;
import es.procoders.spanisholivetechnology.threads.TareaAddForm;
import es.procoders.spanisholivetechnology.threads.TareaUpgradeForm;

/**
 * @author Procoders
 * @version 1.0
 * @since API 21
 */

public class FragmentMain extends ListFragment implements AdapterView.OnItemClickListener {

    private IFormularioDAO dao = new FormularioDAO();
    private BaseAdapter adapter;
    private GeneralSingleton single;
    private FloatingActionButton floating;
    private BaseAdapter adapter2;

    private View rootView;



    public FragmentMain() {
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
        final LocalDAO localDAO = new LocalDAO();
        final BussinessService finalServices = new BussinessService();
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
                                switch (position){
                                    case 0:
                                        localDAO.guardarLocal(single.getFormularios(), view.getContext());
                                        getActivity().onBackPressed();
                                        break;
                                    case 1:
                                        try {
                                            if (finalServices.isReady(single.getFormularios().get(single.getPositionformulario()).getRespuestas())) {
                                                if (single.getFormularios().get(single.getPositionformulario()).getDate() == null) {
                                                    TareaAddForm tarea = new TareaAddForm(single.getFormularios().get(single.getPositionformulario()));
                                                    tarea.execute();
                                                } else {
                                                    TareaUpgradeForm tarea = new TareaUpgradeForm(single.getFormularios().get(single.getPositionformulario()));
                                                    tarea.execute();
                                                }
                                                single.getFormularios().remove(single.getFormularios().get(single.getPositionformulario()));
                                                localDAO.guardarLocal(single.getFormularios(), view.getContext());
                                                getActivity().onBackPressed();
                                            } else {
                                                Toast.makeText(view.getContext(), "Formulario no enviado, debes rellenar todos los campos requeridos", Toast.LENGTH_SHORT).show();
                                                localDAO.guardarLocal(single.getFormularios(), view.getContext());
                                                getActivity().onBackPressed();
                                            }
                                        }catch (Exception e){
                                            Toast.makeText(view.getContext(), "Ha ocurrido un error enviando el formulario.", Toast.LENGTH_SHORT).show();
                                            dialog.dismiss();
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
    }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        single.setPosition(i);
        FragmentController.callFragment(single.getFragmentManager(), R.id.fragment_activityBiomasa, new FragmentDetails()).commit();
    }

}
