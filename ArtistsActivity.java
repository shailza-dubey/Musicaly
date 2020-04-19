package com.example.musicaly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Library> songs = new ArrayList<Library>();
        songs.add(new Library("Yummy", "Justin Beiber",R.drawable.play_button));
        songs.add(new Library("Mera Bina", "Pritam", R.drawable.play_button));
        songs.add(new Library("bad guy", "Billie Eilish", R.drawable.play_button));
        songs.add(new Library("Jai Ho!", "A.R. Rahman", R.drawable.play_button));
        songs.add(new Library("Soniyo", "Sonu Nigam", R.drawable.play_button));
        songs.add(new Library("Naina", "Arijit Singh", R.drawable.play_button));
        songs.add(new Library("Blank Space", "Taylor Swift", R.drawable.play_button));
        songs.add(new Library("God is a woman", "Ariana Grande", R.drawable.play_button));
        songs.add(new Library("Raanjhana", "A.R.Rahman", R.drawable.play_button));
        songs.add(new Library("Hasi - Female Version", "Shreya Ghoshal", R.drawable.play_button));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);
    }
}
