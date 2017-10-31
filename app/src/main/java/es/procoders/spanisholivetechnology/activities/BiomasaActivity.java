package es.procoders.spanisholivetechnology.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.controllers.BiomasaController;
import es.procoders.spanisholivetechnology.fragments.BiomasaFragmentDetails;
import es.procoders.spanisholivetechnology.fragments.BiomasaFragmentMain;

public class BiomasaActivity extends AppCompatActivity {

    private BiomasaController biomasaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biomasa);
        biomasaController = new BiomasaController(this);


    }
}
