package es.procoders.spanisholivetechnology.controllers;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.Pregunta;
import es.procoders.spanisholivetechnology.beans.Respuesta;

/**
 * Created by bjfem on 11/11/2017.
 */

public class BiomasaController {
    RadioButton det1opcion1, det1opcion2, det2opcion1, det2opcion2, det2opcion3, det3opcion1, det3opcion2, det3opcion3, det4opcion1, det4opcion2, det7opcion1, det7opcion2;
    EditText edtDetails5, edtDetails6, edtDetails8;
    Button save;
    private View view;
    GeneralSingleton controller;
    Activity activity;



    public BiomasaController(final View v, final Activity activity){
        this.view = v;
        this.activity=activity;
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
        save = v.findViewById(R.id.btnSaveBiomasa);
        controller = GeneralSingleton.getInstance();
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Respuesta res= controller.getRespuesta().get(controller.getPosition());


                switch (res.getPregunta().getLayout()) {
                    case R.layout.bio_details_1:
                        if(det1opcion1.isChecked()){

                            res.setStr(det1opcion1.getText().toString());

                        } else if(det1opcion2.isChecked()){
                            res.setStr(det1opcion2.getText().toString());

                        }
                        break;

                    case R.layout.bio_details_2:
                        if(det2opcion1.isChecked()){
                            res.setStr(det2opcion1.getText().toString());

                        } else if(det2opcion2.isChecked()){
                            res.setStr(det2opcion2.getText().toString());

                        } else if(det2opcion3.isChecked()){
                            res.setStr(det2opcion3.getText().toString());

                        }

                        break;

                    case R.layout.bio_details_3:
                        if(det3opcion1.isChecked()){
                            res.setStr(det3opcion1.getText().toString());

                        } else if(det3opcion2.isChecked()){
                            res.setStr(det3opcion2.getText().toString());

                        } else if(det3opcion3.isChecked()){
                            res.setStr(det3opcion3.getText().toString());

                        }
                        break;

                    case R.layout.bio_details_4:
                        if(det4opcion1.isChecked()){
                            res.setStr(det4opcion1.getText().toString());

                        } else if(det4opcion2.isChecked()){
                            res.setStr(det4opcion2.getText().toString());

                        }
                        break;

                    case R.layout.bio_details_5:
                        if(!TextUtils.isEmpty(edtDetails5.getText())){
                            res.setStr(edtDetails5.getText().toString());

                        }
                        break;

                    case R.layout.bio_details_6:
                        if(!TextUtils.isEmpty(edtDetails6.getText())){
                            res.setStr(edtDetails6.getText().toString());

                        }
                        break;

                    case R.layout.bio_details_7:
                        if(det7opcion1.isChecked()){
                            res.setStr(det7opcion1.getText().toString());

                        } else if(det7opcion2.isChecked()){
                            res.setStr(det7opcion2.getText().toString());

                        }
                        break;

                    case R.layout.bio_details_8:
                        if(!TextUtils.isEmpty(edtDetails8.getText())){
                            res.setStr(edtDetails8.getText().toString());

                        }
                        break;

                }
                // DAO
                //controller.getMapa().put(controller.getRespuesta().getPregunta(), controller.getRespuesta());
                controller.getMapa().put(controller.getRespuesta().get(controller.getPosition()).getPregunta(), res);
                activity.onBackPressed();
                Toast.makeText(v.getContext(), "Guardado", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
