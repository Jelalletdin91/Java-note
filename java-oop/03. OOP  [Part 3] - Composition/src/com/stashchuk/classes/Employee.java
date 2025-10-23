package com.stashchuk.classes;

public class Employee {
    private int id;
    private String name;
    private int age;
    private Address address;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Employee(int id, String name, int age, Address address) {
        this(id, name, age);
        this.address = address;
    }

    @Override
    public String toString() {
        String employeeString = "";

        employeeString += "\n====================\n";
        employeeString += "\tEmployee\n";
        employeeString += "====================\n";
        employeeString += "id = " + id;
        employeeString += "\nname = " + name;
        employeeString += "\nage = " + age;
        employeeString += "\naddress = " + address + "\n";

        return employeeString;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
