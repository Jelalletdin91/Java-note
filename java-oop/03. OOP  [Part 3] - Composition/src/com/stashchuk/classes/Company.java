package com.stashchuk.classes;

import java.time.LocalDate;

public class Company {
    private String name;
    private String website;
    private Address address;
    private LocalDate establishedIn;
    private Department[] departments;
    private int index = 0;   // position to add the new department in the "departments" array
    private int totalDepartments;

    public Company(String name, String website, int totalDepartments) {
        this.name = name;
        this.website = website;
        this.totalDepartments = totalDepartments;
    }

    public void addDepartment(Department department) {
        if (this.departments == null) {
            this.departments = new Department[this.totalDepartments];
        }

        if (department != null) {
            this.departments[index] = department;
            index++;
        }
    }

    @Override
    public String toString() {
        String companyString = "";

        companyString += "====================\n";
        companyString += "\tCompany\n";
        companyString += "====================\n";
        companyString += "name = " + name;
        companyString += "\nwebsite = " + website;
        companyString += address.toString();
        companyString += "\nestablishedIn = " + establishedIn;
        companyString += "\ntotalDepartments = " + totalDepartments;

        for (int i = 0; i < index; i++) {
            companyString += this.departments[i].toString();
        }

        return companyString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDate getEstablishedIn() {
        return establishedIn;
    }

    public void setEstablishedIn(LocalDate establishedIn) {
        this.establishedIn = establishedIn;
    }

    // no setter for "departments" because we want
    // to allow adding a new department only using the
    // "addDepartment" method
    public Department[] getDepartments() {
        return departments;
    }

    public int getTotalDepartments() {
        return totalDepartments;
    }

    public void setTotalDepartments(int totalDepartments) {
        this.totalDepartments = totalDepartments;
    }
}
