package com.googlemaps;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {

    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.fragmentMapa)).getMap();

        if (map != null){

            CameraUpdate camUP = CameraUpdateFactory.newLatLngZoom(new LatLng(-12.122214,-77.028885),17);

            map.moveCamera(camUP);

            map.addMarker(new MarkerOptions()
                   .icon(BitmapDescriptorFactory.fromResource(R.drawable.iconandroid))
                   .position(new LatLng(-12.122012458666406, -77.03076839447021))
                   .title("Parque Kennedy"));

            map.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.iconandroid))
                    .position(new LatLng(-12.121687280519593, -77.02920198440552))
                    .title("Municipalidad de Miraflores"));

            map.addMarker(new MarkerOptions()

                    .position(new LatLng(-12.119327104672443, -77.02911615371704))
                    .title("Ovalo de Miraflores"));

            map.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.iconandroid))
                    .position(new LatLng(-12.122411063595932, -77.02786087989807))
                    .title("Suerte"));

            map.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.iconandroid))
                    .position(new LatLng(-12.120428522666042, -77.027667760849))
                    .title("Calle Esperanza"));

        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
