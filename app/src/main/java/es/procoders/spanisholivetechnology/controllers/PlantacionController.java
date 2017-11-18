package es.procoders.spanisholivetechnology.controllers;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import es.procoders.spanisholivetechnology.R;

public class PlantacionController {
    private RadioButton plantacionQ3Option1, plantacionQ3Option2, plantacionQ3Option3, plantacionQ4Option1, plantacionQ4Option2, plantacionQ4Option3, plantacionQ4Option4,
            plantacionQ5Option1, plantacionQ5Option2, plantacionQ7Option1, plantacionQ7Option2, plantacionQ8Option1, plantacionQ8Option2, plantacionQ9Option1,
            plantacionQ9Option2, plantacionQ10Option1, plantacionQ10Option2, plantacionQ14Option1, plantacionQ14Option2;

    private EditText plantacionQ1edt1, plantacionQ1edt2, plantacionQ2edt, plantacionQ6edt, plantacionQ7edt, plantacionQ10edt, plantacionQ11edt, plantacionQ12edt,
            plantacionQ13edt, plantacionQ15edt;

    private View view;
    private GeneralSingleton controller;
    private Activity activity;
    private Button save, back;
    private String plantacionQ1str1, plantacionQ1str2, plantacionQ1strEnd;

    LinearLayout plantacionQ7edtContent, plantacionQ10edtContent;



