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

        //  Log.d("RESULTADO:", chaine.toString());
        try {
            String json = readUrl("https://redarmyserver.appspot.com/_ah/api/myApi/v1/torretinfocollection");
            Gson gson = new Gson();
            Item item = gson.fromJson(json, Item.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        // Log.d("*S*A*B*R*I*N*A*",item.toString());

        //    Log.d("RESULTADO:", item.toString());
        //   System.out.println(item.toString());

    }

    public static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }

}



