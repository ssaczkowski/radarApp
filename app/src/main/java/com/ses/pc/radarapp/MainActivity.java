package com.ses.pc.radarapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.google.gson.Gson;


public class MainActivity extends AppCompatActivity {

    //  Direction that capture enemy messages
    private final static String ADDS_ENEMY = "https://redarmyserver.appspot.com/_ah/api/myApi/v1/torretinfocollection";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getEnemyMessage();

    }

    private void getEnemyMessage() {
        try {

            ParseJson parse = new ParseJson();
            String json = parse.readUrl(ADDS_ENEMY);
            Gson gson = new Gson();
            EnemyMessageJson msg = gson.fromJson(json, EnemyMessageJson.class);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
