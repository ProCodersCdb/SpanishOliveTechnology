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

public class AlmazaraController {
    private RadioButton almazaraQ2Option1, almazaraQ2Option2, almazaraQ2Option3, almazaraQ6Option1, almazaraQ6Option2, almazaraQ6Option3,
            almazaraQ8Option1, almazaraQ8Option2, almazaraQ8Option3, almazaraQ10Option1, almazaraQ10Option2, almazaraQ11g1Option1, almazaraQ11g1Option2, almazaraQ11g2Option1,
            almazaraQ11g2Option2, almazaraQ11g2Option3, almazaraQ12Option1, almazaraQ12Option2, almazaraQ13Option1, almazaraQ13Option2, almazaraQ14Option1, almazaraQ14Option2;

    private EditText almazaraQ1edt1, almazaraQ1edt2, almazaraQ3edt1, almazaraQ3edt2, almazaraQ4edt, almazaraQ5edt, almazaraQ6edt, almazaraQ7edt, almazaraQ8edt, almazaraQ9edt, almazaraQ15edt;

    private View view;
    private GeneralSingleton controller;
    private Activity activity;
    private Button save, back;
    private String almazaraQ1str1, almazaraQ1str2, almazaraQ1strEnd, almazaraQ3str1, almazaraQ3str2, almazaraQ3strEnd, almazaraQ8str1, almazaraQ8str2, almazaraQ8strEnd, almazaraQ11str1, almazaraQ11str2, almazaraQ11strEnd;
    private RadioGroup almazaraQ11Group1, almazaraQ11Group2;


    LinearLayout almazaraQ6edtContent;


