package com.example.appeuskoimeformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;


public class formulario extends AppCompatActivity {
    DatePicker datePicker;
    ImageView backBtn;
    Button next;
    //private FirebaseAuth mAuth;
    TextView titleText, slideText;
    EditText cliente, obra, domicilio, poblacion, Descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //variables de insercion de datos para el formulario.
        setContentView(R.layout.activity_formulario);
        datePicker = findViewById(R.id.age_picker);
        cliente = findViewById(R.id.IdCliente);
        obra = findViewById(R.id.IdObra);
        domicilio = findViewById(R.id.IdDomicilio);
        poblacion = findViewById(R.id.IdPoblacion);
        Descripcion = findViewById(R.id.IdDescripcion);
        //variables para animacion "marcha atras" entre otros.
        backBtn = findViewById(R.id.signup_back_button);
        next = findViewById(R.id.signup_next_button);
        //String mAuth = FirebaseAuth.getInstance().getUid();
        titleText = findViewById(R.id.signup_title_text);
        slideText = findViewById(R.id.signup_slide_text);

        backBtn.setOnClickListener(view -> logout());
    }

    public void logout()
    {
        FirebaseAuth.getInstance().signOut();
        Intent logout  = new Intent(this, MainActivity.class);
        startActivity(logout);
    }
    public void llamadaAlaSegundoFormulario(View view) {

        if(cliente.getText().toString().equals("")|| obra.getText().toString().equals("")|| Descripcion.getText().toString().equals("")){
            Snackbar snackbar = Snackbar.make(view, R.string.camposNoVacios, Snackbar.LENGTH_LONG);
            snackbar.setDuration(2000);
            snackbar.show();
        }
        else if(cliente.length()>40){
            Snackbar snackbar = Snackbar.make(view, R.string.validacionCliente, Snackbar.LENGTH_LONG);
            snackbar.setDuration(2000);
            snackbar.show();
        }
        else if(obra.length()>40){
            Snackbar snackbar = Snackbar.make(view, R.string.validacionObra, Snackbar.LENGTH_LONG);
            snackbar.setDuration(2000);
            snackbar.show();
        }
        else if(Descripcion.length()>500){
            Snackbar snackbar = Snackbar.make(view, R.string.validacionDescripcion, Snackbar.LENGTH_LONG);
            snackbar.setDuration(2000);
            snackbar.show();
        }
        else{
            //cogemos los datos dentro de las variables
            String _cliente = cliente.getText().toString().trim();
            String _obra = obra.getText().toString().trim();
            String _domicilio = domicilio.getText().toString().trim();
            String _poblacion = poblacion.getText().toString().trim();
            String _Descripcion = Descripcion.getText().toString().trim();

            //cogemos los datos del datepicker para la fecha
            int day = datePicker.getDayOfMonth();
            int month = datePicker.getMonth();
            int year = datePicker.getYear();
            String _fecha = day + "/" + month + "/" + year;
            //Preparamos el intent
            Intent intent = new Intent(getApplicationContext(), formulario2.class);
            //pasamos las variables de esta activity a la siguiente
            intent.putExtra("cliente", _cliente);
            intent.putExtra("obra", _obra);
            intent.putExtra("domicilio", _domicilio);
            intent.putExtra("poblacion", _poblacion);
            intent.putExtra("descripcion", _Descripcion);
            intent.putExtra("date", _fecha);

            //cargamos los botones para volver atras las transiciones de titulos y demas
            Pair[] pairs = new Pair[5];
            pairs[0] = new Pair<View, String>(backBtn, "transicion_flecha_atras");
            pairs[1] = new Pair<View, String>(next, "transicion_boton_sguiente");
            pairs[3] = new Pair<View, String>(titleText, "transicion_de_titulo");
            pairs[4] = new Pair<View, String>(slideText, "transicion_texto_slide");
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(formulario.this, pairs);
                startActivity(intent, options.toBundle());
            } else {
                startActivity(intent);
            }

        }


    }
}