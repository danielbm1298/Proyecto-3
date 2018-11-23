package com.yenus210.carpoolingtecdriverapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class RegisterActivity extends AppCompatActivity {

    private Button carneTEC;
    private ZXingScannerView vistaescaner;
    private ImageView loginln;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        carneTEC = (Button) findViewById(R.id.botonQR);
        loginln = (ImageView) findViewById(R.id.loginln);
        carneTEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Escanear();

            }
        });
        loginln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast2 =
                        Toast.makeText(getApplicationContext(),
                                "Se ha registrado correctamente ", Toast.LENGTH_SHORT);
                toast2.show();

            }
        });

    }
    public void Escanear(){
        vistaescaner = new ZXingScannerView(this);
        vistaescaner.setResultHandler(new zxingscanner());
        setContentView(vistaescaner);
        vistaescaner.startCamera();

    }
    class zxingscanner implements ZXingScannerView.ResultHandler{

        @Override
        public void handleResult(Result result) {
            String carne = result.getText();
            vistaescaner.stopCamera();
            setContentView(R.layout.activity_init);
            //textoenpantalla = (TextView) findViewById(R.id.Texto);
            //textoenpantalla.setText(carne);
        }
    }
}