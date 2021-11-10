package com.example.appeuskoimeformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText correo;
    private EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        correo = findViewById(R.id.IdEmail);
        pass = findViewById(R.id.IdPass);
    }
    //TODO: Crear bd firebase, para el login despues con los usuarios creados retornarlos en la ultima parte del form. Y crear funcion de crear pdf. (revisar login)
}