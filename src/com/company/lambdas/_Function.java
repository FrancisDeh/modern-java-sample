package com.company.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

       int result =  increment.apply(1);
        System.out.println(result);
        result = increment.andThen(multiplyBy10).apply(1);
        System.out.println(result);

        System.out.println(
                addAndMultiplyByANumber.apply(result, 20)
        );
    }

    static Function<Integer, Integer> increment = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> addAndMultiplyByANumber = (initialValue, multiplier) -> (initialValue + 1) * multiplier;
}
