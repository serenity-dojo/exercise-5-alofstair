package com.serenitydojo;

public abstract class Pet {

    private String name;

    private int age;

    private String fovoriteGame;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String favoriteGame() {
        this.fovoriteGame =  fovoriteGame;
        return null;
    }

    public abstract String play();


}
