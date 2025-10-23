package com.stashchuk.concreteclasses;

import com.stashchuk.abstractclasses.ImportedMobile;

public class IPhone extends ImportedMobile {

    public IPhone() {
        this.setCompany("Apple");
    }

    public IPhone (
        String model,
        int ram,
        String processor,
        int storage,
        double price,
        double importDuty
    ) {
        super(model, "Apple", ram, processor, storage, price, importDuty);
    }
}
