package com.java.Hometasks.nubmer6.ship;

import com.java.Hometasks.nubmer6.deck.Deck;

public class Ship extends Deck {
    double totalWaterMass = 0;

    public int getShipWaterMass() {
        totalWaterMass = 0;
        int type = getContainerPlacingType();
        if (type == 1) {
            totalWaterMass = getWaterMassForFirstPlacingType(type);
        } else {
            totalWaterMass = getWaterMassForSecondPlacingType(type + 1);
        }
        return (int) totalWaterMass;
    }

    private double getWaterMassForFirstPlacingType(int type) {
        if (getDeckType().equals("single-deck")) {
            for (int i = 0; i < 2; i++) {
                totalWaterMass += getContainerWaterMass(type);
            }
        } else getWaterMassForTwoDeckShip();
        return totalWaterMass;
    }

    private double getWaterMassForSecondPlacingType(int type) {
        if (getDeckType().equals("single-deck")) {
            for (int i = 0; i < 4; i++) {
                totalWaterMass += getContainerWaterMass(type);
            }
        } else totalWaterMass = getWaterMassForTwoDeckShip();
        return totalWaterMass;
    }


    private double getWaterMassForTwoDeckShip() {
        int type = getContainerPlacingType();
        if (type == 1) {
            for (int j = 0; j < 2; j++) {
                totalWaterMass += getContainerWaterMass(type);
            }
        } else {
            for (int i = 0; i < 4; i++) {
                totalWaterMass += getContainerWaterMass(type + 1);
            }
        }
        return totalWaterMass;
    }

    private int getContainerPlacingType() {
        return (int) Math.round(Math.random() + 1);
    }

}