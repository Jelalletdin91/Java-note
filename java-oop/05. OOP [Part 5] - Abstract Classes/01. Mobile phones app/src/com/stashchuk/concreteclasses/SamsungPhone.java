package com.stashchuk.concreteclasses;

import com.stashchuk.abstractclasses.ImportedMobile;

public class SamsungPhone extends ImportedMobile {

    public SamsungPhone() {
        this.setCompany("Samsung");
    }

    public SamsungPhone(
        String model,
        int ram,
        String processor,
        int storage,
        double price,
        double importDuty
    ) {
        super(model, "Samsung", ram, processor, storage, price, importDuty);
    }

}
