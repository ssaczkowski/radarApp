package com.ses.pc.radarapp;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;

import static com.ses.pc.radarapp.R.id.map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private final static String ADDS_ENEMY = "https://redarmyserver.appspot.com/_ah/api/myApi/v1/torretinfocollection";
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {


        try {
            mMap = googleMap;
            EnemyMessageJson dataWeapon = this.getDataWeapon();

            LatLng weaponLocation = new LatLng(dataWeapon.getItems().get(0).getLocation().getLatitude(), dataWeapon.getItems().get(0).getLocation().getLongitude());
            mMap.addCircle(new CircleOptions()
                    .center(new LatLng(dataWeapon.getItems().get(0).getLocation().getLatitude(), dataWeapon.getItems().get(0).getLocation().getLongitude()))
                    .radius(dataWeapon.getItems().get(0).getRadius())
                    .strokeColor(Color.RED)
                    .fillColor(Color.rgb(255, 117, 020)));
            mMap.addMarker(new MarkerOptions().position(weaponLocation).title("misil"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(weaponLocation));

        } catch (Exception e) {
            e.getStackTrace();
        }

    }

    public EnemyMessageJson getDataWeapon() throws Exception {


        //Location location = new Location();
        ParseJson parse = new ParseJson();
        Gson gson = new Gson();

        String json = parse.readUrl(ADDS_ENEMY);

        EnemyMessageJson msg = gson.fromJson(json, EnemyMessageJson.class);

        //location.setLatitude(msg.getItems().get(0).getLocation().getLatitude());
        //location.setLongitude(msg.getItems().get(0).getLocation().getLongitude());

        return msg;
    }

}
