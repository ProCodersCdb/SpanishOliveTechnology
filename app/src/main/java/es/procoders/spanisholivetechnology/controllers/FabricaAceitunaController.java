package es.procoders.spanisholivetechnology.controllers;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import es.procoders.spanisholivetechnology.R;

/**
 * Created by T0NY on 14/11/2017.
 */

public class FabricaAceitunaController {
    private RadioButton fabricaQ3Option1, fabricaQ3Option2, fabricaQ3Option3, fabricaQ4Option1, fabricaQ4Option2, fabricaQ5Option1, fabricaQ5Option2, fabricaQ7Option1, fabricaQ7Option2, fabricaQ8Option1, fabricaQ8Option2, fabricaQ8Option3, fabricaQ8Option4, fabricaQ10Option1, fabricaQ10Option2, fabricaQ11Option1, fabricaQ11Option2, fabricaQ12Option1, fabricaQ12Option2;

    private EditText fabricaQ1edt1, fabricaQ1edt2, fabricaQ2edt, fabricaQ3edt1, fabricaQ3edt2, fabricaQ6edt, fabricaQ8edt, fabricaQ9edt, fabricaQ13edt;

    private View view;
    private GeneralSingleton controller;
    private Activity activity;
    private Button save, back;
    private String fabricaQ1str1, fabricaQ1str2, fabricaQ1strEnd, fabricaQ2str1,fabricaQ2str2,fabricaQ2strEnd,fabricaQ8str1,fabricaQ8str2,fabricaQ8strEnd;


    // ############################# Control de eventos para los editText y descripciones ############################

    switch(controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).getPregunta().getLayout()){


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).getPregunta().getLayout()) {

                    case R.layout.fabricaaceitunamesa_details_1:
                        if (!TextUtils.isEmpty(fabricaQ1edt1.getText())) {
                            fabricaQ1str1 = fabricaQ1edt1.getText().toString();
                        }
                        if (!TextUtils.isEmpty(fabricaQ1edt2.getText())) {
                            fabricaQ1str2 = fabricaQ1edt2.getText().toString();
                        }
                        fabricaQ1strEnd = fabricaQ1str1.toString() + ", " + fabricaQ1str2.toString();

                        controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ1strEnd.toString());

                        break;

                    case R.layout.fabricaaceitunamesa_details_2:
                        if(!TextUtils.isEmpty(fabricaQ2edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ2edt.getText().toString());
                        }
                        break;

                    case R.layout.fabricaaceitunamesa_details_3:
                        if (fabricaQ3Option1.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ3Option1.getText().toString());
                        } else if (fabricaQ3Option2.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ3Option2.getText().toString());
                        } else if (fabricaQ3Option3.isChecked()) {
                            if (!TextUtils.isEmpty(fabricaQ3edt1.getText()) && (!TextUtils.isEmpty(fabricaQ3edt2.getText()))) {
                                fabricaQ2str1 = fabricaQ3edt1.getText().toString();
                            }
                            if (!TextUtils.isEmpty(fabricaQ3edt1.getText()) && (!TextUtils.isEmpty(fabricaQ3edt2.getText()))) {
                                fabricaQ2str2 = fabricaQ1edt2.getText().toString();
                            }

                            fabricaQ2strEnd = fabricaQ2str1.toString() + ", " + fabricaQ2str2.toString();

                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ1strEnd.toString());
                        }

                        break;

                    case R.layout.fabricaaceitunamesa_details_4:
                        if(fabricaQ4Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ4Option1.getText().toString());

                        } else if(fabricaQ4Option2.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ4Option2.getText().toString());
                        }



                    break;
                    case R.layout.fabricaaceitunamesa_details_5:
                        if(fabricaQ5Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ5Option1.getText().toString());

                        } else if(fabricaQ5Option2.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ5Option2.getText().toString());
                        }

                    break;

                    case R.layout.fabricaaceitunamesa_details_6:
                        if(!TextUtils.isEmpty(fabricaQ6edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ6edt.getText().toString());
                        }

                    break;

                    case R.layout.fabricaaceitunamesa_details_7:
                        if(fabricaQ7Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ7Option1.getText().toString());

                        } else if(fabricaQ7Option2.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ7Option2.getText().toString());
                        }

                    break;


                    case R.layout.fabricaaceitunamesa_details_8:
                        if(fabricaQ8Option1.isChecked()) {
                            fabricaQ8str1 = fabricaQ8Option1.getText().toString();
                        }
                        else if(fabricaQ8Option2.isChecked()){
                            fabricaQ8str1 = fabricaQ8Option2.getText().toString();
                        }
                        else if(fabricaQ8Option3.isChecked()){
                            fabricaQ8str1 = fabricaQ8Option3.getText().toString();
                        }
                        else if(fabricaQ8Option4.isChecked()){
                            fabricaQ8str1 = fabricaQ8Option4.getText().toString();
                        }
                        if(!TextUtils.isEmpty(fabricaQ8edt.getText())){
                            fabricaQ8str2 = fabricaQ8edt.getText().toString();
                        }

                        fabricaQ8strEnd = fabricaQ8str1.toString() + ", " + fabricaQ8str2.toString();

                        break;


                    case R.layout.fabricaaceitunamesa_details_9:
                        if(!TextUtils.isEmpty(fabricaQ9edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ9edt.getText().toString());
                        }

                    break;

                    case R.layout.fabricaaceitunamesa_details_10:
                        if(fabricaQ10Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ10Option1.getText().toString());

                        } else if(fabricaQ10Option2.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ10Option2.getText().toString());
                        }

                    break;

                    case R.layout.fabricaaceitunamesa_details_11:
                        if(fabricaQ11Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ11Option1.getText().toString());

                        } else if(fabricaQ11Option2.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ11Option2.getText().toString());
                        }


                    break;

                    case R.layout.fabricaaceitunamesa_details_12:

                        if(fabricaQ12Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ12Option1.getText().toString());

                        } else if(fabricaQ12Option2.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ12Option2.getText().toString());
                        }
                    break;

                    case R.layout.fabricaaceitunamesa_details_13:
                        if(!TextUtils.isEmpty(fabricaQ13edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(fabricaQ13edt.getText().toString());
                        }

                    break;


        }


    }
