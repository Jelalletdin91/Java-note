package com.stashchuk.classes;

public class Student extends Person {
    private long id;
    private String email;
    private double cgpa;

    public Student(String name, int age, String gender, long id, String email, double cgpa) {
        setName(name);
        setAge(age);
        setGender(gender);

        this.id = id;
        this.email = email;
        this.cgpa = cgpa;
    }

    @Override
    public void printInfo() {
        System.out.println("Id: " + this.id);

        super.printInfo(); // call printInfo method in the parent class

        System.out.println("Email: " + this.email);
        System.out.println("CGPA: " + this.cgpa);
    }
}
