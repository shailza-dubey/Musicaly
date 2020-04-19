package com.example.musicaly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RomanticActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Library> songs = new ArrayList<Library>();
        songs.add(new Library("Aaj Bhi", "Vishal Mishra",R.drawable.play_button));
        songs.add(new Library("Bhula Dunga", "Darshan Raval", R.drawable.play_button));
        songs.add(new Library("Memories", "Maroon 5", R.drawable.play_button));
        songs.add(new Library("Baatein Karo", "Vayu", R.drawable.play_button));
        songs.add(new Library("Shayad", "Pritam, Arijit Singh", R.drawable.play_button));
        songs.add(new Library("Tera Hi Rahun", "Gajendra Verma", R.drawable.play_button));
        songs.add(new Library("Let Her Go", "Passenger", R.drawable.play_button));
        songs.add(new Library("Photograph", "Ed Sheeran", R.drawable.play_button));
        songs.add(new Library("In My Blood", "Shawn Mendes", R.drawable.play_button));
        songs.add(new Library("Maana Dil", "B Praak", R.drawable.play_button));

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
