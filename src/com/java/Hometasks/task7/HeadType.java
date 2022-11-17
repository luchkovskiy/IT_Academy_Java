package com.java.Hometasks.task7;

public enum HeadType {
    RECTANGLE("прямоугольная"),
    CIRCLE("круглая"),
    TRIANGLE("треугольная");

    private final String title;

    HeadType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Голова - " + title + "\n";
    }
}
