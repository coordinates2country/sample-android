package io.github.coordinates2country.androidsample;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import io.github.coordinates2country.Coordinates2Country;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String country = Coordinates2Country.country(-23.7, 39.8);

        Log.e("MainActivity", "coordinates2country " + country);
    }
}