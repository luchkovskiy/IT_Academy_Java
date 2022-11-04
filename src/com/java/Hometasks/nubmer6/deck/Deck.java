package com.java.Hometasks.nubmer6.deck;

import com.java.Hometasks.nubmer6.container.Container;
import com.java.Hometasks.nubmer6.water.Water;

import java.util.Random;

public class Deck {
    Random rand = new Random();
    Container container = new Container();
    Water water = new Water();
    String[] type = {"single-deck", "two-deck"};

    public String getDeckType() {
        return type[rand.nextInt(type.length)];
    }

    public double getContainerWaterMass(int i) {
        double containerVolume = container.getContainerWaterVolume(i);
        int waterDensity = water.getWaterDensity();
        return containerVolume * waterDensity / 1000000;

    }
}
