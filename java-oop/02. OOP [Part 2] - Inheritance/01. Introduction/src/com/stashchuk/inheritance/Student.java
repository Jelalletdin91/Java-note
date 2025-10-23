package com.stashchuk.inheritance;

public class Student extends Person {
    private long id;
    private String degreeProgram;
    private double cgpa;

    public Student() {
        this.id = -1;
        this.degreeProgram = "not-assigned";
        this.cgpa = 0.0;
    }

    public Student(String name, int age, String gender, long id, String degreeProgram, double cgpa) {
        // initialize fields defined in the "Person" class.
        // we use setter methods because "private" instance
        // fields of the parent class are not directly accessible
        // from child classes
        setFullName(name);
        setAge(age);
        setGender(gender);

        // initialize fields specific to Student objects
        this.id = id;
        this.degreeProgram = degreeProgram;
        this.cgpa = cgpa;
    }
}
