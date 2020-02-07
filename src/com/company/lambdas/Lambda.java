package com.company.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.company.lambdas.Lambda.Gender.*;

public class Lambda {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Mamhud", MALE),
                new Person("Zaphiyatu", FEMALE),
                new Person("Sherifatu", FEMALE),
                new Person("Yaro", MALE)
        );

        List<Person> females = new ArrayList<>();
        females = people.stream().filter(person -> FEMALE.equals(person.gender)).collect(Collectors.toList());

        females.forEach(System.out::println);

    }

    static class Person{
        private String name;
        private Gender gender;


        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }


    }

    enum Gender {
        MALE,
        FEMALE
    }
}
