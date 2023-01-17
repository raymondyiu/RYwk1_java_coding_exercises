package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {

        return Character.toString(Character.toUpperCase(word.charAt(0))) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {

        return Character.toString(firstName.charAt(0)) + "." + Character.toString(lastName.charAt(0));
    }

    public double round(double value, int places) {

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public double addVat(double originalPrice, double vatRate) {

        double ret = originalPrice + originalPrice * vatRate / 100;
        ret = round(ret, 2);
        return ret;
    }

    public String reverse(String sentence) {

        String rev = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            rev = rev + Character.toString(sentence.charAt(i));
        }
        return rev;
    }

    public int countLinuxUsers(List<User> users) {

        int count = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getType() == "Linux") {
                count += 1;
            }
        }

        return count;
    }
}
