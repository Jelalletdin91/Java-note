package com.stashchuk.classes;

public class SavingAccount extends BankAccount {
    public static final double ANNUAL_INTEREST_RATE = 3.2; // percentage
    private static final String ACCOUNT_TYPE = "Savings";

    public SavingAccount(BankAccountOwner accountOwner, String accountNumber, double balance) {
        super(accountOwner, accountNumber, SavingAccount.ACCOUNT_TYPE, balance);
    }

    public SavingAccount(BankAccountOwner accountOwner, String accountNumber) {
        super(accountOwner, accountNumber, SavingAccount.ACCOUNT_TYPE);
    }

    public void depositAnnualProfit() {
        double totalAmountToAdd = (this.getBalance() * SavingAccount.ANNUAL_INTEREST_RATE) / 100;
        double newBalance = this.getBalance() + totalAmountToAdd;
        this.setBalance(newBalance);

        System.out.println("==================");
        System.out.println("Account No.: " + this.getAccountNumber());
        System.out.println("Balance before profit: $" + (newBalance - totalAmountToAdd));
        System.out.println("Amount added: $" + totalAmountToAdd);
        System.out.println("Current balance: $" + newBalance);
        System.out.println("==================");
    }

    @Override
    public void withdraw(double amount) {
        double balance = this.getBalance();

        if (amount > balance) {
            System.out.println("Withdraw Failed - not enough balance");
        } else {
            balance -= amount;
            this.setBalance(balance);

            System.out.println("Withdraw Successful");
            System.out.println("Amount withdrawn: $" + amount);
            System.out.println("Current balance: $" + balance);
        }
    }

    @Override
    public void showAccountInfo() {
        super.showAccountInfo();
        System.out.println("Annual Interest Rate: " + SavingAccount.ANNUAL_INTEREST_RATE + "%");
    }
}
