package com.stashchuk.classes;

public class Person {
    private String name;
    private int age;
    private String gender;

    // "super" inside Student class constructor will
    // call this constructor to initialize the
    // "name", "age", and "gender" instance fields
    // in Student objects
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
    }

    /************* Getters and Setters ****************/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
