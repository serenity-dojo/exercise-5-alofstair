package com.serenitydojo;

public class Hamster extends Pet{

    private String favoriteToy;

    public Hamster(String name, String favoriteToy, int age) {
        super(name,age);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
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
