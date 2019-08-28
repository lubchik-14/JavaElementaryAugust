package com.hillel.lessons.lesson1;

import java.time.Year;
import java.util.Arrays;

public class lesson1 {

    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
        printFormattedArray(new double[]{55.55555, 3.1415179, -0.592552});
        sumIntegers(1234);
        System.out.println(divisibleByThree("-99999999999999999999999999999999999999999999999999999999999999" +
                "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999" +
                "99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"));
        System.out.println();
        System.out.println(formatDuration(36661));
    }

    private static void example1() {
        System.out.println("Example 1");
        int a = 100;
        int b = 20;
        System.out.println((a < b) ? a : b);
        System.out.println();
    }

    private static void example2() {
        System.out.println("Example 2");
        int year = 2001;
        int century;
        century = year / 100;
        if (year % 100 >= 1) {
            century++;
        }
        System.out.println(year + " - " + century + "th century");
        System.out.println();
    }

    private static void example3() {
        System.out.println("Example 3");
        int year = 2020;
        if (Year.isLeap(year)) {
            System.out.println(year + " is leap");
        } else {
            System.out.println(year + " isn't leap ");
        }
        System.out.println();
    }

    private static void example4() {
        System.out.println("Example 4");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    private static void printFormattedArray(double[] array) {
        System.out.println("Example 5");
        System.out.print("[");
        for (double i : array) {
            System.out.printf("%.2f; ", i);
        }
        System.out.println("\b\b]");
        System.out.println();
    }

    private static void sumIntegers(int number) {
        System.out.println("Example 6");
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println(sum);
        System.out.println();
    }

    private static boolean divisibleByThree(String number) {
        System.out.println("By 3, or not by 3?");
        System.out.println(number);
        char[] chars = number.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 48 && chars[i] > 57) {
                continue;
            }
            sum += chars[i] - 48;
        }
        return sum % 3 == 0;
    }

    private static String formatDuration(int seconds) {
        System.out.println("Human readable duration format");
        if (seconds < 0) {
            return "Only positive arguments";
        }
        if (seconds == 0) {
            return "now";
        }

        StringBuilder builder = new StringBuilder();
        int duration;

        duration = seconds / 31536000;
        if (duration > 0) {
            builder.append(duration);
            builder.append(duration == 1 ? " year, " : " years, ");
            seconds = seconds % 31536000;
        }
        duration = (seconds / (86400 * 30));
        if (duration > 0) {
            builder.append(duration);
            builder.append(duration == 1 ? " month, " : " months, ");
            seconds = seconds % (86400 * 30);
        }
        duration = seconds / 86400;
        if (duration > 0) {
            builder.append(duration);
            builder.append(duration == 1 ? " day, " : " days, ");
            seconds = seconds % 86400;
        }
        duration = seconds / 3600;
        if (duration > 0) {
            builder.append(duration);
            builder.append(duration == 1 ? " hour, " : " hours, ");
            seconds = seconds % 3600;
        }
        duration = seconds / 60;
        if (duration > 0) {
            builder.append(duration);
            builder.append(duration == 1 ? " minute, " : " minutes, ");
            seconds = seconds % 60;
        }
        if (seconds > 0) {
            builder.append(seconds);
            builder.append(seconds == 1 ? " second, " : " seconds, ");
        }
        builder.delete(builder.length() - 2, builder.length());
        String result = builder.toString();

        if (result.lastIndexOf(",") == -1) {
            return result;
        }

        return result.substring(0, builder.lastIndexOf(",")) + " and"
                + result.substring(builder.lastIndexOf(",") + 1);
    }
}
