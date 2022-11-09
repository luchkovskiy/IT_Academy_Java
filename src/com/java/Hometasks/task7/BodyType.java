package com.java.Hometasks.task7;

public enum BodyType {
    CIRCLE("круглое"),
    OVAL("овальное"),
    CONE("в виде конуса");

    private final String title;

    public String getTitle() {
        return title;
    }

    BodyType(String title) {
        this.title = title;
    }
}
