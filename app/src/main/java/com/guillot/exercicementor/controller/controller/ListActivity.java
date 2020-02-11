package com.guillot.exercicementor.controller.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.guillot.exercicementor.R;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<dataVideoGames> bestGames;
    private VideoGamesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mRecyclerView = findViewById(R.id.recycler_view);

        bestGames = new ArrayList<>();

        bestGames.add(new dataVideoGames("Counter-Strike:Globale Offensive",R.drawable.csgo));
        bestGames.add(new dataVideoGames("Red Dead Redemption II",R.drawable.maxresdefault));
        bestGames.add(new dataVideoGames("The Witcher 3",R.drawable.witcher));
        bestGames.add(new dataVideoGames("Doom",R.drawable.doom));
        bestGames.add(new dataVideoGames("Rust",R.drawable.rust));
        bestGames.add(new dataVideoGames("Mass Effect",R.drawable.mass_effect));
        bestGames.add(new dataVideoGames("Total War Saga: Thrones of Britannia",R.drawable.tw));
        bestGames.add(new dataVideoGames("God of War",R.drawable.godofwar));
        bestGames.add(new dataVideoGames("South Park",R.drawable.southpark));
        bestGames.add(new dataVideoGames("Grand Theft Auto V",R.drawable.gta));
        bestGames.add(new dataVideoGames("The Elder Scrolls : Skyrim",R.drawable.skyrim));
        bestGames.add(new dataVideoGames("Age Of Empire II",R.drawable.aoe2));
        bestGames.add(new dataVideoGames("Fable",R.drawable.fable));


        mAdapter = new VideoGamesAdapter(bestGames);

        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

    }
}
