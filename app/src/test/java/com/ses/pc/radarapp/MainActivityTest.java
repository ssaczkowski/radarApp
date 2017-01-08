package com.ses.pc.radarapp;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import android.util.Log;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MainActivityTest {


      //  Direction that capture enemy messages
      private final static String ADDS_ENEMY = "https://redarmyserver.appspot.com/_ah/api/myApi/v1/torretinfocollection";

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }



    @Test
    public void haveItems() throws Exception {

                        ParseJson parse = new ParseJson();
                        String json = parse.readUrl(ADDS_ENEMY);

                        Gson gson = new Gson();

                        EnemyMessageJson msg = gson.fromJson(json, EnemyMessageJson.class);

                        assertTrue(msg.getItems().size()>0);

    }

    @Test
    public void verifyLocations() throws Exception {

                        ParseJson parse = new ParseJson();
                        Gson gson = new Gson();

                        String json = parse.readUrl(ADDS_ENEMY);
                        EnemyMessageJson msg = gson.fromJson(json, EnemyMessageJson.class);
                        ArrayList<Location> locations= new ArrayList<Location>();

                        for(int i=0; i < msg.getItems().size(); i++){
                          locations.add(msg.getItems().get(i).getLocation());
                        }


                        assertEquals(locations.toString(),"[Location [latitude=-34.58211, longitude=-58.433987], Location [latitude=-34.587482, longitude=-58.43772], Location [latitude=-34.583927, longitude=-58.44078]]");
    }




}
