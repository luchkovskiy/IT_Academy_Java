package com.java.Hometasks.nubmer6.port;

import com.java.Hometasks.nubmer6.ship.Ship;

import java.util.Random;

public class Port extends Ship {
    Random rand = new Random();
    int currentShipCounter = 0;
    int totalShipCounter = 0;
    int maxShipCount;

    {
        maxShipCount = 10;
    }

    public void startThePort() {
        mainPortJob();
    }

    private void mainPortJob() {
        int[] currentShipArray = new int[10];
        int[] totalShipArray = new int[10];
        int currentWaterMass = 0;
        int totalWaterMass = 0;
        for (int i = 0; i < maxShipCount; i++) {
            if (shipDeleteOrStay() == 1) {
                totalShipArray[i] = getShipWaterMass();
                currentShipArray[i] = totalShipArray[i];
                currentShipCounter++;
            } else {
                totalShipArray[i] = getShipWaterMass();
            }
            totalShipCounter++;
        }
        for (int k : currentShipArray) {
            currentWaterMass += k;
        }
        for (int i = 0; i < totalShipArray.length; i++) {
            int j = i + 1;
            totalWaterMass += totalShipArray[i];
            if (currentShipArray[i] == 0) {
                System.out.println("Ship number " + j + " " + "(left)\n" + totalShipArray[i] + " m^3");
                continue;
            }
            System.out.println("Ship number " + j + " " + "(remaining)\n" + totalShipArray[i] + " m^3");
        }
        printPortResults(currentWaterMass, totalWaterMass);
    }

    private void printPortResults(int currentWaterMass, int totalWaterMass) {
        int leftWaterMass = totalWaterMass - currentWaterMass;
        System.out.println("Total number of arriving ships (per day) - " + totalShipCounter);
        System.out.println("Number of remaining ships - " + currentShipCounter);
        System.out.println("Number of left ships - " + (totalShipCounter - currentShipCounter));
        System.out.println("Total amount of water in the port (per day) is " + totalWaterMass + " m^3");
        System.out.println("Amount of water for left ships in the port is " + leftWaterMass + " m^3");
        System.out.println("Current amount of water in the port is " + currentWaterMass + " m^3");
    }

    private int shipDeleteOrStay() {
        int[] variantArray = {1, 2};
        return variantArray[rand.nextInt(variantArray.length)];
    }
}
