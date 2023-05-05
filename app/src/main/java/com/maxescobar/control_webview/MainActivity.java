package com.maxescobar.control_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etSitioWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSitioWeb = (EditText) findViewById(R.id.etWeb);
    }

    //Metodo para el boton
    public void btnSitioWeb(View vista){

        //Logica para cambiar de activity
        Intent i = new Intent(this, WebActivity.class);
        i.putExtra("data",etSitioWeb.getText().toString());
        startActivity(i);
    }

}