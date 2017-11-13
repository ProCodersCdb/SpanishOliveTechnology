package es.procoders.spanisholivetechnology.controllers;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import es.procoders.spanisholivetechnology.R;

public class PlantacionController {
    RadioButton plantacionQ3Option1, plantacionQ3Option2, plantacionQ3Option3, plantacionQ4Option1, plantacionQ4Option2, plantacionQ4Option3, plantacionQ4Option4,
            plantacionQ5Option1, plantacionQ5Option2, plantacionQ7Option1, plantacionQ7Option2, plantacionQ8Option1, plantacionQ8Option2, plantacionQ9Option1,
            plantacionQ9Option2, plantacionQ10Option1, plantacionQ10Option2, plantacionQ14Option1, plantacionQ14Option2;

    EditText plantacionQ1edt1, plantacionQ1edt2, plantacionQ2edt, plantacionQ6edt, plantacionQ7edt, plantacionQ10edt, plantacionQ11edt, plantacionQ12edt,
            plantacionQ13edt, plantacionQ15edt;

    private View view;
    GeneralSingleton controller;
    Activity activity;
    Button save, back;
    TextView plantacionQ1desc, plantacionQ2desc, plantacionQ6desc, plantacionQ7desc, plantacionQ10desc, plantacionQ11desc, plantacionQ12desc, plantacionQ13desc,
            plantacionQ15desc;



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

            case R.layout.plantacion_details_1:
                plantacionQ1desc = v.findViewById(R.id.plantacionQ1Description);
                plantacionQ1edt1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (hasFocus) {
                            plantacionQ1desc.setText(R.string.noText);
                        }
                    }
                });

                plantacionQ1edt2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (hasFocus) {
                            plantacionQ1desc.setText(R.string.noText);
                        }
                    }
                });
                break;

            case R.layout.plantacion_details_2:
                plantacionQ2desc = v.findViewById(R.id.plantacionQ2Description);
                plantacionQ2edt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (hasFocus) {
                            plantacionQ2desc.setText(R.string.noText);
                        }
                    }
                });
                break;

            case R.layout.plantacion_details_6:
                plantacionQ6desc = v.findViewById(R.id.plantacionQ6Description);
                plantacionQ6edt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (hasFocus) {
                            plantacionQ6desc.setText(R.string.noText);
                        }
                    }
                });
                break;

            case R.layout.plantacion_details_7:
                plantacionQ7desc = v.findViewById(R.id.plantacionQ7Description);
                plantacionQ7edt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (hasFocus) {
                            plantacionQ7desc.setText(R.string.noText);
                        }
                    }
                });
                break;

            case R.layout.plantacion_details_10:
                plantacionQ10desc = v.findViewById(R.id.plantacionQ10Description);
                plantacionQ10edt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (hasFocus) {
                            plantacionQ10desc.setText(R.string.noText);
                        }
                    }
                });
                break;

                case R.layout.plantacion_details_11:
                plantacionQ11desc = v.findViewById(R.id.plantacionQ11Description);
                plantacionQ11edt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (hasFocus) {
                            plantacionQ11desc.setText(R.string.noText);
                        }
                    }
                });
                break;

            case R.layout.plantacion_details_12:
                plantacionQ12desc = v.findViewById(R.id.plantacionQ12Description);
                plantacionQ12edt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (hasFocus) {
                            plantacionQ12desc.setText(R.string.noText);
                        }
                    }
                });
                break;

            case R.layout.plantacion_details_13:
                plantacionQ13desc = v.findViewById(R.id.plantacionQ13Description);
                plantacionQ13edt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (hasFocus) {
                            plantacionQ13desc.setText(R.string.noText);
                        }
                    }
                });
                break;

            case R.layout.plantacion_details_15:
                plantacionQ15desc = v.findViewById(R.id.plantacionQ15Description);
                plantacionQ15edt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (hasFocus) {
                            plantacionQ15desc.setText(R.string.noText);
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
                        if(!TextUtils.isEmpty(plantacionQ1edt1.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ1edt1.getText().toString());
                        }
                        if(!TextUtils.isEmpty(plantacionQ1edt2.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ1edt2.getText().toString());
                        }
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
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ7Option1.getText().toString());

                        } else if(plantacionQ5Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ7Option2.getText().toString());

                        }
                        if(!TextUtils.isEmpty(plantacionQ7edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ7edt.getText().toString());
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
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ10Option1.getText().toString());

                        } else if(plantacionQ10Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ10Option2.getText().toString());

                        }
                        if(!TextUtils.isEmpty(plantacionQ10edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(plantacionQ10edt.getText().toString());
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
