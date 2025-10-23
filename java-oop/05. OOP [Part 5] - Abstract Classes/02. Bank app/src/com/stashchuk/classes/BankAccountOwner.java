package com.stashchuk.classes;

public class BankAccountOwner {
    private String id; // could be social security number or national id card number
    private String fullName;
    private String email;
    private int age;
    private String address;

    public BankAccountOwner(String id, String fullName, String email, int age, String address) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    public void showInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Full Name: " + this.fullName);
        System.out.println("Email: " + this.email);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
