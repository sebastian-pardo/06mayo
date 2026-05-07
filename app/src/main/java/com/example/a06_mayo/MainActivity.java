package com.example.a06_mayo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


public class MainActivity extends AppCompatActivity {

    EditText edtNombre, edtPassword;
    AppCompatButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombre = findViewById(R.id.edtNombre);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre = edtNombre.getText().toString();
                String pass = edtPassword.getText().toString();

                if(nombre.isEmpty() || pass.isEmpty()){

                    Toast.makeText(MainActivity.this,
                            "Los campos no pueden estar vacíos",
                            Toast.LENGTH_LONG).show();

                }
                else if(nombre.equalsIgnoreCase("andres")){

                    Intent in = new Intent(MainActivity.this, pantallaActivity.class);
                    in.putExtra("usuario",nombre);
                    startActivity(in);

                }else{

                    Toast.makeText(MainActivity.this,
                            "Usuario no permitido",
                            Toast.LENGTH_LONG).show();

                }

            }
        });

    }
}