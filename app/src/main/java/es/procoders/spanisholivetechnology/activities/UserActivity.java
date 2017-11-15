package es.procoders.spanisholivetechnology.activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.StrictMode;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
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
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.util.Objects;

import es.procoders.spanisholivetechnology.R;
import es.procoders.spanisholivetechnology.beans.Usuario;
import es.procoders.spanisholivetechnology.controllers.GeneralSingleton;
import es.procoders.spanisholivetechnology.dao.IUsuarioDAO;
import es.procoders.spanisholivetechnology.dao.UsuarioDAO;

public class UserActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText usuario, password, repassword, email, name;
    private Button login, register;
    private Switch nuevouser;
    private CheckBox saveLog;
    private SharedPreferences prefs;
    private TextInputLayout til_contraseña2, til_nombre;
    private IUsuarioDAO dao = new UsuarioDAO();
    private GeneralSingleton single;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        prefs = getSharedPreferences("usuario", Context.MODE_PRIVATE);
        initViews();
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        checkExist(prefs);
    }

    private void initViews() {
        single = GeneralSingleton.getInstance();
        til_contraseña2 = findViewById(R.id.til_contraseña2);
        name = findViewById(R.id.user_name);
        til_nombre = findViewById(R.id.til_nombre);
        email = findViewById(R.id.user_email);
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
                    til_nombre.setVisibility(View.VISIBLE);
                    til_contraseña2.setVisibility(View.VISIBLE);
                    login.setVisibility(View.GONE);
                }else{
                    til_nombre.setVisibility(View.GONE);
                    repassword.setVisibility(View.GONE);
                    til_contraseña2.setVisibility(View.GONE);
                    register.setVisibility(View.GONE);
                    login.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void checkExist(SharedPreferences prefs) {
        if (getSharedPreferences("usuario", Context.MODE_PRIVATE) != null){
            Usuario user =new Usuario();
            user.setPass(prefs.getString("password", null));
            user.setNombre(prefs.getString("name", null));
            user.setEmail(prefs.getString("email", null));
            if (checkDB(user.getEmail(), user.getPass())){
                single.setUser(user);
                Intent inte = new Intent(this, MainActivity.class);
                startActivity(inte);
            }else{
                Toast.makeText(this, "Error cargando usuario", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_user:
                if (isValidEmail(email.getText().toString())){
                    if (isEmpty(password)) {
                        try {
                            if (checkDB(email, password)) {
                                if (saveLog.isChecked()) {
                                    guardarDatos(prefs, false);
                                    loginto();
                                } else {
                                    loginto();
                                }
                            } else {
                                Toast.makeText(this, "El email o contraseña no corresponde.", Toast.LENGTH_SHORT).show();
                            }
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                            Toast.makeText(this, "Ha ocurrido un error", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        email.setError("Debes rellenar el campo");
                    }
                }else{
                    email.setError("El email no es válido");
                }
                break;
            case R.id.btn_register:
                if (isValidEmail(email.getText().toString())){
                    if (isEmpty(name)) {
                        if (isValidPassword(password.getText().toString(), repassword.getText().toString())) {
                            try {
                                if (checkDB(email, password, name)) {
                                    if (saveLog.isChecked()) {
                                        guardarDatos(prefs, true);
                                        loginto();
                                    } else {
                                        GeneralSingleton single =GeneralSingleton.getInstance();
                                        single.setUser(new Usuario(email.getText().toString(), name.getText().toString(), password.getText().toString()));
                                        loginto();
                                    }
                                }
                            }catch (Exception e){
                                System.out.println(e.getMessage());
                                Toast.makeText(this, "Ha ocurrido un error", Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            repassword.setError("La contraseña debe ser la misma");
                        }
                    }else{
                        name.setError("Debes rellenar el campo");
                    }
                }else{
                    email.setError("El email no es válido");
                }
                break;
        }
    }

    private boolean checkDB(EditText email, EditText password) {
        return dao.comprobarPass(email.getText().toString(), password.getText().toString());
    }
    private boolean checkDB(EditText email, EditText password, EditText name) {
        return dao.crearUsuario(email.getText().toString(), password.getText().toString(), name.getText().toString());
    }
    private boolean checkDB(String email, String password  ) {
        return dao.comprobarPass(email, password);
    }


    private void loginto() {
        Intent inte = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(inte);
        finish();
    }

    private void guardarDatos(SharedPreferences prefs, boolean b) {
        Usuario user = new Usuario();
        SharedPreferences.Editor editor = prefs.edit();
        String pass = password.getText().toString();
        if (b) {
            String nombre= name.getText().toString();
            user.setNombre(nombre);
            editor.putString("nombre", nombre);
        }
        String mail = email.getText().toString();
        user.setEmail(mail);
        editor.putString("email", mail);
        user.setPass(pass);
        single.setUser(user);
        editor.putString("password", pass);
        editor.commit();

    }
    public final static boolean isValidEmail(String target) {
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
    public final static boolean isValidPassword(String p1, String p2){
        return p1.equals(p2);
    }
    public final static boolean isEmpty(TextView view){
        return !TextUtils.isEmpty(view.getText());
    }

}
