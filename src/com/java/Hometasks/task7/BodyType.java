package com.java.Hometasks.task7;

public enum BodyType {
    CIRCLE("круглое"),
    OVAL("овальное"),
    CONE("в виде конуса");

    private final String title;

    BodyType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Тело - " + title;
    }
}
