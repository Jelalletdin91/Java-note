package com.stashchuk.menu;

public class BankAppMenu {
    public static void showMainMenu(String bankName) {
        System.out.println("=============================");
        System.out.println("   Welcome to " + bankName);
        System.out.println("=============================");

        System.out.println("1. Open a new account");
        System.out.println("2. Show all bank accounts");
        System.out.println("3. Close bank account");
        System.out.println("4. Show account information");
        System.out.println("5. Make a deposit");
        System.out.println("6. Make a withdrawal");
        System.out.println("7. Show bank information");
        System.out.println("8. Deposit annual profit in savings accounts");
        System.out.println("9. Quit");

        System.out.print("Option: ");
    }

    public static void showOpenNewAccountMenu() {
        System.out.println("Opening new Account");
        System.out.println("===================");
        System.out.println("What type of account would you like to open? (choose one of the following)");
        System.out.println("1. Current Account");
        System.out.println("2. Checking Account");
        System.out.println("3. Savings Account");

        System.out.print("Option: ");
    }
}
