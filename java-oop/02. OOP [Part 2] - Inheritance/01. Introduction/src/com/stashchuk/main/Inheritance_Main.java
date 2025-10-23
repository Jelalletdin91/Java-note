package com.stashchuk.main;

import com.stashchuk.inheritance.Employee;
import com.stashchuk.inheritance.Student;

public class Inheritance_Main {
    public static void main(String[] args) {
        Student mike = new Student("Mike", 20, "male", 111, "Computer Science", 3.5);

        // print the instance fields defined inside the
        // "Person" class
        System.out.println(mike.getFullName());
        System.out.println(mike.getAge());
        System.out.println(mike.getGender());
        System.out.println(mike.getClass());


        Employee jordan = new Employee("Jordan", 40, "male", "IT", "Software Engineer", 50000, "Acme Inc.");

        // print the instance fields defined inside the
        // "Person" class
        System.out.println(jordan.getFullName());
        System.out.println(jordan.getAge());
        System.out.println(jordan.getGender());
    }
}
