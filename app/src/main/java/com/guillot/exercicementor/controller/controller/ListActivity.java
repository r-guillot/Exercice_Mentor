package com.guillot.exercicementor.controller.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.guillot.exercicementor.R;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity implements VideoGamesAdapter.OnItemClickListener {
    public static final String EXTRA_IMG = "coverGame";
    public static final String EXTRA_TITLE = "titleGame";
    public static final String EXTRA_RESUME = "resumeGame";

    private RecyclerView mRecyclerView;
    private ArrayList<dataVideoGames> bestGames;
    private VideoGamesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mRecyclerView = findViewById(R.id.recycler_view);

        bestGames = new ArrayList<>();

        bestGames.add(new dataVideoGames("Counter-Strike:Globale Offensive", R.drawable.csgo,
                "Counter-Strike: Global Offensive est un jeu de tir à la première personne multijoueur en ligne basé sur le jeu d'équipe développé par Valve Corporation. Il est sorti le 21 août 2012 sur PC et consoles."));
        bestGames.add(new dataVideoGames("Red Dead Redemption II", R.drawable.maxresdefault,
                "Red Dead Redemption II est un jeu vidéo d'action-aventure et de western multiplateforme, développé par Rockstar Studios et édité par Rockstar Games, sorti le 26 octobre 2018 sur PlayStation 4 et Xbox One et le 5 novembre 2019 sur Microsoft Windows"));
        bestGames.add(new dataVideoGames("The Witcher 3", R.drawable.witcher,
                "The Witcher 3: Wild Hunt est un jeu vidéo de type action-RPG développé par le studio polonais CD Projekt RED. Sorti le 19 mai 2015 sur PC, PlayStation 4 et Xbox One, puis sur Nintendo Switch le 15 octobre 2019."));
        bestGames.add(new dataVideoGames("Doom", R.drawable.doom,
                "Doom est un jeu vidéo de tir à la première personne dans un univers de science-fiction et d'horreur, développé par id Software et édité par Bethesda Softworks, sorti le 13 mai 2016 sur Microsoft Windows, PlayStation 4 et Xbox One. Un port sur Nintendo Switch est sorti et le 10 novembre 2017"));
        bestGames.add(new dataVideoGames("Rust", R.drawable.rust,
                "Rust est un jeu vidéo d'aventure et de survie en multijoueur développé et édité par Facepunch Studios. Le jeu est d'abord disponible en accès anticipé à partir de décembre 2013, puis sort sur PC le 8 février 2018."));
        bestGames.add(new dataVideoGames("Mass Effect", R.drawable.mass_effect,
                "Mass Effect est une série de jeux vidéo d'action-RPG se déroulant dans un univers de science-fiction et produite par BioWare"));
        bestGames.add(new dataVideoGames("Total War Saga: Thrones of Britannia", R.drawable.tw,
                "Total War Saga : Thrones of Britannia est un jeu vidéo de stratégie au tour par tour et de tactique en temps réel développé par Creative Assembly et publié par Sega le 3 mai 2018."));
        bestGames.add(new dataVideoGames("God of War", R.drawable.godofwar,
                "God of War est une série de jeux vidéo d'action-aventure de type beat them all débutée en 2005, produite par Sony Computer Entertainment."));
        bestGames.add(new dataVideoGames("South Park : The Stick Of Truth", R.drawable.southpark,
                "South Park : Le Bâton de la vérité est un jeu vidéo de rôle, basé sur l'univers du dessin animé South Park, développé par Obsidian Entertainment et édité par Ubisoft. D'abord prévu pour le 5 mars 2013, il est repoussé à la suite des problèmes financiers de THQ."));
        bestGames.add(new dataVideoGames("Grand Theft Auto V", R.drawable.gta,
                "Grand Theft Auto V est un jeu vidéo d'action-aventure, développé par Rockstar North et édité par Rockstar Games. Faisant partie de la série vidéoludique série des jeux vidéo Grand Theft Auto, il est une suite de l'univers fictif introduit dans Grand Theft Auto IV, sorti en 2008."));
        bestGames.add(new dataVideoGames("The Elder Scrolls : Skyrim", R.drawable.skyrim,
                "The Elder Scrolls V: Skyrim est un jeu vidéo de rôle et d'action développé par Bethesda Game Studios et édité par Bethesda Softworks, sorti le 11 novembre 2011 sur PlayStation 3, Xbox 360 et Microsoft Windows."));
        bestGames.add(new dataVideoGames("Age Of Empire II : Definitive Edition", R.drawable.aoe2,
                "Age of Empires II: Definitive Edition est un jeu vidéo de stratégie en temps réel développé par Forgotten Empires et publié par Xbox Game Studios. Il s'agit d'un remasterisation du jeu original Age of Empires II: The Age of Kings, célébrant le 20e anniversaire de l'original."));
        bestGames.add(new dataVideoGames("Fable", R.drawable.fable,
                "Fable est un jeu vidéo de type action-RPG développé par Lionhead Studios pour l'éditeur américain Microsoft Game Studios. Il sort en septembre-octobre 2004 sur Xbox. Le jeu est développé dans les studios Big Blue Box, laquelle est une unité de Lionhead Studios."));


        mAdapter = new VideoGamesAdapter(bestGames);

        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(ListActivity.this);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

    }

    @Override
    public void onItemClick(int position) {
        Intent detailIntent = new Intent(this, VideoGamesDetailsActivity.class);
        dataVideoGames clickedItem = bestGames.get(position);

        detailIntent.putExtra(EXTRA_IMG, clickedItem.getCover());
        detailIntent.putExtra(EXTRA_TITLE,clickedItem.getName());
        detailIntent.putExtra(EXTRA_RESUME,clickedItem.getResume());

        startActivity(detailIntent);
        finish();
    }

}