package com.yenus210.carpoolingtecdriverapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class MenuActivity extends AppCompatActivity {
    Button califp, ramist, aamigos;
    private ZXingScannerView vistaescaner;
    public String carneamigo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        aamigos = (Button) findViewById(R.id.aamigos);
        califp = (Button) findViewById(R.id.califp);
        ramist = (Button) findViewById(R.id.ramist);

        aamigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Escanear();

            }
        });

        califp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // calificacion promedio

            }
        });

        ramist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //relaciones de amistad
            }
        });
    }
    public void Escanear(){
        vistaescaner = new ZXingScannerView(this);
        vistaescaner.setResultHandler(new MenuActivity.zxingscanner());
        setContentView(vistaescaner);
        vistaescaner.startCamera();

    }
    class zxingscanner implements ZXingScannerView.ResultHandler{

        @Override
        public void handleResult(Result result) {
            carneamigo = result.getText();
            vistaescaner.stopCamera();
            setContentView(R.layout.activity_init);
            startActivity(new Intent(MenuActivity.this, MenuActivity.class));
            //textoenpantalla = (TextView) findViewById(R.id.Texto);
            //textoenpantalla.setText(carne);
        }
    }
}