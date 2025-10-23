package com.stashchuk.classes;

public abstract class BankAccount {
    private BankAccountOwner accountOwner;
    private String accountNumber;
    private double balance;
    private String accountType;

    public BankAccount() {}

    public BankAccount(BankAccountOwner accountOwner, String accountNumber, String accountType, double balance) {
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public BankAccount(BankAccountOwner accountOwner, String accountNumber, String accountType) {
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0;
    }

    public abstract void withdraw(double amount);

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit Failed - deposit amount should be greater than 0");
            return;
        }

        this.balance += amount;
        System.out.println("Deposit Successful");
        System.out.println("Amount added: $" + amount);
        System.out.println("Current balance: $" + this.balance);
    }

    public void showAccountInfo() {
        System.out.println("=====================");
        System.out.println("\t\tAccount");
        System.out.println("=====================");
        this.accountOwner.showInfo();
        System.out.println("Account No.: " + this.accountNumber);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Balance: $" + this.balance);
    }

    public BankAccountOwner getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(BankAccountOwner accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
