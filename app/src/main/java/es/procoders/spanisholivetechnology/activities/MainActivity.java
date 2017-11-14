package es.procoders.spanisholivetechnology.activities;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.StrictMode;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.OnClickListener;
import com.orhanobut.dialogplus.OnItemClickListener;

import java.lang.reflect.Array;
import java.util.ArrayList;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.adapters.ListViewAdapter;
import es.procoders.spanisholivetechnology.adapters.ListViewAdapterMain;
import es.procoders.spanisholivetechnology.adapters.SimpleAdapter;
import es.procoders.spanisholivetechnology.adapters.SimpleAdapterCharge;
import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;
import es.procoders.spanisholivetechnology.dao.BiomasaDAO;
import es.procoders.spanisholivetechnology.fragments.BiomasaFragmentMain;
import es.procoders.spanisholivetechnology.questions.Questions;


/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity{

    /**
     *
     * @param savedInstanceState hace un guardado de la información recabada en cada una de las
     *                           preguntas
     */
    private Toolbar toolbar;
    private AppBarLayout appBarLayout;
    ListView lv;
    BaseAdapter adapter3;
    BaseAdapter adapter;
    GeneralSingleton single;
    private FloatingActionButton fab;
    private BaseAdapter adapter2;
    DialogPlus cargar;
    Questions qu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button btn = findViewById(R.id.btnNext);
        //btn.setOnClickListener(this);
        single = GeneralSingleton.getInstance();
        fab = findViewById(R.id.fab_main);
        adapter2 = new SimpleAdapter(this);
        adapter3 = new SimpleAdapterCharge(this);
        cargar = cargarDB(this);
        cargar.show();
        lv = findViewById(R.id.list_main);
        if (new BiomasaDAO().recuperarLocal(this) != null){
            GeneralSingleton.getInstance().setFormularios(new BiomasaDAO().recuperarLocal(this));
        }
        if (single.getFormularios()!=null) {
            adapter = new ListViewAdapterMain(this, single.getFormularios());
        }else{
            single.setFormularios(new ArrayList<Formulario>());
            adapter = new ListViewAdapterMain(this, single.getFormularios());
        }
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                single.setPositionformulario(i);
                Intent inte= new Intent(view.getContext(), BiomasaActivity.class);
                startActivity(inte);
            }
        });
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogPlus dialog = DialogPlus.newDialog(view.getContext())
                        .setAdapter(adapter2)
                        .setHeader(R.layout.menu_header)
                        .setInAnimation(R.transition.slide_in_bottom)
                        .setOutAnimation(R.transition.slide_out_bottom)
                        .setMargin(20,0,20,20)
                        .setOnItemClickListener(new OnItemClickListener() {
                            @Override
                            public void onItemClick(DialogPlus dialog, Object item, View view, int position) {
                                qu =new Questions(view.getContext());
                                Formulario form = new Formulario();
                                switch (position){
                                    case 0:
                                        form.setRespuestas(qu.getPlantacion());
                                        break;
                                    case 1:
                                        form.setRespuestas(qu.getAlmazara());
                                        break;
                                    case 2:
                                        form.setRespuestas(qu.getFabricaAceituna());
                                        break;
                                    case 3:
                                        form.setRespuestas(qu.getComercioAceite());
                                        break;
                                    case 4:
                                        form.setRespuestas(qu.getComercioAceituna());
                                        break;
                                    case 5:
                                        form.setRespuestas(qu.getBiomasa());
                                        break;
                                }
                                form.setUser(single.getUser());
                                form.setTipo(form.getRespuestas().get(0).getPregunta().getTipo());
                                single.getFormularios().add(form);
                                single.setPositionformulario(single.getFormularios().size()-1);
                                Intent inte= new Intent(view.getContext(), BiomasaActivity.class);
                                startActivity(inte);
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
    protected void onResume() {
        super.onResume();
        if (new BiomasaDAO().recuperarLocal(this) != null){
            GeneralSingleton.getInstance().setFormularios(new BiomasaDAO().recuperarLocal(this));
        }
        if (single.getFormularios()!=null) {
            adapter = new ListViewAdapterMain(this, single.getFormularios());
        }else{
            single.setFormularios(new ArrayList<Formulario>());
            adapter = new ListViewAdapterMain(this, single.getFormularios());
        }
        lv.setAdapter(adapter);
    }
    public DialogPlus cargarDB(Activity activity){
        DialogPlus dialog = DialogPlus.newDialog(activity)
                .setAdapter(adapter3)
                .setInAnimation(R.transition.slide_in_bottom)
                .setOutAnimation(R.transition.slide_out_bottom)
                .setMargin(40,0,40,0)
                .setExpanded(false)
                .setContentBackgroundResource(R.drawable.rounded_dialog)
                .setGravity(Gravity.CENTER)
                .setCancelable(true)
                .create();
        return dialog;
    }
}
