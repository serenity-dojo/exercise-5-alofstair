package com.serenitydojo;

public class Cat extends Pet {
    private String favoriteToy;

    public static final String CAT_PLAY = "plays with string";

    public Cat(String name, String favoriteToy, int age) {
        super(name,age);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    @Override
    public String play() {
        return CAT_PLAY;
    }
}
