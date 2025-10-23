package com.stashchuk.classes;

import com.stashchuk.menu.BankAppMenu;

import java.util.Scanner;

public class BankAppDriver {
    private Bank bank;

    public BankAppDriver(Bank bank) {
        this.bank = bank;
    }

    public void showMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        while (shouldContinue) {
            BankAppMenu.showMainMenu(this.bank.getName());

            int selectedOption = scanner.nextInt();

            switch (selectedOption) {
                case 1 -> {
                    BankAccount newAccount = this.createNewAccount();
                    this.bank.openAccount(newAccount);
                }

                case 2 -> this.bank.showAllBankAccounts();
                case 3 -> this.closeAccount();
                case 4 -> this.showAccountInfo();
                case 5 -> this.deposit();
                case 6 -> this.withdraw();
                case 7 -> this.bank.showBankInfo();
                case 8 -> this.bank.depositAnnualProfitInSavingsAccounts();

                case 9 -> {
                    System.out.println("Exiting...");
                    shouldContinue = false;
                }
            }
        }
    }


    /************************************************************
     *                    private methods
     ************************************************************/
    private BankAccount createNewAccount() {
        Scanner scanner = new Scanner(System.in);

        BankAppMenu.showOpenNewAccountMenu();
        int accountType = scanner.nextInt();

        BankAccountOwner accountOwner = this.takeAccountOwnerInfo();
        String newAccountNumber = this.bank.generateNewAccountNumber();

        BankAccount newAccount = null;

        switch (accountType) {
            case 1 -> {
                System.out.println("Opening Current Account...");
                newAccount = new CurrentAccount(accountOwner, newAccountNumber);
            }

            case 2 -> {
                System.out.println("Opening Checking Account...");
                newAccount = new CheckingAccount(accountOwner, newAccountNumber);
            }

            case 3 -> {
                System.out.println("Opening Savings Account...");
                newAccount = new SavingAccount(accountOwner, newAccountNumber);
            }
        }

        return newAccount;
    }

    private BankAccountOwner takeAccountOwnerInfo() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the account owner's full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the account owner's id or Social Security No.: ");
        String id = scanner.nextLine();

        System.out.print("Enter the account owner's email: ");
        String email = scanner.nextLine();

        System.out.print("Enter the account owner's age: ");
        int age = scanner.nextInt();

        // Consume newline character created as a result of
        // pressing the "Enter" key.
        // Not doing this will skip the next input.
        scanner.nextLine();

        System.out.print("Enter the account owner's address: ");
        String address = scanner.nextLine();

        return new BankAccountOwner(id, name, email, age, address);
    }

    private void closeAccount() {
        String accountNumber = this.takeAccountNumber();

        if (!accountNumber.isEmpty()) {
            this.bank.closeAccount(accountNumber);
        }
    }

    private void showAccountInfo() {
        String accountNumber = this.takeAccountNumber();
        this.bank.showAccountInfo(accountNumber);
    }

    private String takeAccountNumber() {
        String accountNumber = "";

        if (this.bank.totalOpenedAccounts() == 0) {
            System.out.println("Currently, there are no opened bank accounts");
        }
        else {
            Scanner scanner = new Scanner(System.in);
            boolean accountExists;

            do {
                System.out.print("Enter account number: ");
                accountNumber = scanner.nextLine();

                int index = this.bank.findAccount(accountNumber);
                accountExists = index != -1;

                if (!accountExists) {
                    System.out.println("Provided account number doesn't exists. Try again.");
                }

            } while (!accountExists);
        }


        return accountNumber;
    }

    private void deposit() {
        this.makeATransaction(true);
    }

    private void withdraw() {
        this.makeATransaction(false);
    }

    private void makeATransaction(boolean isDeposit) {
        String accountNumber = this.takeAccountNumber();

        if (accountNumber.isEmpty()) {
            return;
        }

        String operation = isDeposit ? "deposit" : "withdraw";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to " + operation + " ($): ");
        double amount = scanner.nextDouble();

        if (isDeposit) {
            this.bank.deposit(accountNumber, amount);
        } else {
            this.bank.withdraw(accountNumber, amount);
        }
    }
}
