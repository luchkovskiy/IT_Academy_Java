package com.java.Hometasks.taks8;


import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest extends MyArrayList {
    public void methodTesting() {
        MyList<String> str = new MyArrayList<>();
        str.add("Привет");
        str.add("Пока");
        str.add("Gi");
        str.add(3, "Мур");
        str.add(3, "Гав");
        str.add("Hi");
        str.add("Алеша");
        str.add(6, "Марина");
        System.out.println(str.size());
        System.out.println(str.contains("Шок"));
        System.out.println(str.isEmpty());
        System.out.println(str.remove("Марина"));
        List<String> str2 = new ArrayList<>();
        str2.add("Мужик");
        str2.add("Красавчик");
        str.addAll(str2);
        System.out.println(str.get(2));
        str.remove(2);
        str.set(2, "Pow");
        System.out.println(str.indexOf("Pow"));
        str.printCollection(); // Вывод коллекции на экран (удобный)
        MyList<String> str3 = new MyArrayList<>(str2);
        System.out.println(str3.size());
    }
}

