package com.ses.pc.radarapp;

import com.google.gson.Gson;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ParseTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }



    @Test
    public void parse() throws Exception {
        ParseJson parse = new ParseJson();

        String result = parse.readUrl("https://redarmyserver.appspot.com/_ah/api/myApi/v1/torretinfocollection");
        assertEquals("{\n" +
                " \"items\": [\n" +
                "  {\n" +
                "   \"location\": {\n" +
                "    \"latitude\": -34.58211,\n" +
                "    \"longitude\": -58.433987\n" +
                "   },\n" +
                "   \"radius\": 1,\n" +
                "   \"code\": \"RollLaser\",\n" +
                "   \"radiusInMeter\": 50,\n" +
                "   \"kind\": \"myApi#resourcesItem\"\n" +
                "  },\n" +
                "  {\n" +
                "   \"location\": {\n" +
                "    \"latitude\": -34.587482,\n" +
                "    \"longitude\": -58.43772\n" +
                "   },\n" +
                "   \"radius\": 1,\n" +
                "   \"code\": \"BumeranTower\",\n" +
                "   \"radiusInMeter\": 100,\n" +
                "   \"kind\": \"myApi#resourcesItem\"\n" +
                "  },\n" +
                "  {\n" +
                "   \"location\": {\n" +
                "    \"latitude\": -34.583927,\n" +
                "    \"longitude\": -58.44078\n" +
                "   },\n" +
                "   \"radius\": 1,\n" +
                "   \"code\": \"Pancu002\",\n" +
                "   \"radiusInMeter\": 20,\n" +
                "   \"kind\": \"myApi#resourcesItem\"\n" +
                "  }\n" +
                " ],\n" +
                " \"kind\": \"myApi#resources\",\n" +
                " \"etag\": \"\\\"3PWj_ScmoW9MFySxPwnVxOrZvLo/DW-Ef6NyN-p_5C4h_XTzeNpySFc\\\"\"\n" +
                "}\n", result);
    }



/*
    @Test
    public void parseGson() throws Exception {
        ParseJson parse = new ParseJson();
        String json = parse.readUrl("https://redarmyserver.appspot.com/_ah/api/myApi/v1/torretinfocollection");
        Gson gson = new Gson();
        Item item = gson.fromJson(json, Item.class);

        String result = item.getCode();
        //ACÀ RESULT VALE NULL, CREO QUE DEBERIA SER UNA LISTA.
        assertEquals("fruta", result);
    }


    @Test
    public void debeDevolverJSONEnUnObjeto() {
        final String json = "{\"id\":46,\"nombre\":\"Miguel\",\"empresa\":\"Autentia\"}";
        final Gson gson = new Gson();
        final Empleado empleado = gson.fromJson(json, Empleado.class);
        assertEquals(46, empleado.getId());
        assertEquals("Miguel", empleado.getNombre());
        assertEquals("Autentia", empleado.getEmpresa());
    }
    */
}