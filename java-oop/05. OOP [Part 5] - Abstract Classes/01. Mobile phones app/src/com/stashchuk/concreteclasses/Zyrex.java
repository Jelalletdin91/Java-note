package com.stashchuk.concreteclasses;

import com.stashchuk.abstractclasses.LocallyManufacturedMobile;

public class Zyrex extends LocallyManufacturedMobile {

    public Zyrex() {
        this.setCompany("Zyrex");
    }

    public Zyrex(String model, int ram, String processor, int storage, double price) {
        super(model, "Zyrex", ram, processor, storage, price);
    }

}
