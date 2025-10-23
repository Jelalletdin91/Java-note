package com.stashchuk.main;

import com.stashchuk.overriding.Employee;
import com.stashchuk.overriding.HourlyEmployee;

public class Overriding_Main {
    public static void main(String[] args) {

        Employee martin = new Employee("Martin", 12, 5000);
        // print the salary of the base "Employee" class object
        System.out.println("Employee (Base) salary: $" + martin.calculateSalary());


        HourlyEmployee tom = new HourlyEmployee("Tom", 90, 160, 20);
        // print the salary of the "HourlyEmployee" class object
        System.out.println("HourlyEmployee (Child) salary: $" + tom.calculateSalary());
    }
}
