package com.company;

public class AppleColorPrettyPrint implements PrettyPrintPredicate {
    @Override
    public void print(Apple apple) {
        System.out.println(apple.getColor());
    }
}
