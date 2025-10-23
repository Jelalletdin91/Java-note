package com.stashchuk.classes;

public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private int zipCode;

    @Override
    public String toString() {
        String addressString = "";

        addressString += "\n====================\n";
        addressString += "\tAddress\n";
        addressString += "====================\n";
        addressString += "street = " + street;
        addressString += "\ncity = " + city;
        addressString += "\nstate = " + state;
        addressString += "\ncountry = " + country;
        addressString += "\nzipCode = " + zipCode;
        addressString += "\n====================";

        return addressString;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
