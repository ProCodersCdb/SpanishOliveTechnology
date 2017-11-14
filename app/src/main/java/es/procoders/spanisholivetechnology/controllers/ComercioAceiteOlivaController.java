package es.procoders.spanisholivetechnology.controllers;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import es.procoders.spanisholivetechnology.R;

/**
 *
 */

public class ComercioAceiteOlivaController {

    private RadioButton comercioAceiteQ1Option1, comercioAceiteQ1Option2,comercioAceiteQ12Option1, comercioAceiteQ12Option2,
            comercioAceiteQ13Option1, comercioAceiteQ13Option2, comercioAceiteQ3Option1, comercioAceiteQ3Option2,
            comercioAceiteQ4Option1, comercioAceiteQ4Option2, comercioAceiteQ4Option3, comercioAceiteQ6Option1,
            comercioAceiteQ6Option2, comercioAceiteQ9Option1, comercioAceiteQ9Option2;

    private EditText comercioAceiteQ10edt, comercioAceiteQ11edt, comercioAceiteQ13edt, comercioAceiteQ14edt,
            comercioAceiteQ5edt, comercioAceiteQ7edt, comercioAceiteQ8edt;

    private CheckBox comercioAceiteQ2Option1, comercioAceiteQ2Option2, comercioAceiteQ2Option3, comercioAceiteQ2Option4,
            comercioAceiteQ2Option5, comercioAceiteQ2End;

    private Button back, save;

    private View view;
    GeneralSingleton controller;
    Activity activity;



