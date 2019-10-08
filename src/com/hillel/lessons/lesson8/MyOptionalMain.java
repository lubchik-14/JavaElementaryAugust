package com.hillel.lessons.lesson8;

public class MyOptionalMain {

    public static void main(String[] args) {
        MyOptional<String> myOptional = MyOptional.of("");
        System.out.println(myOptional);
        MyOptional<String> myOptional1 = MyOptional.ofNullable(null);
        System.out.println(myOptional.hashCode());

    }
}
