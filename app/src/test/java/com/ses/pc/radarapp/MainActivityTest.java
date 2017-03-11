package com.ses.pc.radarapp;

import com.google.gson.Gson;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainActivityTest {

    private final static String ADDS_ENEMY="https://redarmyserver.appspot.com/_ah/api/myApi/v1/torretinfocollection";
/*
    @Test
    public void testSaveItemsIntoEnemyMessageJson() throws Exception {
        Gson gson=new Gson();
        ParseJson parse=new ParseJson();

        String json=parse.readUrl(ADDS_ENEMY);
        EnemyMessageJson msg=gson.fromJson(json, EnemyMessageJson.class);

        assertEquals(3, msg.getItems().size());
    }

    @Test
    public void testVerifyLocations() throws Exception {
        ParseJson parse=new ParseJson();
        Gson gson=new Gson();

        String json=parse.readUrl(ADDS_ENEMY);
        EnemyMessageJson msg=gson.fromJson(json, EnemyMessageJson.class);
        ArrayList<Location> locations=new ArrayList<Location>();

        for (int i=0; i < msg.getItems().size(); i++) {
            locations.add(msg.getItems().get(i).getLocation());
        }

        assertEquals(locations.toString(), "[Location [latitude=-34.58211, longitude=-58.433987], Location [latitude=-34.587482, longitude=-58.43772], Location [latitude=-34.583927, longitude=-58.44078]]");
    }

    @Test
    public void testVerifyLatitude() throws Exception {
        ParseJson parse=new ParseJson();
        Gson gson=new Gson();

        String json=parse.readUrl(ADDS_ENEMY);
        EnemyMessageJson msg=gson.fromJson(json, EnemyMessageJson.class);

        assertEquals(-34.58211, msg.getItems().get(0).getLocation().getLatitude(), 0.0);
        assertEquals(-34.587482, msg.getItems().get(1).getLocation().getLatitude(), 0.0);
        assertEquals(-34.583927, msg.getItems().get(2).getLocation().getLatitude(), 0.0);
    }

    @Test
    public void testVerifylongitude() throws Exception {
        ParseJson parse=new ParseJson();
        Gson gson=new Gson();

        String json=parse.readUrl(ADDS_ENEMY);
        EnemyMessageJson msg=gson.fromJson(json, EnemyMessageJson.class);

        assertEquals(-58.433987, msg.getItems().get(0).getLocation().getLongitude(), 0.0);
        assertEquals(-58.43772, msg.getItems().get(1).getLocation().getLongitude(), 0.0);
        assertEquals(-58.44078, msg.getItems().get(2).getLocation().getLongitude(), 0.0);
    }

    @Test
    public void testGetRadius() throws Exception {
        ParseJson parse=new ParseJson();
        Gson gson=new Gson();

        String json=parse.readUrl(ADDS_ENEMY);
        EnemyMessageJson msg=gson.fromJson(json, EnemyMessageJson.class);

        assertEquals(1, msg.getItems().get(0).getRadius());
        assertEquals(1, msg.getItems().get(1).getRadius());
        assertEquals(1, msg.getItems().get(2).getRadius());
    }

    @Test
    public void getLocalizationWeaponTest() throws Exception {
        MapsActivity mapsActivity=new MapsActivity();

        EnemyMessageJson location = mapsActivity.getDataWeapon();

        assertEquals(-34.58211, location.getItems().get(0).getLocation().getLatitude(), 0.0);
        assertEquals(-58.433987, location.getItems().get(0).getLocation().getLongitude(), 0.0);
    }


    @Test
    public void testAsyncTask() throws Exception {
        ParseJson parse=new ParseJson();
        Gson gson=new Gson();

        String json=parse.readUrl(ADDS_ENEMY);

        EnemyMessageJson msg=gson.fromJson(json, EnemyMessageJson.class);
        assertEquals(-34.58211, msg.getItems().get(0).getLocation().getLatitude(), 0.0);
        //location.setLatitude(msg.getItems().get(0).getLocation().getLatitude());
        //location.setLongitude(msg.getItems().get(0).getLocation().getLongitude());
    }

    */
}
