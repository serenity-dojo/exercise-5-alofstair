package com.serenitydojo;

public class Hamster extends Pet{

    public Hamster(String name, String favoriteGame, int age) {
        super(name,age);

    }

    public static final String HAMSTER_PLAY = "runs in wheel";

    @Override
    public String favoriteGame() {
        return super.favoriteGame();
    }

    @Override
    public String play() {
        return HAMSTER_PLAY;
    }
}
