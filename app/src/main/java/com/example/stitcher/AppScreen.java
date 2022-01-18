package com.example.stitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AppScreen extends AppCompatActivity {

    private ListView listView;
    private MenuAdapter menuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_screen);

        menuAdapter = new MenuAdapter(getGenres());
        listView = findViewById(R.id.listView);
        listView.setAdapter(menuAdapter);
    }

    private List<Genres> getGenres(){
        List<Genres> lst = new ArrayList<>();
        lst.add(new Genres());
        return lst;
    }
}