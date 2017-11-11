package es.procoders.spanisholivetechnology.activities;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import es.procoders.spanisholivetechnology.R;


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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btnNext);
        btn.setOnClickListener(this);



        /*Controller mController = new MainController(this,BiomasaActivity.class,findViewById(R.id.btnNext));
        mController.getView().setOnClickListener(new BotonBioMasa(mController));*/

    }


    @Override
    public void onClick(View view) {
        Intent inte= new Intent(this, BiomasaActivity.class);
        startActivity(inte);
    }
}
