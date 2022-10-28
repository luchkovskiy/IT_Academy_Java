package com.java.Hometasks.Number4;

public class Cat {
    final private static String default_name = "Barsik";
    final private static int default_age = 5;
    private static String cat_name;
    private static int cat_age;

    public Cat(int age, String name) {
        cat_age = age;
        cat_name = name;
    }

    public static void creatingCats_withWhile() {
        int cat_counter = 1;
        System.out.println("\nFirst cycle (while)\n");
        while (cat_counter <= 10) {
            System.out.println("Cat № " + cat_counter + ": " + " Age is " + default_age + "; Name is " + default_name);
            cat_counter++;
        }
        Cat.creatingCats_withFor();
    }

    public static void creatingCats_withFor() {
        System.out.println("\nSecond cycle (for)\n");
        for (int i = 1; i <= 10; i++) {
            setCat_age(Main.create_randomInt());
            setCat_name(Main.create_randomString());
            System.out.println("Cat № " + i + ": Age is " + getCat_age() + "; Name is " + getCat_name());
        }
        Cat.creatingCats_withDoWhile();
    }

    public static void creatingCats_withDoWhile() {
        System.out.println("\nThird cycle (do while)\n");
        int doWhile_counter = 1;
        do {
            System.out.println("Cat № " + doWhile_counter + ": Age is " + cat_age + "; Name is " + cat_name);
            doWhile_counter++;
        } while (doWhile_counter <= 10);
        Cat.creatingCats_withForEach();
    }

    public static void creatingCats_withForEach() {
        System.out.println("\nFourth cycle (foreach)\n");
        Main[] cats = new Main[5];
        for (int j = 0; j < cats.length; j++) {
            cats[j] = new Main(Main.create_randomInt(), Main.create_randomString());
        }
        for (Main dataCat : cats) {
            System.out.println(dataCat.toString());
        }
    }

    public static String getCat_name() {
        return cat_name;
    }

    public static void setCat_name(String cat_name) {
        Cat.cat_name = cat_name;
    }

    public static int getCat_age() {
        return cat_age;
    }

    public static void setCat_age(int cat_age) {
        Cat.cat_age = cat_age;
    }

}
