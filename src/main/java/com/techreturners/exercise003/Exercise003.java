package com.techreturners.exercise003;

import java.util.ArrayList;

public class Exercise003 {
    private ArrayList<String> favourList;

    public Exercise003() {
        favourList = new ArrayList<String>();
        favourList.add(0, "Pistachio");
        favourList.add(1, "Raspberry Ripple");
        favourList.add(2, "Vanilla");
        favourList.add(3, "Mint Chocolate Chip");
        favourList.add(4, "Chocolate");
        favourList.add(5, "Mango Sorbet");

    }

    int getIceCreamCode(String iceCreamFlavour) {

        return favourList.indexOf(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
        return favourList.toArray(String[]::new);
    }

}
