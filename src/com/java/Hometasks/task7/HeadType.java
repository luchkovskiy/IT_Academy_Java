package com.java.Hometasks.task7;

public enum HeadType {
    RECTANGLE("прямоугольная"),
    CIRCLE("круглая"),
    TRIANGLE("треугольная");

    private final String title;

    public String getTitle() {
        return title;
    }

    HeadType(String title) {
        this.title = title;
    }
}
