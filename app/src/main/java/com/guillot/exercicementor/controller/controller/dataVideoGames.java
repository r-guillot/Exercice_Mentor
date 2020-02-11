package com.guillot.exercicementor.controller.controller;

public class dataVideoGames {
    private String name;
    private int cover;

    dataVideoGames(String name,int cover) {
        this.name=name;
        this.cover=cover;
    }

    public String getName() {
        return name;
    }

    public int getCover() {
        return cover;
    }
}
