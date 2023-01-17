package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toString(Character.toUpperCase(word.charAt(0))) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return Character.toString(firstName.charAt(0)) + "." + Character.toString(lastName.charAt(0));
    }

    public double round(double value, int places) {

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double ret = originalPrice + originalPrice * vatRate / 100;
        ret = round(ret, 2);
        // System.out.println("raymond addVat : " + Double.toString(ret));
        return ret;
    }

    public String reverse(String sentence) {
        // Add your code here
        String rev = "";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            rev = rev + Character.toString(sentence.charAt(i));
        }
        // System.out.println("raymond reverse : " + rev);
        return rev;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        int count = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getType() == "Linux") {
                count += 1;
            }
        }
        // System.out.println("raymond countLinuxUsers : " + count);
        return count;
    }
}
