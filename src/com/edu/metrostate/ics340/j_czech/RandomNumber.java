package com.edu.metrostate.ics340.j_czech;

import java.util.Random;

public class RandomNumber {

    public RandomNumber() {
    }

        static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    @Override
    public String toString() {
        return "RandomNumber{}";
    }
}



