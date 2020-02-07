package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void prettyPrintApple(List<Apple> inventory, PrettyPrintPredicate p) {
        for (Apple apple : inventory) {
            p.print(apple);
        }
    }

    public static void main(String[] args) {
        // write your code here
        List<Apple> apples = new ArrayList<Apple>();
        apples.add(new Apple("Green", "Sine", 34.0));
        apples.add(new Apple("Blue", "Kiresh", 23));

        //using classes
        prettyPrintApple(apples, new AppleSizePrettyPrint());

        //using anonymous classes
        prettyPrintApple(apples, new PrettyPrintPredicate() {
            public void print(Apple apple) {
                System.out.println(apple.getColor());
            }
        });

        //using lambdas
        prettyPrintApple(apples, (Apple apple) -> System.out.println(apple.getName()));
    }
}
