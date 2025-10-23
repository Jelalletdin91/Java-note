package com.stashchuk.classes;

public class Student extends Person {
    private long id;
    private String email;

    public Student(String name, int age, long id, String email) {
        super(name, age);
        this.id = id;
        this.email = email;
    }
}
