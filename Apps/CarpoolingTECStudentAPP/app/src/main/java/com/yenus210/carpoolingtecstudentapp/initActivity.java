package com.yenus210.carpoolingtecstudentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class initActivity extends AppCompatActivity {
    Button iniciarSesión, registrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);
        iniciarSesión = (Button) findViewById(R.id.iniciarSesión);
        registrarse = (Button) findViewById(R.id.registrarse);

        iniciarSesión.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iniciarS = new Intent(initActivity.this, RegisterActivity.class);
                startActivity(iniciarS);

            }
        });
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Registrarse = new Intent(initActivity.this, RegisterActivity.class);
                startActivity(Registrarse);
            }
        });
    }
}
