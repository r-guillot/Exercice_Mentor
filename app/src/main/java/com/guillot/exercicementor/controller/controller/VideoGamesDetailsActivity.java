package com.guillot.exercicementor.controller.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.guillot.exercicementor.R;

import static com.guillot.exercicementor.controller.controller.ListActivity.EXTRA_IMG;
import static com.guillot.exercicementor.controller.controller.ListActivity.EXTRA_RESUME;
import static com.guillot.exercicementor.controller.controller.ListActivity.EXTRA_TITLE;

public class VideoGamesDetailsActivity extends AppCompatActivity {
    private ImageView mDetailCover;
    private TextView mDetailTitle;
    private TextView mDetailResume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_games_details);

        Intent intent = getIntent();
        int coverGame = intent.getIntExtra(EXTRA_IMG, 0);
        String titleGame = intent.getStringExtra(EXTRA_TITLE);
        String resumeGame = intent.getStringExtra(EXTRA_RESUME);

        mDetailCover = findViewById(R.id.cover_game_detail);
        mDetailTitle = findViewById(R.id.title_game_detail);
        mDetailResume = findViewById(R.id.resume_game_detail);

        mDetailCover.setImageResource(coverGame);
        mDetailTitle.setText(titleGame);
        mDetailResume.setText(resumeGame);

    }
    @Override
    public void onBackPressed() {
        Intent detailIntent = new Intent(this, ListActivity.class);
        startActivity(detailIntent);
        finish();
    }

}
