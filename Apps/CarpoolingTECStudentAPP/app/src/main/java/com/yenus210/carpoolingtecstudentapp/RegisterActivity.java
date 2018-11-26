package com.yenus210.carpoolingtecstudentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.zxing.Result;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

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
        loginButton.setReadPermissions(Arrays.asList("public_profile", "user_friends", "email", "user_birthday"));
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {



            @Override
            public void onSuccess(LoginResult loginResult) {

                GraphRequest request = GraphRequest.newMeRequest(
                        loginResult.getAccessToken(),
                        new GraphRequest.GraphJSONObjectCallback() {

                            @Override
                            public void onCompleted(JSONObject object, GraphResponse response) {
                                try {
                                    // get profile information
                                    String name = "";
                                    String email = "";
                                    String uriPicture = "";
                                    if (object.getString("name") != null) {
                                        name = object.getString("name");
                                    }
                                    if (object.getString("email") != null) {
                                        email = object.getString("email");
                                    }
                                    if (object.getString("picture") != null) {
                                        JSONObject imagen = new JSONObject(object.getString("picture"));
                                        JSONObject imagen2 = new JSONObject(imagen.getString("data"));
                                        uriPicture = imagen2.getString("url");
                                    }

                                    startActivity(new Intent(RegisterActivity.this, TabbActivity.class));
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                Bundle parameters = new Bundle();
                parameters.putString("fields", "id,name,link,gender,birthday,email,picture");
                request.setParameters(parameters);
                request.executeAsync();
            }

            @Override
            public void onCancel() {
            //Cuando el usuario cancela el login
            }

            @Override
            public void onError(FacebookException error) {
            //Cuando hay un error en el login
                Log.d(RegisterActivity.class.getCanonicalName(), error.getMessage());
            }
        });

        }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
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
        }
    }

}