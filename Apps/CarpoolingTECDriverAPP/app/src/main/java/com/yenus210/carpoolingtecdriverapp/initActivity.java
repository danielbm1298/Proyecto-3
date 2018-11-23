package com.yenus210.carpoolingtecdriverapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.zxing.Result;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class initActivity extends AppCompatActivity {
    Button iniciarSesión, registrarse;
    private ZXingScannerView vistaescaner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);
        iniciarSesión = (Button) findViewById(R.id.iniciarSesión);
        registrarse = (Button) findViewById(R.id.registrarse);

        iniciarSesión.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Escanear();

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
