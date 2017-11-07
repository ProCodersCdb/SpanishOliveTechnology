package es.procoders.spanisholivetechnology.activities;

import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.controllers.MainController;

public class MainActivity extends AppCompatActivity  {
    private Toolbar toolbar;
    private AppBarLayout appBarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MainController mController = new MainController(this);
    }



}
