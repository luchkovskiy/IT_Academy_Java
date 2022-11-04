package com.java.Hometasks.nubmer6.water;

import java.util.Random;

public class Water {
    Random rand = new Random();
    int[] density = {1000, 2000};
    public int getWaterDensity() {
        return density[rand.nextInt(density.length)];
    }
}
