package com.hillel.lessons.lesson13.points1_3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lesson13 {
    public static void main(String[] args) {
        // 1
        try (PrintWriter out = new PrintWriter("text.txt", StandardCharsets.UTF_8)) {
            out.println("Hello World");
        } catch (IOException e) {
            System.out.println("Please, try again later");
            e.printStackTrace();
        }

        //2
        Random random = new Random();
        try (PrintWriter out = new PrintWriter(new FileOutputStream("text2.txt"))) {
            for (int i = 0; i <= 1000; i++) {
                out.print(random.nextInt(650 - (-500)) - 500);
                if (i != 1000) {
                    out.print(",");
                }
            }

        } catch (IOException e) {
            System.out.println("Please, try again later");
            e.printStackTrace();
        }

        //3
        List<Integer> list = new ArrayList<>();
        try (Scanner in = new Scanner(new FileInputStream("text2.txt"))) {
            in.useDelimiter(",");
            while (in.hasNextInt()) {
                if (list.size() == 100) break;
                list.add(in.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Problem with file" + e.getCause());
            e.printStackTrace();
        }

        double average =  list.stream()
                .mapToInt(value -> value)
                .filter(value -> value > 0)
                .average().orElse(0.0);
        System.out.printf("The average is %.2f", average);
    }
}
