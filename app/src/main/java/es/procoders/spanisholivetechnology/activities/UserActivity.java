package es.procoders.spanisholivetechnology.activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

import org.json.JSONObject;

import java.util.Objects;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.Usuario;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;

public class UserActivity extends AppCompatActivity implements View.OnClickListener{
    EditText usuario, password, repassword, email;
    Button login, register;
    Switch nuevouser;
    CheckBox saveLog;
     SharedPreferences prefs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        prefs = getSharedPreferences("usuario", Context.MODE_PRIVATE);
        checkExist(prefs);
        usuario = findViewById(R.id.user_email);
        password = findViewById(R.id.user_pass);
        repassword = findViewById(R.id.user_pass2);
        login = findViewById(R.id.btn_user);
        register = findViewById(R.id.btn_register);
        nuevouser = findViewById(R.id.nuevousuario);
        saveLog = findViewById(R.id.saveCheck);
        login.setOnClickListener(this);
        register.setOnClickListener(this);
        repassword.setVisibility(View.GONE);

        nuevouser.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    repassword.setVisibility(View.VISIBLE);
                    register.setVisibility(View.VISIBLE);
                    login.setVisibility(View.GONE);
                }else{
                    repassword.setVisibility(View.GONE);
                    register.setVisibility(View.GONE);
                    login.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    private void checkExist(SharedPreferences prefs) {
        if (prefs.getString("email", null)!= null){
            Usuario user =new Usuario();
            user.setPassword(prefs.getString("password", null));
            user.setEmail(prefs.getString("email", null));
            GeneralSingleton.getInstance().setUser(user);
            Intent inte = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(inte);
            finish();
        }
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_user:
                if (!TextUtils.isEmpty(usuario.getText()) && !TextUtils.isEmpty(password.getText())){
                    if (saveLog.isChecked()){
                        guardarDatos(prefs);
                        loginto();
                    }else{
                        loginto();
                    }
                }
                break;
            case R.id.btn_register:
                if (!TextUtils.isEmpty(usuario.getText()) && Objects.equals(password.getText(), repassword.getText()) && !TextUtils.isEmpty(password.getText())){
                    if (saveLog.isChecked()){
                        guardarDatos(prefs);
                        //saveinDB();
                        loginto();
                    }else{
                        loginto();
                    }
                }
                break;
        }
    }

    private void loginto() {
        Intent inte = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(inte);
        finish();
    }

    private void guardarDatos(SharedPreferences prefs) {
        String nombre="";
        String pass = password.getText().toString();
        String mail = email.getText().toString();
        Usuario user = new Usuario();
        user.setEmail(mail);
        user.setPassword(pass);
        GeneralSingleton.getInstance().setUser(user);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("email", mail);
        editor.putString("password", pass);
        editor.commit();

    }
}
