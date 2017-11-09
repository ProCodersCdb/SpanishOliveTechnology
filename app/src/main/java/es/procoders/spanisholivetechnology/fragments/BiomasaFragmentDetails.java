package es.procoders.spanisholivetechnology.fragments;


import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.BiomasaBean;
import es.procoders.spanisholivetechnology.controllers.BiomasaSingleton;
import es.procoders.spanisholivetechnology.questions.BiomasaQuestions;
import es.procoders.spanisholivetechnology.questions.Options;

/**
 * A simple {@link Fragment} subclass.
 * @author Procoders
 * @version 1.0
 * @since API 21
 */
public class BiomasaFragmentDetails extends android.support.v4.app.Fragment implements View.OnClickListener {
    /**
     *
     */

    BiomasaSingleton controller;
    Button save, back;
    RadioButton det1opcion1, det1opcion2, det2opcion1, det2opcion2, det2opcion3, det3opcion1, det3opcion2, det3opcion3, det4opcion1, det4opcion2, det7opcion1, det7opcion2;
    EditText edtDetails5, edtDetails6, edtDetails8;
    TextView txtDetails6, txtDetails7, txtDetails5;


    public BiomasaFragmentDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        controller = BiomasaSingleton.getInstance();
        ArrayList<Options> options = new BiomasaQuestions(getContext()).getBioPreguntas();
        View rootView = inflater.inflate(options.get(controller.getPosition()).getLayout(), container, false);

        initViews(rootView);

        save.setOnClickListener(this);
        back.setOnClickListener(this);

        return rootView;
    }

    private void initViews(View v) {
        det1opcion1 = v.findViewById(R.id.det1opcion1);
        det1opcion2 = v.findViewById(R.id.det1opcion2);
        det2opcion1 = v.findViewById(R.id.det2opcion1);
        det2opcion2 = v.findViewById(R.id.det2opcion2);
        det2opcion3 = v.findViewById(R.id.det2opcion3);
        det3opcion1 = v.findViewById(R.id.det3opcion1);
        det3opcion2 = v.findViewById(R.id.det3opcion2);
        det3opcion3 = v.findViewById(R.id.det3opcion3);
        det4opcion1 = v.findViewById(R.id.det4opcion1);
        det4opcion2 = v.findViewById(R.id.det4opcion2);
        edtDetails5 = v.findViewById(R.id.edtDetails5);
        edtDetails6 = v.findViewById(R.id.edtDetails6);
        det7opcion1 = v.findViewById(R.id.det7opcion1);
        det7opcion2 = v.findViewById(R.id.det7opcion2);
        edtDetails8 = v.findViewById(R.id.edtDetails8);
        save = v.findViewById(R.id.btnOptionSave);
        back = v.findViewById(R.id.btnBack);

    }

    @Override
    public void onClick(View v) {
        BiomasaBean bio= controller.getBiomasa();


        switch (v.getId()){
            case R.id.btnOptionSave:
                switch (controller.getPosition()) {
                    case 0:
                        if(det1opcion1.isChecked()){
                            bio.setBioQ1(det1opcion1.getText().toString());
                        } else if(det1opcion2.isChecked()){
                            bio.setBioQ1(det1opcion2.getText().toString());
                        }
                        setArray(bio.getBioQ1());
                        break;

                    case 1:
                        if(det2opcion1.isChecked()){
                            bio.setBioQ2(det2opcion1.getText().toString());
                        } else if(det2opcion2.isChecked()){
                            bio.setBioQ2(det2opcion2.getText().toString());
                        } else if(det2opcion3.isChecked()){
                            bio.setBioQ2(det2opcion3.getText().toString());
                        }
                        setArray(bio.getBioQ2());
                        break;

                    case 2:
                        if(det3opcion1.isChecked()){
                            bio.setBioQ3(det3opcion1.getText().toString());
                        } else if(det3opcion2.isChecked()){
                            bio.setBioQ3(det3opcion2.getText().toString());
                        } else if(det3opcion3.isChecked()){
                            bio.setBioQ3(det3opcion3.getText().toString());
                        }
                        setArray(bio.getBioQ3());
                        break;

                    case 3:
                        if(det4opcion1.isChecked()){
                            bio.setBioQ4(det4opcion1.getText().toString());
                        } else if(det4opcion2.isChecked()){
                            bio.setBioQ4(det4opcion2.getText().toString());
                        }
                        setArray(bio.getBioQ4());
                        break;

                    case 4:
                        if(!TextUtils.isEmpty(edtDetails5.getText())){
                            bio.setBioQ5(Float.parseFloat(edtDetails5.getText().toString()));
                        }
                        setArray(bio.getBioQ5().toString());
                        break;

                    case 5:
                        if(!TextUtils.isEmpty(edtDetails6.getText())){
                            bio.setBioQ6(edtDetails6.getText().toString());
                        }
                        setArray(bio.getBioQ6());
                        break;

                    case 6:
                        if(det7opcion1.isChecked()){
                            bio.setBioQ7(det7opcion1.getText().toString());
                        } else if(det7opcion2.isChecked()){
                            bio.setBioQ7(det7opcion2.getText().toString());
                        }
                        setArray(bio.getBioQ7());
                        break;

                    case 7:
                        if(!TextUtils.isEmpty(edtDetails8.getText())){
                            bio.setBioQ8(edtDetails8.getText().toString());
                        }
                        setArray(bio.getBioQ8());
                        break;

                }
                controller.setBiomasa(bio);
                // DAO
                Toast.makeText(v.getContext(), "Guardado", Toast.LENGTH_SHORT).show();

            case R.id.btnBack:
                getActivity().onBackPressed();
                break;
        }


    }

    private void setArray(String str) {
        ArrayList<Options> array = controller.getBioQ();
        array.get(controller.getPosition()).setDescription(str);
        controller.setBioQ(array);
    }


}
