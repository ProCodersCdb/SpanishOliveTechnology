package es.procoders.spanisholivetechnology.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.OnItemClickListener;

import java.util.ArrayList;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.adapters.ListViewAdapterMain;
import es.procoders.spanisholivetechnology.adapters.SimpleAdapter;
import es.procoders.spanisholivetechnology.adapters.SimpleAdapterCharge;
import es.procoders.spanisholivetechnology.beans.Formulario;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;
import es.procoders.spanisholivetechnology.dao.BiomasaDAO;
import es.procoders.spanisholivetechnology.dao.FormularioDAO;
import es.procoders.spanisholivetechnology.dao.IFormularioDAO;
import es.procoders.spanisholivetechnology.questions.Questions;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class MainActivity extends AppCompatActivity{

    private IFormularioDAO dao;
    private ListView lv;
    private BaseAdapter adapter3;
    private BaseAdapter adapter;
    private GeneralSingleton single;
    private FloatingActionButton fab;
    private BaseAdapter adapter2;
    private Questions qu;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //TODO QUITAR LUEGO CUANDO ESTÉ EL ASYNC
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        setContentView(R.layout.activity_main);
        dao= new FormularioDAO();
        single = GeneralSingleton.getInstance();
        fab = findViewById(R.id.fab_main);
        adapter2 = new SimpleAdapter(this);
        adapter3 = new SimpleAdapterCharge(this);
        lv = findViewById(R.id.list_main);
        loadArrayFormularios();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                single.setPositionformulario(i);
                Intent inte= new Intent(view.getContext(), ActivityFragment.class);
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
                                Intent inte= new Intent(view.getContext(), ActivityFragment.class);
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
        loadArrayFormularios();

    }


    // Dialogo de carga mientras descargamos los formularios de la bbdd.
    public void cargarDB(Activity activity){
        final DialogPlus dialog = DialogPlus.newDialog(activity)
                .setAdapter(adapter3)
                .setInAnimation(R.transition.slide_in_bottom)
                .setOutAnimation(R.transition.slide_out_bottom)
                .setMargin(40,0,40,0)
                .setExpanded(false)
                .setContentBackgroundResource(R.drawable.rounded_dialog)
                .setGravity(Gravity.CENTER)
                .setCancelable(true)
                .create();
        dialog.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                dialog.dismiss();
            }
        }, 3000);
    }

    //Cargamos el array de formularios de la bbdd buscando por email y añadimos también el array local de formularios no enviados.
    //T-odo ello lo guardamos en el singleton para poder utilizarlo mas tarde.
    private void loadArrayFormularios(){
        cargarDB(this);
        ArrayList<Formulario> arrayFormulario = new ArrayList<>();
        try {
            arrayFormulario = dao.consultarFormularios(single.getUser(), this);
        }catch (Exception e){
            Toast.makeText(this, "Ha ocurrido un error cargando los formularios, intentelo de nuevo mas tarde.", Toast.LENGTH_SHORT).show();
            System.out.println(e.getMessage());
        }
        single.setFormularios(arrayFormulario);
        GeneralSingleton.getInstance().getFormularios().addAll(new BiomasaDAO().recuperarLocal(this));

        adapter = new ListViewAdapterMain(this, single.getFormularios());
        lv.setAdapter(adapter);


    }
}