    public ComercioAceiteOlivaController(final View v, final Activity activity) {
        this.view = v;
        this.activity = activity;

        comercioAceiteQ1Option1 = v.findViewById(R.id.comercioAceiteQ1Option1);
        comercioAceiteQ1Option2 = v.findViewById(R.id.comercioAceiteQ1Option2);
        comercioAceiteQ12Option1 = v.findViewById(R.id.comercioAceiteQ12Option1);
        comercioAceiteQ12Option2 = v.findViewById(R.id.comercioAceiteQ12Option2);
        comercioAceiteQ13Option1 = v.findViewById(R.id.comercioAceiteQ13Option1);
        comercioAceiteQ13Option2 = v.findViewById(R.id.comercioAceiteQ13Option2);
        comercioAceiteQ3Option1 = v.findViewById(R.id.comercioAceiteQ3Option1);
        comercioAceiteQ3Option2 = v.findViewById(R.id.comercioAceiteQ3Option2);
        comercioAceiteQ4Option1 = v.findViewById(R.id.comercioAceiteQ4Option1);
        comercioAceiteQ4Option2 = v.findViewById(R.id.comercioAceiteQ4Option2);
        comercioAceiteQ4Option3 = v.findViewById(R.id.comercioAceiteQ4Option3);
        comercioAceiteQ6Option1 = v.findViewById(R.id.comercioAceiteQ6Option1);
        comercioAceiteQ6Option2 = v.findViewById(R.id.comercioAceiteQ6Option2);
        comercioAceiteQ9Option1 = v.findViewById(R.id.comercioAceiteQ9Option1);
        comercioAceiteQ9Option2 = v.findViewById(R.id.comercioAceiteQ9Option2);


        comercioAceiteQ10edt = v.findViewById(R.id.comercioAceiteQ10edt);
        comercioAceiteQ11edt = v.findViewById(R.id.comercioAceiteQ11edt);
        comercioAceiteQ13edt = v.findViewById(R.id.comercioAceiteQ13edt);
        comercioAceiteQ14edt = v.findViewById(R.id.comercioAceiteQ14edt);
        comercioAceiteQ5edt = v.findViewById(R.id.comercioAceiteQ5edt);
        comercioAceiteQ7edt = v.findViewById(R.id.comercioAceiteQ7edt);
        comercioAceiteQ8edt = v.findViewById(R.id.comercioAceiteQ8edt);


        comercioAceiteQ2Option1 = v.findViewById(R.id.comercioAceiteQ2Option1);
        comercioAceiteQ2Option2 = v.findViewById(R.id.comercioAceiteQ2Option2);
        comercioAceiteQ2Option3 = v.findViewById(R.id.comercioAceiteQ2Option3);
        comercioAceiteQ2Option4 = v.findViewById(R.id.comercioAceiteQ2Option4);
        comercioAceiteQ2Option5 = v.findViewById(R.id.comercioAceiteQ2Option5);




        back = v.findViewById(R.id.btnBack);
        save = v.findViewById(R.id.btnOptionSave);

        controller = GeneralSingleton.getInstance();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                switch (controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).getPregunta().getLayout()) {

                    case R.layout.comercioaceiteoliva_details_1:
                        if(comercioAceiteQ1Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ1Option1.getText().toString());

                        } else if(comercioAceiteQ1Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ1Option2.getText().toString());

                        }

                        break;


                    case R.layout.comercioaceiteoliva_details_2:
                        String details="";
                        if(comercioAceiteQ2Option1.isChecked()){

                             details += ", "+ comercioAceiteQ2Option1.getText().toString();

                        } else if(comercioAceiteQ2Option2.isChecked()){

                        details += ", "+ comercioAceiteQ2Option2.getText().toString();

                    }else if(comercioAceiteQ2Option3.isChecked()){

                            details += ", "+ comercioAceiteQ2Option3.getText().toString();

                        }else if(comercioAceiteQ2Option4.isChecked()){

                            details += ", "+ comercioAceiteQ2Option4.getText().toString();

                        }else if(comercioAceiteQ2Option5.isChecked()){

                            details += ", "+ comercioAceiteQ2Option5.getText().toString();

                        }

                        controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(details.toString());

                        break;


                    case R.layout.comercioaceiteoliva_details_3:

                        if(comercioAceiteQ3Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ3Option1.getText().toString());

                        } else if(comercioAceiteQ3Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ3Option2.getText().toString());

                        }


                        break;


                    case R.layout.comercioaceiteoliva_details_4:

                        if(comercioAceiteQ4Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ4Option1.getText().toString());

                        } else if(comercioAceiteQ4Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ4Option2.getText().toString());

                        }else if(comercioAceiteQ4Option3.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ4Option3.getText().toString());

                        }

                            break;


                    case R.layout.comercioaceiteoliva_details_5:

                        if(!TextUtils.isEmpty(comercioAceiteQ5edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ5edt.getText().toString());
                        }


                        break;



                    case R.layout.comercioaceiteoliva_details_6:

                        if(comercioAceiteQ6Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ6Option1.getText().toString());

                        } else if(comercioAceiteQ6Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ6Option2.getText().toString());

                        }


                        break;


                    case R.layout.comercioaceiteoliva_details_7:

                        if(!TextUtils.isEmpty(comercioAceiteQ7edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ7edt.getText().toString());
                        }


                        break;


                    case R.layout.comercioaceiteoliva_details_8:

                        if(!TextUtils.isEmpty(comercioAceiteQ8edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ8edt.getText().toString());
                        }


                        break;


                    case R.layout.comercioaceiteoliva_details_9:

                        if(comercioAceiteQ9Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ9Option1.getText().toString());

                        } else if(comercioAceiteQ9Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ9Option2.getText().toString());

                        }


                        break;


                    case R.layout.comercioaceiteoliva_details_10:

                        if(!TextUtils.isEmpty(comercioAceiteQ10edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ10edt.getText().toString());
                        }


                        break;


                    case R.layout.comercioaceiteoliva_details_11:

                        if(!TextUtils.isEmpty(comercioAceiteQ11edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ11edt.getText().toString());
                        }


                        break;


                    case R.layout.comercioaceiteoliva_details_12:

                        if(comercioAceiteQ12Option1.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ12Option1.getText().toString());

                        } else if(comercioAceiteQ12Option2.isChecked()){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ12Option2.getText().toString());

                        }


                        break;



                    case R.layout.comercioaceiteoliva_details_13:

                        if(comercioAceiteQ13Option1.isChecked()){
                            if(!TextUtils.isEmpty(comercioAceiteQ13edt.getText())){
                                controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ13Option1.getText().toString());
                            }
                        } else if(comercioAceiteQ13Option2.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ13Option2.getText().toString());
                        }


                        break;


                    case R.layout.comercioaceiteoliva_details_14:

                        if(!TextUtils.isEmpty(comercioAceiteQ14edt.getText())){
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(comercioAceiteQ14edt.getText().toString());
                        }



                        break;

                }
            }
        });
    }
}