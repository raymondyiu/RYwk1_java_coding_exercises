package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person p) {
        // Add your code here
        if (p.getCity() == "Manchester") {

            return true;
        } else {
            return false;
        }
    }

    public boolean canWatchFilm(Person p) {
        // Add your code here
        if (p.getAge() >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
