package com.example.appeuskoimeformulario;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private EditText correo;
    private EditText pass;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        correo = findViewById(R.id.IdEmail);
        pass = findViewById(R.id.IdPass);
        String idFirebase = mAuth.getUid();

        if(idFirebase!=null){
            Intent i = new Intent(getApplicationContext(), formulario.class);
            startActivity(i);
        }
    }
//FirebaseAuth.getInstance().signOut();
    protected void onStart() {
        super.onStart();
        // La actividad está a punto de hacerse visible.
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }
    public void iniciarSesion (View view){
        if(correo.getText().toString().equals("")|| pass.getText().toString().equals("")){
            Snackbar snackbar = Snackbar.make(view, R.string.camposNoVacios, Snackbar.LENGTH_LONG);
            snackbar.setDuration(2000);
            snackbar.show();
        }
        else{

            mAuth.signInWithEmailAndPassword(correo.getText().toString().trim(), pass.getText().toString().trim())
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                //Log.d(TAG, "signInWithEmail:success");
                                FirebaseUser user = mAuth.getCurrentUser();
                                Intent i = new Intent(getApplicationContext(), formulario.class);
                                startActivity(i);
                            /*Toast.makeText(getApplicationContext(), "Inicio de sesion correcto.",
                                    Toast.LENGTH_SHORT).show();*/
                                Snackbar snackbar = Snackbar.make(view, R.string.inicioSesionCorrecto, Snackbar.LENGTH_LONG);
                                snackbar.setDuration(2000);
                                snackbar.show();

                                //updateUI(user);
                            } else {
                                // If sign in fails, display a message to the user.
                                // Log.w(TAG, "signInWithEmail:failure", task.getException());
                                Snackbar snackbar = Snackbar.make(view, R.string.falloAutenticaion, Snackbar.LENGTH_LONG);
                                snackbar.setDuration(2000);
                                snackbar.show();
                                //updateUI(null);
                            }

                            // ...
                        }
                    });
        }
    }
    //TODO: Crear bd firebase, para el login despues con los usuarios creados retornarlos en la ultima parte del form. Y crear funcion de crear pdf. (revisar login)
}