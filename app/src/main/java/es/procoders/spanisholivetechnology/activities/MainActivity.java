package es.procoders.spanisholivetechnology.activities;

import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.controllers.BotonBioMasa;
import es.procoders.spanisholivetechnology.controllers.Controller;
import es.procoders.spanisholivetechnology.controllers.MainController;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity  {

    /**
     *
     * @param savedInstanceState hace un guardado de la información recabada en cada una de las
     *                           preguntas
     */
    private Toolbar toolbar;
    private AppBarLayout appBarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Controller mController = new MainController(this,BiomasaActivity.class,findViewById(R.id.btnNext));
        mController.getView().setOnClickListener(new BotonBioMasa(mController));

    }



}