    public PlantacionController(final View v, final Activity activity){
        this.view = v;
        this.activity=activity;

        plantacionQ1edt1 = v.findViewById(R.id.plantacionQ1edt1);
        plantacionQ1edt2 = v.findViewById(R.id.plantacionQ1edt2);
        plantacionQ2edt = v.findViewById(R.id.plantacionQ2edt);
        plantacionQ3Option1 = v.findViewById(R.id.plantacionQ3Option1);
        plantacionQ3Option2 = v.findViewById(R.id.plantacionQ3Option2);
        plantacionQ3Option3 = v.findViewById(R.id.plantacionQ3Option3);
        plantacionQ4Option1 = v.findViewById(R.id.plantacionQ4Option1);
        plantacionQ4Option2 = v.findViewById(R.id.plantacionQ4Option2);
        plantacionQ4Option3 = v.findViewById(R.id.plantacionQ4Option3);
        plantacionQ4Option4 = v.findViewById(R.id.plantacionQ4Option4);
        plantacionQ5Option1 = v.findViewById(R.id.plantacionQ5Option1);
        plantacionQ5Option2 = v.findViewById(R.id.plantacionQ5Option2);
        plantacionQ6edt = v.findViewById(R.id.plantacionQ6edt);
        plantacionQ7Option1 = v.findViewById(R.id.plantacionQ7Option1);
        plantacionQ7Option2 = v.findViewById(R.id.plantacionQ7Option2);
        plantacionQ7edt = v.findViewById(R.id.plantacionQ7edt);
        plantacionQ8Option1 = v.findViewById(R.id.plantacionQ8Option1);
        plantacionQ8Option2 = v.findViewById(R.id.plantacionQ8Option2);
        plantacionQ9Option1 = v.findViewById(R.id.plantacionQ9Option1);
        plantacionQ9Option2 = v.findViewById(R.id.plantacionQ9Option2);
        plantacionQ10Option1 = v.findViewById(R.id.plantacionQ10Option1);
        plantacionQ10Option2 = v.findViewById(R.id.plantacionQ10Option2);
        plantacionQ10edt = v.findViewById(R.id.plantacionQ10edt);
        plantacionQ11edt = v.findViewById(R.id.plantacionQ11edt);
        plantacionQ12edt = v.findViewById(R.id.plantacionQ12edt);
        plantacionQ13edt = v.findViewById(R.id.plantacionQ13edt);
        plantacionQ14Option1 = v.findViewById(R.id.plantacionQ14Option1);
        plantacionQ14Option2 = v.findViewById(R.id.plantacionQ14Option2);
        plantacionQ15edt = v.findViewById(R.id.plantacionQ15edt);

        save = v.findViewById(R.id.btnOptionSave);
        back = v.findViewById(R.id.btnBack);

        controller = GeneralSingleton.getInstance();


// ############################# Control de eventos para los editText y descripciones ############################

        switch (controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).getPregunta().getLayout()){

            case R.layout.plantacion_details_7:
                plantacionQ7edtContent = v.findViewById(R.id.plantacionQ7edtContent);
                plantacionQ7edtContent.setVisibility(View.GONE);

                RadioGroup rGroupQ7 = (RadioGroup)v.findViewById(R.id.plantacionQ7Group);
                rGroupQ7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId){
                            case R.id.plantacionQ7Option1:
                                plantacionQ7edtContent.setVisibility(View.VISIBLE);
                                break;
                            case R.id.plantacionQ7Option2:
                                plantacionQ7edtContent.setVisibility(View.GONE);
                                break;
                        }
                    }
                });
                break;

            case R.layout.plantacion_details_10:
                plantacionQ10edtContent = v.findViewById(R.id.plantacionQ10edtContent);

                plantacionQ10edtContent.setVisibility(View.GONE);

                RadioGroup rGroupQ10 = (RadioGroup)v.findViewById(R.id.plantacionQ10Group);
                rGroupQ10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId){
                            case R.id.plantacionQ10Option1:
                                plantacionQ10edtContent.setVisibility(View.VISIBLE);
                                break;
                            case R.id.plantacionQ10Option2:
                                plantacionQ10edtContent.setVisibility(View.GONE);
                                break;
                        }
                    }
                });
                break;

            default:
                break;
        }

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).getPregunta().getLayout()) {

                    case R.layout.plantacion_details_1:
                        if(!TextUtils.isEmpty(plantacionQ1edt1.getText())) {
                            plantacionQ1str1 = plantacionQ1edt1.getText().toString();
                        }
                        if(!TextUtils.isEmpty(plantacionQ1edt2.getText())){
                            plantacionQ1str2 = plantacionQ1edt2.getText().toString();
                        }
                        plantacionQ1strEnd = plantacionQ1str1.toString() + ", " + plantacionQ1str2.toString();

                        controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ1strEnd.toString());

                        break;

                    case R.layout.plantacion_details_2:
                        if(!TextUtils.isEmpty(plantacionQ2edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ2edt.getText().toString());
                        }
                        break;

                    case R.layout.plantacion_details_3:
                        if(plantacionQ3Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ3Option1.getText().toString());

                        } else if(plantacionQ3Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ3Option2.getText().toString());

                        } else if(plantacionQ3Option3.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ3Option3.getText().toString());

                        }
                        break;

                    case R.layout.plantacion_details_4:
                        if(plantacionQ4Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ4Option1.getText().toString());

                        } else if(plantacionQ4Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ4Option2.getText().toString());

                        } else if(plantacionQ4Option3.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ4Option3.getText().toString());

                        } else if(plantacionQ4Option4.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ4Option4.getText().toString());

                        }
                        break;

                    case R.layout.plantacion_details_5:
                        if(plantacionQ5Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ5Option1.getText().toString());

                        } else if(plantacionQ5Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ5Option2.getText().toString());

                        }
                        break;

                    case R.layout.plantacion_details_6:
                        if(!TextUtils.isEmpty(plantacionQ6edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ6edt.getText().toString());
                        }
                        break;

                    case R.layout.plantacion_details_7:
                        if(plantacionQ7Option1.isChecked()){
                            if(!TextUtils.isEmpty(plantacionQ7edt.getText())){
                                controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ7edt.getText().toString());
                            }
                        } else if(plantacionQ7Option2.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ7Option2.getText().toString());
                        }
                        break;

                    case R.layout.plantacion_details_8:
                        if(plantacionQ8Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ8Option1.getText().toString());

                        } else if(plantacionQ8Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ8Option2.getText().toString());

                        }
                        break;

                    case R.layout.plantacion_details_9:
                        if(plantacionQ9Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ9Option1.getText().toString());

                        } else if(plantacionQ9Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ9Option2.getText().toString());

                        }
                        break;

                    case R.layout.plantacion_details_10:
                        if(plantacionQ10Option1.isChecked()){
                            if(!TextUtils.isEmpty(plantacionQ10edt.getText())){
                                controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ10edt.getText().toString());
                            }
                        } else if(plantacionQ10Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ10Option2.getText().toString());
                        }
                        break;

                    case R.layout.plantacion_details_11:
                        if(!TextUtils.isEmpty(plantacionQ11edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ11edt.getText().toString());
                        }
                        break;

                    case R.layout.plantacion_details_12:
                        if(!TextUtils.isEmpty(plantacionQ12edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ12edt.getText().toString());
                        }
                        break;

                    case R.layout.plantacion_details_13:
                        if(!TextUtils.isEmpty(plantacionQ13edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ13edt.getText().toString());
                        }
                        break;

                    case R.layout.plantacion_details_14:
                        if(plantacionQ14Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ14Option1.getText().toString());

                        } else if(plantacionQ14Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ14Option2.getText().toString());

                        }
                        break;

                    case R.layout.plantacion_details_15:
                        if(!TextUtils.isEmpty(plantacionQ15edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ15edt.getText().toString());
                        }
                        break;

                }
                // DAO
                //controller.getMapa().put(controller.getRespuesta().getPregunta(), controller.getRespuesta());
                activity.onBackPressed();
                Toast.makeText(v.getContext(), "Guardado", Toast.LENGTH_SHORT).show();
            }

        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onBackPressed();
            }
        });
    }
}
