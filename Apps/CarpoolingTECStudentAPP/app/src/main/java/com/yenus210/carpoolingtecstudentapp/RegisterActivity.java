package com.yenus210.carpoolingtecstudentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class RegisterActivity extends AppCompatActivity {
    private CallbackManager callbackManager;
    private LoginButton loginButton;
    private Button carneTEC;
    private ZXingScannerView vistaescaner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        carneTEC = (Button) findViewById(R.id.botonQR);
        loginButton = (LoginButton)findViewById(R.id.login_button);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
        callbackManager = CallbackManager.Factory.create();

        carneTEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Escanear();

            }
        });

        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Intent Map = new Intent(RegisterActivity.this, TabbActivity.class);
                startActivity(Map);
            }

            @Override
            public void onCancel() {
            //Cuando el usuario cancela el login
            }

            @Override
            public void onError(FacebookException error) {
            //Cuando hay un error en el login
            }
        });

        }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
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
