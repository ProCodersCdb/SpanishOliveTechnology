package es.procoders.spanisholivetechnology.activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.controllers.BiomasaController;
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
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MainController mController = new MainController(this);

        setToolBar();
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView =(NavigationView) findViewById(R.id.navview);
        //setFragmentByDefault();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                boolean fragmentTransaction = false;
                Fragment fragment= null;


                switch (item.getItemId()){
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
                        startActivity(new Intent(getApplicationContext(),BiomasaActivity.class));

                        break;
                }
                if(fragmentTransaction){
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content_frame, fragment)
                            .commit();
                    item.setChecked(true);
                    changeFragment(fragment, item);
                    drawerLayout.closeDrawers();

                }

                return true;
            }
        });
    }

    /*private void setFragmentByDefault() {
        changeFragment(new BiomasaActivity(),navigationView.getMenu().getItem(0));
    }*/

    private void changeFragment(Fragment fragment, MenuItem item) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content_frame, fragment)
                .commit();
        item.setChecked(true);
        getSupportActionBar().setTitle(item.getTitle());


    }

    private void setToolBar() {
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                //abrir menú lateral
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}



