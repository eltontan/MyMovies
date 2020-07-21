package sg.edu.rp.c346.id18016094.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Movie> movieList;

    public CustomAdapter(Context context, int resource, ArrayList<Movie> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvGenre = rowView.findViewById(R.id.textViewGenre);
        ImageView ivPg = rowView.findViewById(R.id.imageView);

        Movie currentItem = movieList.get(position);
        tvTitle.setText(currentItem.getTitle());
        tvGenre.setText(currentItem.getYear() + " - " + currentItem.getGenre());

        if (currentItem.getRated().equalsIgnoreCase("g")) {
            ivPg.setImageResource(R.drawable.rating_g);
        } else if (currentItem.getRated().equalsIgnoreCase("pg")) {
            ivPg.setImageResource(R.drawable.rating_pg);
        } else if (currentItem.getRated().equalsIgnoreCase("pg13")) {
            ivPg.setImageResource(R.drawable.rating_pg13);
        } else if (currentItem.getRated().equalsIgnoreCase("nc6")) {
            ivPg.setImageResource(R.drawable.rating_nc16);
        } else if (currentItem.getRated().equalsIgnoreCase("m18")) {
            ivPg.setImageResource(R.drawable.rating_m18);
        } else if (currentItem.getRated().equalsIgnoreCase("R21")) {
            ivPg.setImageResource(R.drawable.rating_r21);
        }


        return rowView;
    }
}