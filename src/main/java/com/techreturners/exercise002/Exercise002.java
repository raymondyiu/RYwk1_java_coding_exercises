package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person p) {

        return (p.getCity().equals("Manchester"));
    }

    public boolean canWatchFilm(Person p) {

        if (p.getAge() >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
