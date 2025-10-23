package com.stashchuk.main;

import com.stashchuk.abstractclasses.ImportedMobile;
import com.stashchuk.abstractclasses.LocallyManufacturedMobile;
import com.stashchuk.concreteclasses.IPhone;
import com.stashchuk.concreteclasses.SamsungPhone;
import com.stashchuk.concreteclasses.Zyrex;

public class MobilePhonesApp_Main {
    public static void main(String[] args) {
        // samsung phone
        ImportedMobile samsungNote20 = new SamsungPhone();
        samsungNote20.setModel("Note 20");
        samsungNote20.setRam(12);
        samsungNote20.setProcessor("Snapdragon 855");
        samsungNote20.setStorage(128);
        samsungNote20.setPrice(1100);
        samsungNote20.setImportDuty(15);


        // iphone
        ImportedMobile iphone = new IPhone();
        iphone.setModel("IPhone 12");
        iphone.setRam(4);
        iphone.setProcessor("A13 Bionic");
        iphone.setStorage(128);
        iphone.setPrice(1200);
        iphone.setImportDuty(12.5);


        // zyrex mobile
        LocallyManufacturedMobile zyrexMobile = new Zyrex();
        zyrexMobile.setModel("ZA987");
        zyrexMobile.setRam(4);
        zyrexMobile.setProcessor("755 Snapdragon");
        zyrexMobile.setStorage(64);
        zyrexMobile.setPrice(650);


        System.out.println("Samsung Note 20: $" + samsungNote20.calculatePrice());
        System.out.println("Apple Iphone 12: $" + iphone.calculatePrice());
        System.out.println("Zyrex ZA987: $" + zyrexMobile.calculatePrice());

        System.out.println(); // empty line

        System.out.println(samsungNote20);
        System.out.println(iphone);
        System.out.println(zyrexMobile);
    }
}
