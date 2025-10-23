package com.stashchuk.abstractclasses;

public abstract class MobilePhone {
    private String model;
    private String company;
    private int ram;          // in GBs
    private String processor;
    private int storage;      // in GBs
    private double price;

    public MobilePhone() {}

    public MobilePhone(String model, String company, int ram, String processor, int storage, double price) {
        this.model = model;
        this.company = company;
        this.ram = ram;
        this.processor = processor;
        this.storage = storage;
        this.price = price;
    }

    // abstract method
    public abstract double calculatePrice();

    @Override
    public String toString() {
        return "MobilePhone{" +
                  "model = " + model +
                  ", company = " + company +
                  ", ram (GB) = " + ram +
                  ", processor = " + processor +
                  ", storage (GB) = " + storage +
                  ", price = $" + this.calculatePrice() +
                "}";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
