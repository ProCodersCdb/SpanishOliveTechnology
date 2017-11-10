package es.procoders.spanisholivetechnology.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.controllers.MainController;

public class MainActivity extends AppCompatActivity  {

    MainController mController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mController = new MainController(this);

        mController.setToolBar(this);

        mController.loadMenu(this);

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:
                //abrir menú lateral
                mController.openDrawer();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}



