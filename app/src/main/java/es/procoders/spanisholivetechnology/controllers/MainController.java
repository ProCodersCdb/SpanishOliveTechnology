package es.procoders.spanisholivetechnology.controllers;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.activities.BiomasaActivity;

public class MainController implements View.OnClickListener {
    private Activity activity;
    Button btn ;

    public MainController(Activity activity) {
        this.activity = activity;
        btn = (Button) activity.findViewById(R.id.btnNext);
        btn.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {
        Intent intent=new Intent(activity, BiomasaActivity.class);
        activity.startActivity(intent);

    }
}
