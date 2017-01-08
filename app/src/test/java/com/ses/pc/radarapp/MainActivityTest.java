package com.ses.pc.radarapp;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MainActivityTest {

    private final static String ADDS_ENEMY = "https://redarmyserver.appspot.com/_ah/api/myApi/v1/torretinfocollection";

    @Test
    public void saveItemsIntoEnemyMessageJson() throws Exception {
        Gson gson = new Gson();
        ParseJson parse = new ParseJson();

        String json = parse.readUrl(ADDS_ENEMY);
        EnemyMessageJson msg = gson.fromJson(json, EnemyMessageJson.class);

        assertEquals(3, msg.getItems().size());
    }


}
