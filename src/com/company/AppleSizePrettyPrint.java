package com.company;

public class AppleSizePrettyPrint implements PrettyPrintPredicate {
    @Override
    public void print(Apple apple) {
        System.out.println(apple.getSize());
    }
}
