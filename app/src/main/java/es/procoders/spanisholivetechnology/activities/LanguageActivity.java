package es.procoders.spanisholivetechnology.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import es.procoders.spanisholivetechnology.R;

/**
 * @author Procoders
 * @since API 21
 * @version 1.0
 */


public class LanguageActivity extends AppCompatActivity {

    /**
     *
     * @param savedInstanceState hace un guardado de la información recabada en la elección de
     *                           la lengua
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
    }
}
