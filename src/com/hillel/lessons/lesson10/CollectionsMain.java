package com.hillel.lessons.lesson10;

import com.hillel.lessons.lesson5.student.Student;

import java.util.*;

public class CollectionsMain {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("C");
        a.add(0, "A");
        a.add("E");
        List<String> b = new LinkedList<>();
        b.add("B");
        b.add("D");
        b.add("F");
        b.add("G");

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();
        System.out.println(a.toString());
        System.out.println(b.toString());

        while (bIter.hasNext()) {
            if (aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }

        System.out.println(a.toString());
        System.out.println(b.toString());

        bIter = b.iterator();
        while (bIter.hasNext()) {
            bIter.next();
            if (bIter.hasNext()) {
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b.toString());

        a.removeAll(b);
        System.out.println(a.toString());
        aIter = a.listIterator(2);
        aIter.next();
        aIter.remove();
        System.out.println(a.toString());
        System.out.println("_____________________________________________");

        Set<String> words = new HashSet<>();
        long totalTime = 0;
        try (Scanner in = new Scanner(System.in))
        {
            while (in.hasNext()) {
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
        }
        Iterator<String> iterator = words.iterator();
        for (int i = 1; i <= 20 && iterator.hasNext() ; i++) {
            System.out.println(iterator.next());
            System.out.println(". . .");
            System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds");
        }

        Map<String, Student> staff = new HashMap<>();
        for (Map.Entry<String, Student> entry : staff.entrySet()) {
            staff.values();
        }

    }
}
