package com.guillot.exercicementor.controller.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.guillot.exercicementor.R;

import java.util.List;

public class VideoGamesAdapter extends RecyclerView.Adapter<VideoGamesAdapter.MyViewHolder> {
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView mNameVG;
        private ImageView mCoverVG;

        MyViewHolder(View itemView) {
            super(itemView);

            mNameVG = itemView.findViewById(R.id.name_game);
            mCoverVG = itemView.findViewById(R.id.cover_game);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mListener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            mListener.onItemClick(position);
                        }
                    }
                }
            });
        }
        void display(dataVideoGames videoGame) {
            mNameVG.setText(videoGame.getName());
            mCoverVG.setImageResource(videoGame.getCover());
        }

    }

    private List<dataVideoGames> bestGames;

    public VideoGamesAdapter(List<dataVideoGames> bestGames) {
        this.bestGames = bestGames;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.videogamelayout,parent,false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.display(bestGames.get(position));
    }

    @Override
    public int getItemCount() {
        return bestGames.size();
    }

}