    public AlmazaraController(final View v, final Activity activity) {
        this.view = v;
        this.activity = activity;

        almazaraQ1edt1 = v.findViewById(R.id.almazaraQ1edt1);
        almazaraQ1edt2 = v.findViewById(R.id.almazaraQ1edt2);
        almazaraQ2Option1 = v.findViewById(R.id.almazaraQ2Option1);
        almazaraQ2Option2 = v.findViewById(R.id.almazaraQ2Option2);
        almazaraQ2Option3 = v.findViewById(R.id.almazaraQ2Option3);
        almazaraQ3edt1 = v.findViewById(R.id.almazaraQ3edt1);
        almazaraQ3edt2 = v.findViewById(R.id.almazaraQ3edt2);
        almazaraQ4edt = v.findViewById(R.id.almazaraQ4edt);
        almazaraQ5edt = v.findViewById(R.id.almazaraQ5edt);
        almazaraQ6Option1 = v.findViewById(R.id.almazaraQ6Option1);
        almazaraQ6Option2 = v.findViewById(R.id.almazaraQ6Option2);
        almazaraQ6Option3 = v.findViewById(R.id.almazaraQ6Option3);
        almazaraQ6edt = v.findViewById(R.id.almazaraQ6edt);
        almazaraQ7edt = v.findViewById(R.id.almazaraQ7edt);
        almazaraQ8Option1 = v.findViewById(R.id.almazaraQ8Option1);
        almazaraQ8Option2 = v.findViewById(R.id.almazaraQ8Option2);
        almazaraQ8Option3 = v.findViewById(R.id.almazaraQ8Option3);
        almazaraQ8edt = v.findViewById(R.id.almazaraQ8edt);
        almazaraQ9edt = v.findViewById(R.id.almazaraQ9edt);
        almazaraQ10Option1 = v.findViewById(R.id.almazaraQ10Option1);
        almazaraQ10Option2 = v.findViewById(R.id.almazaraQ10Option2);
        almazaraQ11g1Option1 = v.findViewById(R.id.almazaraQ11g1Option1);
        almazaraQ11g1Option2 = v.findViewById(R.id.almazaraQ11g1Option2);
        almazaraQ11g2Option1 = v.findViewById(R.id.almazaraQ11g2Option1);
        almazaraQ11g2Option2 = v.findViewById(R.id.almazaraQ11g2Option2);
        almazaraQ11g2Option3 = v.findViewById(R.id.almazaraQ11g2Option3);
        almazaraQ12Option1 = v.findViewById(R.id.almazaraQ12Option1);
        almazaraQ12Option2 = v.findViewById(R.id.almazaraQ12Option2);
        almazaraQ13Option1 = v.findViewById(R.id.almazaraQ13Option1);
        almazaraQ13Option2 = v.findViewById(R.id.almazaraQ13Option2);
        almazaraQ14Option1 = v.findViewById(R.id.almazaraQ14Option1);
        almazaraQ14Option2 = v.findViewById(R.id.almazaraQ14Option2);
        almazaraQ15edt = v.findViewById(R.id.almazaraQ15edt);

        save = v.findViewById(R.id.btnOptionSave);
        back = v.findViewById(R.id.btnBack);

        controller = GeneralSingleton.getInstance();


// ############################# Control de eventos ############################

        switch (controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).getPregunta().getLayout()) {

            case R.layout.almazara_details_6:
                almazaraQ6edtContent = v.findViewById(R.id.almazaraQ6edtContent);
                almazaraQ6edtContent.setVisibility(View.GONE);

                RadioGroup almanzaraQ6Group = (RadioGroup) v.findViewById(R.id.almanzaraQ6Group);
                almanzaraQ6Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.almazaraQ6Option1:
                                almazaraQ6edtContent.setVisibility(View.GONE);
                                break;
                            case R.id.almazaraQ6Option2:
                                almazaraQ6edtContent.setVisibility(View.GONE);
                                break;
                            case R.id.almazaraQ6Option3:
                                almazaraQ6edtContent.setVisibility(View.VISIBLE);
                                break;
                        }
                    }
                });
                break;

            case R.layout.almazara_details_11:
                almazaraQ11Group1 = v.findViewById(R.id.almazaraQ11Group1);
                almazaraQ11Group2 = v.findViewById(R.id.almazaraQ11Group2);
                almazaraQ11Group2.setVisibility(View.GONE);

                almazaraQ11Group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId) {
                            case R.id.almazaraQ11g1Option1:
                                almazaraQ11Group2.setVisibility(View.VISIBLE);
                                break;
                            case R.id.almazaraQ11g1Option2:
                                almazaraQ11Group2.setVisibility(View.GONE);
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

                    case R.layout.almazara_details_1:
                        if (!TextUtils.isEmpty(almazaraQ1edt1.getText())) {
                            almazaraQ1str1 =almazaraQ1edt1.getText().toString();
                        }
                        if (!TextUtils.isEmpty(almazaraQ1edt2.getText())) {
                            almazaraQ1str2 = almazaraQ1edt2.getText().toString();
                        }
                        almazaraQ1strEnd = almazaraQ1str1.toString() + ", " + almazaraQ1str2.toString();

                        controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ1strEnd.toString());

                        break;

                    case R.layout.almazara_details_2:
                        if (almazaraQ2Option1.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ2Option1.getText().toString());

                        } else if (almazaraQ2Option2.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ2Option2.getText().toString());

                        } else if (almazaraQ2Option3.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ2Option3.getText().toString());

                        }
                        break;

                    case R.layout.almazara_details_3:
                        if (!TextUtils.isEmpty(almazaraQ3edt1.getText())) {
                            almazaraQ3str1 = almazaraQ3edt1.getText().toString();
                        }
                        if (!TextUtils.isEmpty(almazaraQ3edt2.getText())) {
                            almazaraQ3str2 = almazaraQ3edt2.getText().toString();
                        }
                        almazaraQ3strEnd = almazaraQ3str1.toString() + ", " + almazaraQ3str2.toString();

                        controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ3strEnd.toString());

                        break;

                    case R.layout.almazara_details_4:
                        if (!TextUtils.isEmpty(almazaraQ4edt.getText())) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ4edt.getText().toString());
                        }
                        break;

                    case R.layout.almazara_details_5:
                        if (!TextUtils.isEmpty(almazaraQ5edt.getText())) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ5edt.getText().toString());
                        }
                        break;

                    case R.layout.almazara_details_6:
                        if (almazaraQ6Option1.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ6Option1.getText().toString());
                        } else if (almazaraQ6Option2.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ6Option2.getText().toString());
                        } else if (almazaraQ6Option3.isChecked()) {
                            if (!TextUtils.isEmpty(almazaraQ6edt.getText())) {
                                controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ6edt.getText().toString());
                            }
                        }
                        break;

                    case R.layout.almazara_details_7:
                        if (!TextUtils.isEmpty(almazaraQ7edt.getText())) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ7edt.getText().toString());
                        }
                        break;

                    case R.layout.almazara_details_8:
                        if (!TextUtils.isEmpty(almazaraQ8edt.getText())) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ8edt.getText().toString());
                        }
                        if (almazaraQ8Option1.isChecked()) {
                            almazaraQ8str1 = almazaraQ8Option1.getText().toString();
                        } else if (almazaraQ8Option2.isChecked()) {
                            almazaraQ8str2 = almazaraQ8Option2.getText().toString();
                        } else if (almazaraQ8Option3.isChecked()) {
                            almazaraQ8str2 = almazaraQ8Option2.getText().toString();
                        }
                        almazaraQ8strEnd = almazaraQ8str1.toString() + ", " + almazaraQ8str2.toString();

                        controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ8strEnd.toString());

                        break;

                    case R.layout.almazara_details_9:
                        if (!TextUtils.isEmpty(almazaraQ9edt.getText())) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ9edt.getText().toString());
                        }
                        break;

                    case R.layout.almazara_details_10:
                        if (almazaraQ10Option1.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ10Option1.getText().toString());
                        } else if (almazaraQ10Option2.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ10Option2.getText().toString());
                        }
                        break;

                    case R.layout.almazara_details_11:
                        if(almazaraQ11g1Option1.isChecked()){
                            almazaraQ11str1 = almazaraQ8Option2.getText().toString();
                        } else if(almazaraQ11g1Option2.isChecked()) {
                            almazaraQ11str1 = almazaraQ8Option2.getText().toString();
                        }
                        if(almazaraQ11g2Option1.isChecked()){
                            almazaraQ11str2 = almazaraQ11g2Option1.getText().toString();
                        } else if(almazaraQ11g2Option2.isChecked()) {
                            almazaraQ11str2 = almazaraQ11g2Option2.getText().toString();
                        } else if(almazaraQ11g2Option3.isChecked()) {
                            almazaraQ11str2 = almazaraQ11g2Option3.getText().toString();
                        }

                        almazaraQ11strEnd = almazaraQ11str1.toString() + ", " + almazaraQ11str2.toString();

                        controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ11strEnd.toString());

                        break;
                    case R.layout.almazara_details_12:
                        if (almazaraQ12Option1.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ12Option1.getText().toString());
                        } else if (almazaraQ12Option2.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ12Option2.getText().toString());
                        }
                        break;

                    case R.layout.almazara_details_13:
                        if (almazaraQ13Option1.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ13Option1.getText().toString());
                        } else if (almazaraQ13Option2.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ13Option2.getText().toString());
                        }

                    case R.layout.almazara_details_14:
                        if (almazaraQ14Option1.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ14Option1.getText().toString());
                        } else if (almazaraQ14Option2.isChecked()) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ14Option2.getText().toString());
                        }
                        break;

                    case R.layout.almazara_details_15:
                        if (!TextUtils.isEmpty(almazaraQ15edt.getText())) {
                            controller.getFormularios().get(controller.getPositionformulario()).getRespuestas().get(controller.getPosition()).setStr(almazaraQ15edt.getText().toString());
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