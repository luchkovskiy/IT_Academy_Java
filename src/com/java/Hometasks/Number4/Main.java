package com.java.Hometasks.Number4;

import java.util.Random;

public class Main {
    public int catAgeForEach;
    public String catNameForEach;

    public Main(int age, String name) {
        catAgeForEach = age;
        catNameForEach = name;
    }
    public Cat cat = new Cat(create_randomInt(), create_randomString());
    public static void main(String[] args) {
        Cat.creatingCats_withWhile();
    }

    public String toString() {
        return "Cat's age is " + catAgeForEach + "\n Cat's name - " + catNameForEach;
    }

    public static String create_randomString() {
        String str;
        String stringCatName = " ";
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            str = String.valueOf((char) (rand.nextInt(26) + 'A'));
            stringCatName = stringCatName + str;
        }
        return stringCatName;
    }

    public static int create_randomInt() {
        Random random = new Random();
        return random.nextInt(27) + 1;
    }
}

