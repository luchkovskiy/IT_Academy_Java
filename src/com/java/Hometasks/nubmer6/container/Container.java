package com.java.Hometasks.nubmer6.container;

import java.util.Random;

public class Container {
    Random rand = new Random();
    final double pi = Math.PI;
    String[] form = {"Cylinder", "Cube", "Cone"};

    public double getContainerWaterVolume(int i) {
        int diagonal;
        if (i == 1) {
            diagonal = 20;
        } else {
            diagonal = 10;
        }
        int height = getContainerHeight();
        double volume = 0;
        switch (getContainerType()) {
            case "Cylinder":
                volume = (Math.pow(diagonal, 2) / 4 * pi) * height;
                break;
            case "Cube":
                volume = Math.pow(diagonal / Math.sqrt(2), 3);
                break;
            case "Cone":
                volume = (double) 1 / 3 * (Math.pow(diagonal, 2) / 4 * pi) * height;
                break;
            default:
                System.out.println("Error");
        }
        return volume;
    }

    private String getContainerType() {
        return form[rand.nextInt(form.length)];
    }

    private int getContainerHeight() {
        int min = 10;
        int max = 100;
        int diff = max - min;
        int randomHeight = rand.nextInt(diff + 1);
        return randomHeight + min;
    }

}

