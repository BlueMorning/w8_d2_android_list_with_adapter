package Controllers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

import example.codeclan.com.listwithadapter.Album.Album;
import example.codeclan.com.listwithadapter.R;

/**
 * Created by horizon on 23/01/2018.
 */

public class AdapterAlbumItem extends BaseAdapter {

    private Context context;
    private ArrayList<Album> albums;

    public AdapterAlbumItem(Context context, ArrayList<Album> albums){
        this.context = context;
        this.albums  = albums;
    }


    @Override
    public int getCount() {
        return this.albums.size();
    }

    @Override
    public Album getItem(int i) {
        return this.albums.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.album_item, parent, false);

        Album album = this.getItem(i);


        ((TextView)rowView.findViewById(R.id.albumTitle)).setText(album.getTitle());
        ((TextView)rowView.findViewById(R.id.albumReleaseDate)).setText(album.getReleaseDate().toString());
        ((ImageView)rowView.findViewById(R.id.albumImage)).setImageResource(R.drawable.war);
        ((Switch)rowView.findViewById(R.id.albumStillProduce)).setChecked(album.getStillProduce());


        return rowView;
    }
}
