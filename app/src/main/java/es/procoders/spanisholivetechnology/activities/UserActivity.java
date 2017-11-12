package es.procoders.spanisholivetechnology.activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONObject;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.Usuario;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;

public class UserActivity extends AppCompatActivity {
    EditText name, phone, email;
    Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        final SharedPreferences prefs = getSharedPreferences("usuario", Context.MODE_PRIVATE);
        checkExist(prefs);
        name = findViewById(R.id.user_name);
        phone = findViewById(R.id.user_phone);
        email = findViewById(R.id.user_email);
        save = findViewById(R.id.btn_user);
        phone.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = name.getText().toString();
                String tele = phone.getText().toString();
                String mail = email.getText().toString();
                Usuario user = new Usuario(nombre, tele, mail);
                GeneralSingleton.getInstance().setUser(user);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("nombre", nombre);
                editor.putString("telefono", tele);
                editor.putString("mail", mail);
                editor.commit();
                Intent inte = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(inte);
                finish();
            }
        });
    }

    private void checkExist(SharedPreferences prefs) {
        if (prefs.getString("nombre", null)!= null){
            Usuario user =new Usuario(prefs.getString("nombre", null), prefs.getString("telefono", null), prefs.getString("mail", null));
            GeneralSingleton.getInstance().setUser(user);
            Intent inte = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(inte);
            finish();
        }
    }
}
