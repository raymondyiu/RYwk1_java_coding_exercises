package com.techreturners.exercise002;

public class Exercise002 {

    private int ADULT_AGE = 18;

    public boolean isFromManchester(Person p) {

        return (p.getCity().equals("Manchester"));
    }

    public boolean canWatchFilm(Person p) {

        return (p.getAge() >= ADULT_AGE);
    }
}
