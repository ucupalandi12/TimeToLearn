package com.example.ucupalandi12.timetolearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ucupalandi12.timetolearn.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        initializeData();

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        RVAdapter adapter = new RVAdapter(movies);
        rv.setAdapter(adapter);
    }

    private List<MovieData> movies;

    private void initializeData() {
        movies = new ArrayList<>();
        movies.add(new MovieData("Resident Evil: Vendetta", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTg0OTQ0ODY1N15BMl5BanBnXkFtZTgwNjkxNjI4MTI@._V1_SY1000_CR0,0,664,1000_AL_.jpg", "2017"));
        movies.add(new MovieData("1408", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTk1MDg0NTU0OV5BMl5BanBnXkFtZTcwMTM1NDk0MQ@@._V1_.jpg", "2007"));
        movies.add(new MovieData("Deadpool ", "https://images-na.ssl-images-amazon.com/images/M/MV5BYzE5MjY1ZDgtMTkyNC00MTMyLThhMjAtZGI5OTE1NzFlZGJjXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SY1000_CR0,0,666,1000_AL_.jpg", "2016"));
    }
}
