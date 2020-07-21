package sg.edu.rp.c346.id18016094.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView tvTitle, tvYear, tvGenre;
    ListView lvMovie;
    ArrayList<Movie> al;
    CustomAdapter ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.textViewTitle);
        tvGenre = findViewById(R.id.textViewGenre);

        lvMovie = findViewById(R.id.listViewMovie);

        al = new ArrayList<>();

        Calendar c = Calendar.getInstance();
        c.set(2014, 12, 15);

        Calendar c1 = Calendar.getInstance();
        c.set(2015, 5, 15);

        Movie item1 = new Movie("The Avengers", 2012, "pg", "Action|Sci-Fi", c, "Golden Village - Bishan",
                "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.");
        al.add(item1);

        Movie item2 = new Movie("Planes", 2013, "pg13", "Animation | Comedy", c1, "Cathay - AMK Hub",
                "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.");
        al.add(item2);

        ca = new CustomAdapter(this, R.layout.row, al);
        lvMovie.setAdapter(ca);

        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent = new Intent(MainActivity.this, Details_page.class);
               startActivity(intent);

                Movie currentMovie = al.get(position);
                intent.putExtra("title", currentMovie.getTitle());
                intent.putExtra("year", currentMovie.getYear());
                intent.putExtra("rated", currentMovie.getRated());
                intent.putExtra("genre", currentMovie.getGenre());
                intent.putExtra("WatchDate", currentMovie.getWatched_on());
                intent.putExtra("theatre", currentMovie.getIn_theatre());
                intent.putExtra("description", currentMovie.getDescription());
                startActivity(intent);

            }
        });
    }
}
