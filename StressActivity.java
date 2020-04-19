package com.example.musicaly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class StressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Library> songs = new ArrayList<Library>();
        songs.add(new Library("Genda Phool", "Badshah",R.drawable.play_button));
        songs.add(new Library("Anywhere", "Lucas & Steve", R.drawable.play_button));
        songs.add(new Library("Malang", "Ved Sharma", R.drawable.play_button));
        songs.add(new Library("Techno Prank", "Dubdogz", R.drawable.play_button));
        songs.add(new Library("Ghungroo", "Arijit Singh, Shilpa Rao", R.drawable.play_button));
        songs.add(new Library("Manali Trance", "Neha Kakkar", R.drawable.play_button));
        songs.add(new Library("Yummy", "Justin Beiber", R.drawable.play_button));
        songs.add(new Library("The Vibe", "Kokri", R.drawable.play_button));
        songs.add(new Library("Buddhu Sa Mann", "Amaal Malik", R.drawable.play_button));
        songs.add(new Library("Bang Bang", "Vishal-Shekhar", R.drawable.play_button));

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
