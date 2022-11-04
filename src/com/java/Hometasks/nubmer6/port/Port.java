package com.java.Hometasks.nubmer6.port;

import com.java.Hometasks.nubmer6.ship.Ship;

import java.util.Random;

public class Port {
    Random rand = new Random();
    int currentShipCounter = 0;
    int totalShipCounter = 0;
    int maxShipCount;

    {
        maxShipCount = 10;
    }

    public void startThePort() {
        Ship ship = new Ship();
        mainPortJob(ship);

    }

    private void mainPortJob(Ship ship) {
        int[] currentShipArray = new int[10];
        int[] totalShipArray = new int[10];
        int currentWaterMass = 0;
        int totalWaterMass = 0;
        for (int i = 0; i < maxShipCount; i++) {
            if (shipDeleteOrStay() == 1) {
                currentShipArray[i] = ship.getShipWaterMass();
                totalShipArray[i] = ship.getShipWaterMass();
                currentShipCounter++;
            } else {
                totalShipArray[i] = ship.getShipWaterMass();
            }
            totalShipCounter++;
        }
        for (int i = 0; i < currentShipArray.length - 1; i++) {
            currentWaterMass += currentShipArray[i];
        }
        for (int i = 0; i < totalShipArray.length - 1; i++) {
            totalWaterMass += totalShipArray[i];
        }
        printPortResults(currentWaterMass, totalWaterMass);
    }

    private void printPortResults(int currentWaterMass, int totalWaterMass) {
        System.out.println("Total number of arriving ships (per day) - " + totalShipCounter);
        System.out.println("Number of remaining ships - " + currentShipCounter);
        System.out.println("Number of left ships - " + (totalShipCounter - currentShipCounter));
        System.out.println("Total amount of water in the port (per day) is " + totalWaterMass + " m^3");
        System.out.println("Current amount of water in the port is " + currentWaterMass + " m^3");
    }

    private int shipDeleteOrStay() {
        int[] variantArray = {1, 2};
        return variantArray[rand.nextInt(variantArray.length)];
    }

}
