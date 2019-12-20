package com.lesson11HW;

public class Main {

    public static void main(String[] args) {
        Person[] employees = new Person[100];
        for (int i = 0; i < 100; i++) {
            String gender = PersonGenerator.gender();
            String name = PersonGenerator.name(gender);
            int age = PersonGenerator.age();
            double height = PersonGenerator.height();
            double weight = PersonGenerator.weight(height);
            Person person = new Person(gender, name, age, height, weight);
            employees[i] = person;
            System.out.println(person);
        }
    }


}