package com.hillel.lessons.lesson1;

import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;

public class lesson1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Example 1. Max number");
        System.out.print("Please, enter two numbers : ");
        int answer = scanner.nextInt();
        max(answer, scanner.nextInt());
        System.out.println();

        System.out.println("Example 2. Determine century");
        System.out.print("Please, enter a year : ");
        determineCentury(scanner.nextInt());
        System.out.println();

        System.out.println("Example 3. Is leap, or not");
        System.out.print("Please, enter a year : ");
        isLeap(scanner.nextInt());
        System.out.println();

        System.out.println("Example 4. Filling out array");
        fillOutArray();
        System.out.println();

        System.out.println("Example 5. Formatting");
        printFormattedArray(new double[]{55.55555, 3.1415179, -0.592552});
        System.out.println();

        System.out.println("Example 6\nDetermine sum of integers");
        System.out.print("Please, enter a number : ");
        sumIntegers(scanner.nextInt());

        System.out.println("By 3, or not by 3?");
        System.out.print("Please, enter a number to check divisibility by 3: ");
        System.out.println("The answer is : " + divisibleByThree(scanner.next()));
        System.out.println();

        System.out.println("Human readable duration format");
        System.out.print("Please, enter seconds : ");
        System.out.println(formatDuration(scanner.nextInt()));
    }

    private static void max(int a, int b) {
        System.out.println(((a > b) ? a : b) + " is greater");
    }

    private static void determineCentury(int year) {
        int century = year / 100;
        if (year % 100 >= 1) {
            century++;
        }
        System.out.println(year + " - " + century + "th century");
    }

    private static void isLeap(int year) {
        if (Year.isLeap(year)) {
            System.out.println(year + " is leap");
        } else {
            System.out.println(year + " isn't leap ");
        }
    }

    private static void fillOutArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void printFormattedArray(double[] array) {
        System.out.println("The array without any formatting\n\t" + Arrays.toString(array));
        System.out.println("The formatted array");
        System.out.print("\t[");
        for (double i : array) {
            System.out.printf("%.2f; ", i);
        }
        System.out.println("\b\b]");
        System.out.println();
    }

    private static void sumIntegers(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println("Sum is : " + sum);
        System.out.println();
    }

    private static boolean divisibleByThree(String number) {
        char[] chars = number.toCharArray();
        int sum = 0;
        for (char aChar : chars) {
            if (aChar < 48 && aChar > 57) {
                continue;
            }
            sum += aChar - 48;
        }
        return sum % 3 == 0;
    }

    private static String formatDuration(int seconds) {
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
            append(builder, duration, KindOfDuration.YEAR);
            seconds = seconds % 31536000;
        }
        duration = (seconds / (86400 * 30));
        if (duration > 0) {
            append(builder, duration, KindOfDuration.MONTH);
            seconds = seconds % (86400 * 30);
        }
        duration = seconds / 86400;
        if (duration > 0) {
            append(builder, duration, KindOfDuration.DAY);
            seconds = seconds % 86400;
        }
        duration = seconds / 3600;
        if (duration > 0) {
            append(builder, duration, KindOfDuration.HOUR);
            seconds = seconds % 3600;
        }
        duration = seconds / 60;
        if (duration > 0) {
            append(builder, duration, KindOfDuration.MINUTE);
            seconds = seconds % 60;
        }
        if (seconds > 0) {
            append(builder, seconds, KindOfDuration.SECOND);
        }
        builder.delete(builder.length() - 2, builder.length());
        String result = builder.toString();

        if (result.lastIndexOf(",") == -1) {
            return result;
        }

        return result.substring(0, builder.lastIndexOf(",")) + " and"
                + result.substring(builder.lastIndexOf(",") + 1);
    }

    private enum KindOfDuration {
        YEAR, MONTH, DAY, HOUR, MINUTE, SECOND
    }
    private static void append(StringBuilder stringBuilder, int duration, KindOfDuration kindOfDuration) {
        stringBuilder.append(duration);
        stringBuilder.append(duration == 1 ? " " + kindOfDuration.toString().toLowerCase() + ", "
                                            : " " + kindOfDuration.toString().toLowerCase() + "s, ");
    }
}
