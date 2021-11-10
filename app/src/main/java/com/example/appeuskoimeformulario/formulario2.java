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

public class formulario2 extends AppCompatActivity {
    ImageView backBtn;
    Button next;
    TextView titleText, slideText;
    EditText M1,M2,M3,M4,M5,M6,M7,M8,M9;
    EditText n1, n2,n3,n4,n5,n6,n7,n8,n9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //variables para moverse por la app
        setContentView(R.layout.activity_formulario2);
        backBtn = findViewById(R.id.signup_back_button);
        next = findViewById(R.id.signup_next_button);
        titleText = findViewById(R.id.signup_title_text);
        slideText = findViewById(R.id.signup_slide_text);
        //Variables de inseccion de datos
        M1 = findViewById(R.id.M1);
        M2 = findViewById(R.id.M2);
        M3 = findViewById(R.id.M3);
        M4 = findViewById(R.id.M4);
        M5 = findViewById(R.id.M5);
        M6 = findViewById(R.id.M6);
        M7 = findViewById(R.id.M7);
        M8 = findViewById(R.id.M8);
        M9 = findViewById(R.id.M9);
        //numeros
        n1 = findViewById(R.id.N1);
        n2 = findViewById(R.id.N2);
        n3 = findViewById(R.id.N3);
        n4 = findViewById(R.id.N4);
        n5 = findViewById(R.id.N5);
        n6 = findViewById(R.id.N6);
        n7 = findViewById(R.id.N7);
        n8 = findViewById(R.id.N8);
        n9 = findViewById(R.id.N9);
    }
    public void llamadaAlaTerceraFormulario(View view) {
        if(M1.getText().toString().equals("")|| n1.getText().toString().equals("")){
            Snackbar snackbar = Snackbar.make(view, R.string.materialesVacios, Snackbar.LENGTH_LONG);
            snackbar.setDuration(2000);
            snackbar.show();
        }
        else if(M2.length()>100 || n2.length()>500){
            Snackbar snackbar = Snackbar.make(view, R.string.materiales2, Snackbar.LENGTH_LONG);
            snackbar.setDuration(2000);
            snackbar.show();
        }
        else if(M3.length()>100 || n3.length()>500){
            Snackbar snackbar = Snackbar.make(view, R.string.materiales3, Snackbar.LENGTH_LONG);
            snackbar.setDuration(2000);
            snackbar.show();
        }
        else if(M4.length()>100 || n4.length()>500){
            Snackbar snackbar = Snackbar.make(view, R.string.materiales4, Snackbar.LENGTH_LONG);
            snackbar.setDuration(2000);
            snackbar.show();
        }
        else if(M5.length()>100 || n5.length()>500){
            Snackbar snackbar = Snackbar.make(view, R.string.materiales5, Snackbar.LENGTH_LONG);
            snackbar.setDuration(2000);
            snackbar.show();
        }
        else if(M6.length()>100 || n6.length()>500){
            Snackbar snackbar = Snackbar.make(view, R.string.materiales6, Snackbar.LENGTH_LONG);
            snackbar.setDuration(2000);
            snackbar.show();
        }
        else if(M7.length()>100 || n7.length()>500){
            Snackbar snackbar = Snackbar.make(view, R.string.materiales7, Snackbar.LENGTH_LONG);
            snackbar.setDuration(2000);
            snackbar.show();
        }
        else if(M8.length()>100 || n8.length()>500){
            Snackbar snackbar = Snackbar.make(view, R.string.materiales8, Snackbar.LENGTH_LONG);
            snackbar.setDuration(2000);
            snackbar.show();
        }
        else if(M9.length()>100 || n9.length()>500){
            Snackbar snackbar = Snackbar.make(view, R.string.materiales9, Snackbar.LENGTH_LONG);
            snackbar.setDuration(2000);
            snackbar.show();
        }

        else {
            Intent intent = new Intent(getApplicationContext(), formulario3.class);
            /**Comprobamos que todos los input tengan texto para poder pasarlos a la siguiente activity */
            //cogemos los datos dentro de las variables
            if(!(M1.getText().toString().equals(""))){
                String _M1 = M1.getText().toString().trim();
                String _N1 = n1.getText().toString().trim();
                //pasamos las variables de esta activity a la siguiente
                intent.putExtra("M1", _M1);
                intent.putExtra("N1", _N1);
            }
            /**---------------------------------------------------------------------*/
            if(!(M2.getText().toString().equals(""))){
                String _M2 = M2.getText().toString().trim();
                String _N2 = n2.getText().toString().trim();
                //pasamos las variables de esta activity a la siguiente
                intent.putExtra("M2", _M2);
                intent.putExtra("N2", _N2);
            }
            if(!(M3.getText().toString().equals(""))){
                String _M3 = M3.getText().toString().trim();
                String _N3 = n3.getText().toString().trim();
                //pasamos las variables de esta activity a la siguiente
                intent.putExtra("M3", _M3);
                intent.putExtra("N3", _N3);
            }
            /**---------------------------------------------------------------------*/
            if(!(M4.getText().toString().equals(""))){
                String _M4 = M4.getText().toString().trim();
                String _N4 = n4.getText().toString().trim();
                //pasamos las variables de esta activity a la siguiente
                intent.putExtra("M4", _M4);
                intent.putExtra("N4", _N4);
            }
            /**---------------------------------------------------------------------*/
            if(!(M5.getText().toString().equals(""))){
                String _M5 = M5.getText().toString().trim();
                String _N5 = n5.getText().toString().trim();
                //pasamos las variables de esta activity a la siguiente
                intent.putExtra("M5", _M5);
                intent.putExtra("N5", _N5);
            }
            /**---------------------------------------------------------------------*/
            if(!(M6.getText().toString().equals(""))){
                String _M6 = M6.getText().toString().trim();
                String _N6 = n6.getText().toString().trim();
                //pasamos las variables de esta activity a la siguiente
                intent.putExtra("M6", _M6);
                intent.putExtra("N6", _N6);
            }
            /**---------------------------------------------------------------------*/
            if(!(M7.getText().toString().equals(""))){
                String _M7 = M7.getText().toString().trim();
                String _N7 = n7.getText().toString().trim();
                //pasamos las variables de esta activity a la siguiente
                intent.putExtra("M7", _M7);
                intent.putExtra("N7", _N7);
            }
            /**---------------------------------------------------------------------*/
            if(!(M8.getText().toString().equals(""))){
                String _M8 = M8.getText().toString().trim();
                String _N8 = n8.getText().toString().trim();
                //pasamos las variables de esta activity a la siguiente
                intent.putExtra("M8", _M8);
                intent.putExtra("N8", _N8);
            }
            /**---------------------------------------------------------------------*/
            if(!(M9.getText().toString().equals(""))){
                String _M9 = M9.getText().toString().trim();
                String _N9 = n9.getText().toString().trim();
                //pasamos las variables de esta activity a la siguiente
                intent.putExtra("M9", _M9);
                intent.putExtra("N9", _N9);
            }
            /**---------------------------------------------------------------------*/
            //cargamos los botones para volver atras las transiciones de titulos y demas
            Pair[] pairs = new Pair[5];
            pairs[0] = new Pair<View, String>(backBtn, "transicion_flecha_atras");
            pairs[1] = new Pair<View, String>(next, "transicion_boton_sguiente");
            pairs[3] = new Pair<View, String>(titleText, "transicion_de_titulo");
            pairs[4] = new Pair<View, String>(slideText, "transicion_texto_slide");
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(formulario2.this, pairs);
                startActivity(intent, options.toBundle());
            } else {
                startActivity(intent);
            }
        }

    }

}