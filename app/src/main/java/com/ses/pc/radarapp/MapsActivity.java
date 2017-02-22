package com.ses.pc.radarapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private final static String ADDS_ENEMY = "https://redarmyserver.appspot.com/_ah/api/myApi/v1/torretinfocollection";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        Gson gson = new Gson();
        ParseJson parse = new ParseJson();

        try {
            String json = null;
            json = parse.readUrl(ADDS_ENEMY);
            EnemyMessageJson msg = gson.fromJson(json, EnemyMessageJson.class);
            Double latitude = msg.getItems().get(0).getLocation().getLatitude();
            Double longitude = msg.getItems().get(0).getLocation().getLongitude();
            LatLng palermo = new LatLng(latitude, longitude);
            mMap.addMarker(new MarkerOptions().position(palermo).title("Gonza Tiene lo que quieren las wachas!"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(palermo));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //LatLng palermo = new LatLng(-34.58211, -58.433987);
    }
}
