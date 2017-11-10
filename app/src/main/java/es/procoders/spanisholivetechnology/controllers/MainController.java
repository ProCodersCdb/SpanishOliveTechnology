package es.procoders.spanisholivetechnology.controllers;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.activities.BiomasaActivity;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */

public class MainController {

    private static DrawerLayout drawerLayout;
    private Activity activity;
    private Button btn ;
    private Toolbar toolbar;
    private static AppBarLayout appBarLayout;
    private static NavigationView navigationView;
    private View view;

    /**
     * @param activity el controlador recibe este parámetro y trabaja sobre él
     *                 para saber como actuar
     */

    public MainController(Activity activity) {
        this.activity = activity;
        //btn = (Button) activity.findViewById(R.id.btnNext);
        //btn.setOnClickListener(this);
    }

    // ######################## GESTION DE MENU LATERAL ################################


    public static void changeFragment(Fragment fragment, MenuItem item,Activity v) {
        ((AppCompatActivity)v).getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content_frame, fragment)
                .commit();
        item.setChecked(true);
        ((AppCompatActivity)v).getSupportActionBar().setTitle(item.getTitle());


    }

    public static void setToolBar(Activity v) {
        Toolbar toolbar=(Toolbar) v.findViewById(R.id.toolbar);
        toolbar.setTitle("");
        ((AppCompatActivity)v).setSupportActionBar(toolbar);
        ((AppCompatActivity)v).getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);
        ((AppCompatActivity)v).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public static void loadMenu(final Activity act){

        drawerLayout = act.findViewById(R.id.drawer_layout);
        navigationView =(NavigationView) act.findViewById(R.id.navview);
        //setFragmentByDefault();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                boolean fragmentTransaction = false;
                Fragment fragment= null;


                switch (item.getItemId()){
                    case R.id.inicio:
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.menu_plantacion:
                        // fragment=new Plantacion();
                        fragmentTransaction = true;


                        break;
                    case R.id.menu_almanzara:
                        //  fragment=new Almanzara();
                        fragmentTransaction = true;

                        break;
                    case R.id.menu_fabrica:


                        break;

                    case R.id.menu_aceite:


                        break;

                    case R.id.menu_aceituna:

                        break;
                    case R.id.menu_biomasa:
                        act.startActivity(new Intent(act.getApplicationContext(),BiomasaActivity.class));

                        break;
                }
                if(fragmentTransaction){
                    ((AppCompatActivity)act).getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content_frame, fragment)
                            .commit();
                    item.setChecked(true);
                    changeFragment(fragment, item, new Activity());
                    drawerLayout.closeDrawers();

                }

                return true;
            }
        });

    }

    public static void openDrawer(){
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public static void toast(View v){
        Toast.makeText(v.getContext(), "No se puede enviar la petición. Formulario no relleno.", Toast.LENGTH_LONG).show();
    }
}
