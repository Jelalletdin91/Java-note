package com.stashchuk.classes;

public class Bank {
    private String name;
    private String address;

    private String accountNumberPrefix;
    private int nextAccountNumber;

    private BankAccount[] accounts;
    private int index; // current empty slot in the "accounts" array

    public Bank(String name, String accountNumberPrefix) {
        this.name = name;
        this.accountNumberPrefix = accountNumberPrefix;

        nextAccountNumber = 100; // will be incremented when a new account is created

        // Assume that, by default, bank has a capacity of
        // opening 100 bank accounts.
        this.accounts = new BankAccount[100];
    }

    public String generateNewAccountNumber() {
        String newAccountNumber = this.accountNumberPrefix + this.nextAccountNumber;
        this.nextAccountNumber++;

        return newAccountNumber;
    }

    public void deposit(String accountNumber, double amount) {
        this.makeATransaction(accountNumber, amount, true);
    }

    public void withdraw(String accountNumber, double amount) {
        this.makeATransaction(accountNumber, amount, false);
    }

    public void makeATransaction(String accountNumber, double amount, boolean isDeposit) {
        int index = this.findAccount(accountNumber);

        if (index != -1) {
            if (isDeposit) {
                this.accounts[index].deposit(amount);
            } else {
                this.accounts[index].withdraw(amount);
            }
        }
        else {
            System.out.println("Provided account number doesn't exists");
        }
    }

    public void openAccount(BankAccount newAccount) {

        if (index < this.accounts.length) {
            this.accounts[index] = newAccount;
            index++;
            System.out.println("New account opened successfully");
            System.out.println("Bank Account Number is: " + newAccount.getAccountNumber());
        }
        else {
            System.out.println("Bank cannot open more accounts - contact admin to increase the limit");
        }
    }

    public void closeAccount(String accountNumber) {

        int indexOfAccountToClose = this.findAccount(accountNumber);

        if (indexOfAccountToClose != -1) {

            if (this.accounts[indexOfAccountToClose].getBalance() != 0) {
                System.out.println("To close an account, its balance should be $0");
                return;
            }

            for (int i = indexOfAccountToClose; i < this.index; i++) {
                this.accounts[i] = this.accounts[i + 1];
            }

            index--;
            System.out.println("Account closed successfully");
        }
        else {
            System.out.println("Account with the provided account number doesn't exists");
        }
    }

    public void showAllBankAccounts() {
        if (this.index == 0) {
            System.out.println("Currently there are no accounts in the bank.");
            return;
        }

        System.out.println("===================");
        System.out.println("   Bank Accounts");
        System.out.println("===================");

        for (BankAccount account : this.accounts) {
            if (account != null) {
                account.showAccountInfo();
            } else {
                break;
            }
        }
    }

    public void showAccountInfo(String accountNumber) {
        for (BankAccount account : this.accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.showAccountInfo();
                break;
            }
        }
    }

    public int findAccount(String accountNumber) {
        if (this.index == 0) {
            return -2; // -2 indicates that currently there no bank accounts
        }

        int accountIndex = -1;

        for (int i = 0; i < this.index; i++) {
            if (this.accounts[i].getAccountNumber().equals(accountNumber)) {
                accountIndex = i;
                break;
            }
        }

        return accountIndex;
    }

    public void showBankInfo() {
        System.out.println("================");
        System.out.println("Bank Information");
        System.out.println("================");

        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Total Accounts: " + this.index);
    }

    public void depositAnnualProfitInSavingsAccounts() {
        if (index <= 0) {
            System.out.println("Currently there are no accounts in the bank");
            return;
        }

        BankAccount account;
        SavingAccount savingAccount;

        for (int i = 0; i <= index; i++) {
            account = this.accounts[i];

            if (account instanceof SavingAccount) {
                savingAccount = (SavingAccount) account;
                savingAccount.depositAnnualProfit();
            }
        }

        System.out.println("Annual profit deposited in all savings accounts");
    }

    public int totalOpenedAccounts() {
        return this.index;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
