package com.ses.pc.radarapp;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        obtenerMensajeEnemigo();

    }
    private static String readUrl(String urlString) throws Exception {
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
    private void obtenerMensajeEnemigo() {


        URL url = null;
        try {
            url = new URL("https://redarmyserver.appspot.com/_ah/api/myApi/v1/torretinfocollection");

            InputStreamReader reader = new InputStreamReader(url.openStream());

            Gson gson = new Gson();

            Item[] items =  gson.fromJson(reader, Item[].class);


           // Log.d("RESULTADO:",items.toString());
           // System.out.println(items.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // String json = readUrl("https://redarmyserver.appspot.com/_ah/api/myApi/v1/torretinfocollection");

    }


}
