package com.example.musicaly;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class RecentlyActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ArrayList<Library> songs = new ArrayList<Library>();
        songs.add(new Library("Attention", "Charlie Puth",R.drawable.play_button));
        songs.add(new Library("Intentions", "Justn Beiber, Quavo", R.drawable.play_button));
        songs.add(new Library("bad guy", "Billie Eilish", R.drawable.play_button));
        songs.add(new Library("Agar Tum Saath Ho", "Alka Yagnik, Arijit Singh", R.drawable.play_button));
        songs.add(new Library("Nazm Nazm", "Arko", R.drawable.play_button));
        songs.add(new Library("Ghaib", "Parvaaz", R.drawable.play_button));
        songs.add(new Library("Sunday Best", "Surfaces", R.drawable.play_button));
        songs.add(new Library("Adore You", "Harry Styles", R.drawable.play_button));
        songs.add(new Library("Dil Diyan Gallan", "Atif Aslam", R.drawable.play_button));
        songs.add(new Library("Chale Aana", "Armaan Malik", R.drawable.play_button));

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
