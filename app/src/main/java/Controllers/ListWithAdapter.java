package Controllers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.time.LocalDate;
import java.util.ArrayList;

import example.codeclan.com.listwithadapter.Album.Album;
import example.codeclan.com.listwithadapter.R;

public class ListWithAdapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_with_adapter);


        ArrayList<Album> albums = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            Album album = new Album("war", LocalDate.now(), "war", true);
            albums.add(album);
        }



        AdapterAlbumItem adapterAlbumItem = new AdapterAlbumItem(this, albums);

        ((ListView)findViewById(R.id.albumList)).setAdapter(adapterAlbumItem);


    }
}
