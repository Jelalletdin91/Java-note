package com.stashchuk.classes;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public double getSalary(double bonus) {
        return this.salary + bonus;
    }
}
