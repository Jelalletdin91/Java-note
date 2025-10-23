package com.stashchuk.classes;

public class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.5; // percentage
    private static final String ACCOUNT_TYPE = "Checking";

    public CheckingAccount(BankAccountOwner accountOwner, String accountNumber, double balance) {
        super(accountOwner, accountNumber, CheckingAccount.ACCOUNT_TYPE, balance);
    }

    public CheckingAccount(BankAccountOwner accountOwner, String accountNumber) {
        super(accountOwner, accountNumber, CheckingAccount.ACCOUNT_TYPE);
    }

    @Override
    public void withdraw(double amount) {

        if (this.getBalance() <= 0) {
            System.out.println("Cannot withdraw money - this account currently has no balance.");
            return;
        }

        double transactionFee = (amount * CheckingAccount.TRANSACTION_FEE) / 100;
        double totalAmountToDeduct = amount + transactionFee;

        double balance = this.getBalance();

        if (totalAmountToDeduct > balance) {
            System.out.println("Withdraw Failed - not enough balance");
        } else {
            balance -= totalAmountToDeduct;
            this.setBalance(balance);

            System.out.println("Withdraw Successful");
            System.out.println("Amount withdrawn: $" + amount);
            System.out.println("Transaction fee: $" + CheckingAccount.TRANSACTION_FEE);
            System.out.println("Total Amount deducted: $" + totalAmountToDeduct);
            System.out.println("Current balance: $" + balance);
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit Failed - deposit amount should be greater than 0");
            return;
        }

        double transactionFeeAmount = (amount * CheckingAccount.TRANSACTION_FEE) / 100;
        double updatedBalance = (this.getBalance() + amount) - transactionFeeAmount;
        this.setBalance(updatedBalance);

        System.out.println("Deposit Successful");
        System.out.println("Transaction Fee: $" + transactionFeeAmount);
        System.out.println("Amount deposited: $" + updatedBalance);
        System.out.println("Current balance: $" + updatedBalance);
    }

    @Override
    public void showAccountInfo() {
        super.showAccountInfo();
        System.out.println("Transaction Fee: " + CheckingAccount.TRANSACTION_FEE + "%");
    }
}
