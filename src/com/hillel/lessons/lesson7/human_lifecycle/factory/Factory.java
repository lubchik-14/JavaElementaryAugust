package com.hillel.lessons.lesson7.human_lifecycle.factory;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Random;

/**
 * The static class to generate random values.
 */
public class Factory {
    /**
     * A instance of random.
     */
    private static Random random = new Random();

    /**
     * The array of 30 popular women's names.
     */
    private static String[] femaleNames = new String[]{
            "Emma", "Olivia", "Ava", "Isabella", "Sophia", "Charlotte", "Mia", "Amelia", "Harper", "Evelyn",
            "Abigail", "Emily", "Elizabeth", "Mila", "Ella", "Avery", "Sofia", "Camila", "Aria", "Scarlett",
            "Victoria", "Madison", "Luna", "Grace", "Chloe", "Penelope", "Layla", "Riley", "Zoey", "Nora"};

    /**
     * The array of 30 popular men's names.
     */
    private static String[] maleNames = new String[]{
            "Liam", "Noah", "William", "James", "Oliver", "Benjamin", "Elijah", "Lucas", "Mason", "Logan",
            "Alexander", "Ethan", "Jacob", "Michael", "Daniel", "Henry", "Jackson", "Sebastian", "Aiden",
            "Matthew", "Samuel", "David", "Joseph", "Carter", "Owen", "Wyatt", "John", "Jack", "Luke", "Jayden"};

    /**
     * The array of 30 popular words.
     */
    private static String[] words = new String[]{
            "Area", "Book", "business", "case", "child", "company", "country", "day", "eye", "fact", "family",
            "government", "group", "hand", "home", "job", "life", "lot", "man", "money", "month", "mother", "Mr",
            "night", "number", "part", "people", "place", "point", "problem", "program", "question", "right", "room",
            "school", "state", "story", "student", "study", "system", "thing", "time", "water", "way", "week", "woman",
            "word", "work", "world", "year"};

    /**
     * Enum with genders to persons
     */
    public enum Gender {
        FEMALE, MALE;
    }

    /**
     * Generate a random int-value within min and max parameters.
     *
     * @param min The min limit of a new value
     * @param max The max limit of a new value
     * @return A random int-value within min and max parameters.
     */
    public static int randomInt(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    /**
     * Generates a random boolean-value
     *
     * @return A random boolean-value.
     */
    public static boolean randomBoolean() {
        return random.nextBoolean();
    }

    /**
     * Generates a random date from 1970
     *
     * @return A random LocalDate
     */
    public static LocalDate getDate() {
        int year = randomInt(1970, LocalDate.now().getYear());
        int dayOfYear = randomInt(1, Year.isLeap(year) ? 366 : 365);
        return LocalDate.ofYearDay(year, dayOfYear);
    }

    /**
     * Generates a random gender from {@link Gender}.
     *
     * @return A random gender.
     */
    public static Gender getGender() {
        return randomBoolean() ? Gender.FEMALE : Gender.MALE;
    }

    /**
     * Generates a random name according to gender from {@link Factory#femaleNames}, {@link Factory#maleNames}
     *
     * @param gender The gender to define name
     * @return The string with a name that is appropriate gender
     */
    public static String getName(Gender gender) {
        switch (gender) {
            case MALE:
                return maleNames[randomInt(0, maleNames.length - 1)];
            case FEMALE:
                return femaleNames[randomInt(0, femaleNames.length - 1)];
            default:
                return "";
        }
    }

    /**
     * Generates random words from {@link Factory#words}
     *
     * @param max The max number of words
     * @return The string with random words
     */
    public static String getSomeWords(int max) {
        int number = randomInt(1, max);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            builder.append(words[randomInt(0, words.length - 1)])
                .append(" ");
        }
        builder.delete(builder.length() - 1, builder.length());
        return builder.toString();
    }

    /**
     * Defines days amount between two dates.
     *
     * @param date1 The date from.
     * @param date2 The date to.
     * @return Amount of days between parameters
     */
    public static int getDaysBetween(LocalDate date1, LocalDate date2) {
        return (int) ChronoUnit.DAYS.between(date1, date2);
    }
}
