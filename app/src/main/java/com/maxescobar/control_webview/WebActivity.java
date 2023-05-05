package com.maxescobar.control_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView wV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        wV = (WebView) findViewById(R.id.wV);

        //Se extrae por parametros como en el ejercicio anterior
        String URL = getIntent().getStringExtra("data");

        //Con esta linea se nos preguntara "con que navegador desea abrir la web?"
        wV.setWebViewClient(new WebViewClient());
        wV.loadUrl("http://" + URL);
    }

    public void btnCerrar(View vista){
        //el metodo finish(): Finaliza un activity
        finish();
    }


}