package es.procoders.spanisholivetechnology.activities;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.OnClickListener;
import com.orhanobut.dialogplus.OnItemClickListener;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.adapters.ListViewAdapter;
import es.procoders.spanisholivetechnology.adapters.ListViewAdapterMain;
import es.procoders.spanisholivetechnology.adapters.SimpleAdapter;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;
import es.procoders.spanisholivetechnology.dao.BiomasaDAO;
import es.procoders.spanisholivetechnology.fragments.BiomasaFragmentMain;
import es.procoders.spanisholivetechnology.questions.Questions;


/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    /**
     *
     * @param savedInstanceState hace un guardado de la información recabada en cada una de las
     *                           preguntas
     */
    private Toolbar toolbar;
    private AppBarLayout appBarLayout;
    ListView lv;
    BaseAdapter adapter;
    GeneralSingleton single;
    private FloatingActionButton fab;
    private BaseAdapter adapter2;
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

        lv = findViewById(R.id.list_main);
        if (new BiomasaDAO().recuperarLocal(this) != null){
            GeneralSingleton.getInstance().setFormularios(new BiomasaDAO().recuperarLocal(this));
        }
        if (single.getFormularios()!=null) {
            adapter = new ListViewAdapterMain(this, single.getFormularios());
            lv.setAdapter(adapter);
        }
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                single.setRespuesta(single.getFormularios().get(i).getRespuestas());
                Intent inte= new Intent(view.getContext(), BiomasaActivity.class);
                startActivity(inte);
            }
        });
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogPlus dialog = DialogPlus.newDialog(view.getContext())
                        .setAdapter(adapter2)
                        .setOnItemClickListener(new OnItemClickListener() {
                            @Override
                            public void onItemClick(DialogPlus dialog, Object item, View view, int position) {
                                qu =new Questions(view.getContext());
                                switch (position){
                                    case 0:
                                        single.setRespuesta(qu.getPlantacion());
                                        break;
                                    case 1:
                                        single.setRespuesta(qu.getAlmazara());
                                        break;
                                    case 2:
                                        single.setRespuesta(qu.getFabricaAceituna());
                                        break;
                                    case 3:
                                        single.setRespuesta(qu.getComercioAceite());
                                        break;
                                    case 4:
                                        single.setRespuesta(qu.getComercioAceituna());
                                        break;
                                    case 5:
                                        single.setRespuesta(qu.getBiomasa());
                                        break;
                                }

                                Intent inte= new Intent(view.getContext(), BiomasaActivity.class);
                                startActivity(inte);
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
    public void onClick(View view) {
        Intent inte= new Intent(this, BiomasaActivity.class);
        startActivity(inte);
    }
}
