package com.yenus210.carpoolingtecstudentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button califp, mamigos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        mamigos = (Button) findViewById(R.id.mamigos);
        califp = (Button) findViewById(R.id.califp);

        mamigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent Registrarse = new Intent(initActivity.this, RegisterActivity.class);
                //startActivity(Registrarse);
            }
        });

    }

}
