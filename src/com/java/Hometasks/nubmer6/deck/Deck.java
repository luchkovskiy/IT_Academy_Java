package com.java.Hometasks.nubmer6.deck;

import com.java.Hometasks.nubmer6.container.Container;

import java.util.Random;

public class Deck extends Container {
    Random rand = new Random();
    String[] type = {"single-deck", "two-deck"};

    public String getDeckType() {
        return type[rand.nextInt(type.length)];
    }

    public double getContainerWaterMass(int i) {
        double containerVolume = getContainerWaterVolume(i);
        int waterDensity = getWaterDensity();
        return containerVolume * waterDensity / 1000000;

    }
}
