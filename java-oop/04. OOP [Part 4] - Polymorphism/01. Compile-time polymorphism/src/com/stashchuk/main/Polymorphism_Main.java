package com.stashchuk.main;

import com.stashchuk.classes.Employee;

public class Polymorphism_Main {
    public static void main(String[] args) {
        Employee employee = new Employee(123, "Darren", 10000);

        System.out.println("Monthly Salary: $" + employee.getSalary());
        System.out.println("Monthly Salary + bonus: $" + employee.getSalary(2000));
    }
}
