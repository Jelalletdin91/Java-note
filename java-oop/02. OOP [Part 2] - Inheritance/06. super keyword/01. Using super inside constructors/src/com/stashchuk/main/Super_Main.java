package com.stashchuk.main;

import com.stashchuk.classes.Student;

public class Super_Main {
    public static void main(String[] args) {
        Student helena = new Student("Helena", 25, "female", 123, "helena@email.com", 4.0);

        helena.printInfo();
        helena.setAge(55);

        System.out.println(helena.getAge());
    }
}
