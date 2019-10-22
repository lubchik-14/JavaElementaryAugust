package com.hillel.lessons.lesson11.services;

import java.util.Random;

/**
 * The Randomizer class generates random values
 */
public class Randomizer {
    private static Random random = new Random();

    /**
     * Generates a random int value within min/max parameters
     *
     * @param min min edge of bound
     * @param max max edge of bound
     * @return a random int value
     */
    public static int randomInteger(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    /**
     * Generates a random boolean value
     *
     * @return false or true randomly
     */
    public static boolean randomBoolean() {
        return random.nextBoolean();
    }
}
