package com.Jelalletdin.demo.entity;

public class Student {
    //Objects/Variables
    private String firstName;
    private String lastName;

    //Constructor
    public Student(){

    }

    public Student (String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    //getters/setters
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

}
