package es.procoders.spanisholivetechnology.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

import es.procoders.spanisholivetechnology.R;

public class ResultActivity extends AppCompatActivity {

    TextView tv1 = (TextView) findViewById(R.id.textView1);
    TextView tv2 = (TextView) findViewById(R.id.textView2);
    TextView tv3 = (TextView) findViewById(R.id.textView3);
    TextView tv4 = (TextView) findViewById(R.id.textView4);
    TextView tv5 = (TextView) findViewById(R.id.textView5);
    TextView tv6 = (TextView) findViewById(R.id.textView6);
    TextView tv7 = (TextView) findViewById(R.id.textView7);
    TextView tv8 = (TextView) findViewById(R.id.textView8);

    TextView res1 = (TextView) findViewById(R.id.res1);
    TextView res2 = (TextView) findViewById(R.id.res2);
    TextView res3 = (TextView) findViewById(R.id.res3);
    TextView res4 = (TextView) findViewById(R.id.res4);
    TextView res5 = (TextView) findViewById(R.id.res5);
    TextView res6 = (TextView) findViewById(R.id.res6);
    TextView res7 = (TextView) findViewById(R.id.res7);
    TextView res8 = (TextView) findViewById(R.id.res8);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ArrayList<String> getBiomasa = new ArrayList<>();

        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra("datos")) {
                ArrayList dat = intent.getStringArrayListExtra("datos");
                showData(dat);
            }
        }

    }

    public void showData(ArrayList datosBiomasa) {

        res1.setText(datosBiomasa.get(0).toString());
        res2.setText(datosBiomasa.get(1).toString());
        res3.setText(datosBiomasa.get(2).toString());
        res4.setText(datosBiomasa.get(3).toString());
        res5.setText(datosBiomasa.get(4).toString());
        res6.setText(datosBiomasa.get(5).toString());
        res7.setText(datosBiomasa.get(6).toString());
        res8.setText(datosBiomasa.get(7).toString());

    }
}
