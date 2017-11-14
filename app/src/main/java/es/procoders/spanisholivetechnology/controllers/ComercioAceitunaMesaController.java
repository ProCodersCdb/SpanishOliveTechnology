package es.procoders.spanisholivetechnology.controllers;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import es.procoders.spanisholivetechnology.R;

/**
 * Created by usuario on 14/11/2017.
 */

public class ComercioAceitunaMesaController {

    private RadioButton comercioAceitunaQ1Option1, comercioAceitunaQ1Option2, comercioAceitunaQ2Option1, comercioAceitunaQ2Option2,
            comercioAceitunaQ3Option1, comercioAceitunaQ3Option2, comercioAceitunaQ3Option3, comercioAceitunaQ4Option1,
            comercioAceitunaQ4Option2, comercioAceitunaQ5Option1, comercioAceitunaQ5Option2, comercioAceitunaQ5Option3;


    private EditText comercioAceitunaQ6edt, comercioAceitunaQ7edt, comercioAceitunaQ8edt, comercioAceitunaQ9edt;

    private Button back, save;

    private View view;
    GeneralSingleton controller;
    Activity activity;


    public ComercioAceitunaMesaController(final View v, final Activity activity) {
        this.view = v;
        this.activity = activity;


        comercioAceitunaQ1Option1 = v.findViewById(R.id.comercioAceitunaQ1Option1);
        comercioAceitunaQ1Option2 = v.findViewById(R.id.comercioAceitunaQ1Option2);
        comercioAceitunaQ2Option1 = v.findViewById(R.id.comercioAceitunaQ2Option1);
        comercioAceitunaQ2Option2 = v.findViewById(R.id.comercioAceitunaQ2Option2);
        comercioAceitunaQ3Option1 = v.findViewById(R.id.comercioAceitunaQ3Option1);
        comercioAceitunaQ3Option2 = v.findViewById(R.id.comercioAceitunaQ3Option2);
        comercioAceitunaQ3Option3 = v.findViewById(R.id.comercioAceitunaQ3Option3);
        comercioAceitunaQ4Option1 = v.findViewById(R.id.comercioAceitunaQ4Option1);
        comercioAceitunaQ4Option2 = v.findViewById(R.id.comercioAceitunaQ4Option2);
        comercioAceitunaQ5Option1 = v.findViewById(R.id.comercioAceitunaQ5Option1);
        comercioAceitunaQ5Option2 = v.findViewById(R.id.comercioAceitunaQ5Option2);
        comercioAceitunaQ5Option3 = v.findViewById(R.id.comercioAceitunaQ5Option3);


        comercioAceitunaQ6edt = v.findViewById(R.id.comercioAceitunaQ6edt);
        comercioAceitunaQ7edt = v.findViewById(R.id.comercioAceitunaQ7edt);
        comercioAceitunaQ8edt = v.findViewById(R.id.comercioAceitunaQ8edt);
        comercioAceitunaQ9edt = v.findViewById(R.id.comercioAceitunaQ9edt);


        back = v.findViewById(R.id.btnBack);
        save = v.findViewById(R.id.btnOptionSave);

        controller = GeneralSingleton.getInstance();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).getPregunta().getLayout()) {

                    case R.layout.comercoaceitunamesa_details_1:

                        if(comercioAceitunaQ1Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ1Option1.getText().toString());

                        } else if(comercioAceitunaQ1Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ1Option2.getText().toString());

                        }

                        break;

                    case R.layout.comercoaceitunamesa_details_2:

                        if(comercioAceitunaQ2Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ2Option1.getText().toString());

                        } else if(comercioAceitunaQ2Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ2Option2.getText().toString());

                        }

                        break;

                    case R.layout.comercoaceitunamesa_details_3:

                        if(comercioAceitunaQ3Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ3Option1.getText().toString());

                        } else if(comercioAceitunaQ3Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ3Option2.getText().toString());

                        }else if(comercioAceitunaQ3Option3.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ3Option3.getText().toString());

                        }

                        break;

                    case R.layout.comercoaceitunamesa_details_4:

                        if(comercioAceitunaQ4Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ4Option1.getText().toString());

                        } else if(comercioAceitunaQ4Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ4Option2.getText().toString());

                        }

                        break;

                    case R.layout.comercoaceitunamesa_details_5:

                        if(comercioAceitunaQ5Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ5Option1.getText().toString());

                        } else if(comercioAceitunaQ5Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ5Option2.getText().toString());

                        }else if(comercioAceitunaQ5Option3.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ5Option3.getText().toString());

                        }

                        break;

                    case R.layout.comercoaceitunamesa_details_6:

                        if(!TextUtils.isEmpty(comercioAceitunaQ6edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ6edt.getText().toString());
                        }

                        break;

                    case R.layout.comercoaceitunamesa_details_7:

                        if(!TextUtils.isEmpty(comercioAceitunaQ7edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ7edt.getText().toString());
                        }

                        break;

                    case R.layout.comercoaceitunamesa_details_8:

                        if(!TextUtils.isEmpty(comercioAceitunaQ8edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ8edt.getText().toString());
                        }

                        break;


                    case R.layout.comercioaceiteoliva_details_9:

                        if(!TextUtils.isEmpty(comercioAceitunaQ9edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceitunaQ9edt.getText().toString());
                        }

                        break;
                }
            }


        });
    }
}

