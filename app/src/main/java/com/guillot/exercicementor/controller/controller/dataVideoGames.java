package com.guillot.exercicementor.controller.controller;

public class dataVideoGames {
    private String name;
    private int cover;
    private String resume;

    dataVideoGames(String name,int cover,String resume) {
        this.name=name;
        this.cover=cover;
        this.resume=resume;
    }


    public String getName() {
        return name;
    }

    public int getCover() {
        return cover;
    }

    public String getResume() {
        return resume;
    }
}
