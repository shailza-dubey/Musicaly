package com.example.musicaly;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button recentlyPlayed = (Button) findViewById(R.id.recently_played);
        recentlyPlayed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent recentlyIntent = new Intent(MainActivity.this, RecentlyActivity.class);
                startActivity(recentlyIntent);
            }
        });

        Button top = (Button) findViewById(R.id.top_albums);
        top.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent topIntent = new Intent(MainActivity.this, TopActivity.class);
                startActivity(topIntent);
            }
        });

        Button stress = (Button) findViewById(R.id.stress_buster);
        stress.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent stressIntent = new Intent(MainActivity.this, StressActivity.class);
                startActivity(stressIntent);
            }
        });

        Button artists = (Button) findViewById(R.id.best_of_artists);
        artists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
        });

        Button chill = (Button) findViewById(R.id.chill);
        chill.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent chillIntent = new Intent(MainActivity.this, ChillActivity.class);
                startActivity(chillIntent);
            }
        });

        Button romantic = (Button) findViewById(R.id.bollywood_romance);
        romantic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent romanticIntent = new Intent(MainActivity.this, RomanticActivity.class);
                startActivity(romanticIntent);
            }
        });


    }
}
