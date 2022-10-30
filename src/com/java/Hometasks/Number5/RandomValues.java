package com.java.Hometasks.Number5;

import java.util.Random;

public class RandomValues {
    public static Random rand = new Random();

    public static String createRandomString() {
        StringBuilder stringName = new StringBuilder(" ");
        for (int i = 0; i < 7; i++) {
            String str = String.valueOf((char) (rand.nextInt(20) + 'A'));
            stringName.append(str);
        }
        return stringName.toString();
    }

    public static String createRandomDouble() {
        return getString();
    }

    private static String getString() {
        Double dbl = rand.nextDouble() * 3;
        String str = String.valueOf(dbl);
        return str.substring(0, 7);
    }
}
