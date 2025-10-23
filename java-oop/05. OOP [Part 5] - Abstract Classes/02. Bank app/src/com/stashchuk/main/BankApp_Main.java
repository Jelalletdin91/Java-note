package com.stashchuk.main;

import com.stashchuk.classes.Bank;
import com.stashchuk.classes.BankAppDriver;

public class BankApp_Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Union Bank", "USN-");
        bank.setAddress("12 Middleton street, Block A, California");

        BankAppDriver app = new BankAppDriver(bank);
        app.showMainMenu();
    }
}
