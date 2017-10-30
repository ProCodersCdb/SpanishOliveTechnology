package es.procoders.spanisholivetechnology.questions;




import android.app.Activity;
import android.content.res.Resources;
import java.util.ArrayList;

import es.procoders.spanisholivetechnology.R;


public class BiomasaQuestions {
    private ArrayList<String> bioPreguntas=new ArrayList<>();


    public void rellenarBioPreguntas(Activity activity){
        Resources res= activity.getResources();
        bioPreguntas.add(res.getString(R.string.bioQ1));
        bioPreguntas.add(res.getString(R.string.bioQ2));
        bioPreguntas.add(res.getString(R.string.bioQ3));
        bioPreguntas.add(res.getString(R.string.bioQ4));
        bioPreguntas.add(res.getString(R.string.bioQ5));
        bioPreguntas.add(res.getString(R.string.bioQ6));
        bioPreguntas.add(res.getString(R.string.bioQ7));
        bioPreguntas.add(res.getString(R.string.bioQ8));


    }
}
