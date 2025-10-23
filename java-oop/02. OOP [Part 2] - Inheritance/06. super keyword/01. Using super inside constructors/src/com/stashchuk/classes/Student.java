package com.stashchuk.classes;

public class Student extends Person {
    private long id;
    private String email;
    private double cgpa;

    public Student(String name, int age, String gender, long id, String email, double cgpa) {
        // delegate the responsibility of initializing
        // the instance fields defined in the "Person"
        // class to the parameterized constructor of the
        // "Person" class
        super(name, age, gender);

        this.id = id;
        this.email = email;
        this.cgpa = cgpa;
    }

    @Override
    public void printInfo() {
        System.out.println("Id: " + this.id);

        super.printInfo(); // call the parent class' method

        System.out.println("Email: " + email);
        System.out.println("CGPA: " + this.cgpa);
    }
}
