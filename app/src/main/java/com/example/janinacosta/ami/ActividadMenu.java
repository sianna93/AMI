package com.example.janinacosta.ami;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by Janina Costa on 15/12/2016.
 */

public class ActividadMenu  extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.actividad_menu);

            Button botonCerrarSesion = (Button)findViewById(R.id.idCerrarSesion);

            botonCerrarSesion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(), ActividadLogin.class );
                    startActivity(i);
                }
            });

        }
    }
