package com.stashchuk.abstractclasses;

public abstract class LocallyManufacturedMobile extends MobilePhone {

    public LocallyManufacturedMobile() {}

    public LocallyManufacturedMobile(
        String model,
        String company,
        int ram,
        String processor,
        int storage,
        double price
    ) {
        super(model, company, ram, processor, storage, price);
    }

    @Override
    public double calculatePrice() {
        return this.getPrice();
    }
}
