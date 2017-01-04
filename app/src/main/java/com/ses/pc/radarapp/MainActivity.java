package com.ses.pc.radarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    // Direccion base para descargar informacion
    private final static String DIR_BASE = "https://redarmyserver.appspot.com/_ah/api/myApi/v1/torretinfocollection";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        obtenerMensajeEnemigo();

    }

    private void obtenerMensajeEnemigo() {
        try {
            ParseJson parse = new ParseJson();
            String json = parse.readUrl("https://redarmyserver.appspot.com/_ah/api/myApi/v1/torretinfocollection");
            Gson gson = new Gson();
            Item item = gson.fromJson(json, Item.class);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}



