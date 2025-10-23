package com.stashchuk.main;

import com.stashchuk.classes.Person;
import com.stashchuk.classes.Student;

public class Instanceof_Main {
    public static void main(String[] args) {
        Person tim = new Person("Tim Larson", 50);
        System.out.println(tim instanceof Person);
        System.out.println(tim instanceof Student);
        System.out.println(tim instanceof Object);

        Student john = new Student("John", 25, 1133, "john@email.com");
        System.out.println(john instanceof Student);
        System.out.println(john instanceof Person);
        System.out.println(john instanceof Object);

        Object a="VARIABLE";
        System.out.println(a);
        System.out.println(a instanceof String);

        Object b=6854.5;
        System.out.println(b);
        System.out.println(b instanceof String);

    }
}
