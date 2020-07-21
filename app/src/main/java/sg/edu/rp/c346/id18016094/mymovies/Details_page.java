package sg.edu.rp.c346.id18016094.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details_page extends AppCompatActivity {
    ImageView ivRated;
    TextView tvTitle, tvYearGenre, tvDescription, tvDate, tvTheatre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page);

                ivRated = findViewById(R.id.imageViewRating);
                tvTitle = findViewById(R.id.textViewTitle);
                tvYearGenre = findViewById(R.id.textViewYearGenre);
                tvDescription = findViewById(R.id.textViewDescription);
                tvDate = findViewById(R.id.textViewDate);
                tvTheatre = findViewById(R.id.textViewTheatre);

                Intent getIntent = getIntent();
                String title = getIntent.getStringExtra("title");
                int year = getIntent.getIntExtra("year",0);
                String rated = getIntent.getStringExtra("rated");
                String genre = getIntent.getStringExtra("genre");
                String WatchDate = getIntent.getStringExtra("WatchDate");
                String theatre = getIntent.getStringExtra("theatre");
                String desc = getIntent.getStringExtra("description");


                if (rated.equalsIgnoreCase("g")){
                    ivRated.setImageResource(R.drawable.rating_g);
                }
                else if (rated.equalsIgnoreCase("pg")){
                    ivRated.setImageResource(R.drawable.rating_pg);
                }
                else if (rated.equalsIgnoreCase("pg13")){
                    ivRated.setImageResource(R.drawable.rating_pg13);
                }
                else if (rated.equalsIgnoreCase("nc16")){
                    ivRated.setImageResource(R.drawable.rating_nc16);
                }
                else if (rated.equalsIgnoreCase("m18")){
                    ivRated.setImageResource(R.drawable.rating_m18);
                }
                else {
                    ivRated.setImageResource(R.drawable.rating_r21);
                }
                tvTitle.setText(title);
                tvYearGenre.setText(year + " - " + genre);
                tvDescription.setText(desc);
                tvDate.setText(WatchDate);
                tvTheatre.setText(theatre);
            }
        }
