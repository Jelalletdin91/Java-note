package com.stashchuk.classes;

public class CurrentAccount extends BankAccount {
    private static final String ACCOUNT_TYPE = "Current";
    private static final int NEGATIVE_BALANCE_LIMIT = -2000; // dollars

    public CurrentAccount(BankAccountOwner accountOwner, String accountNumber, double balance) {
        super(accountOwner, accountNumber, CurrentAccount.ACCOUNT_TYPE, balance);
    }

    public CurrentAccount(BankAccountOwner accountOwner, String accountNumber) {
        super(accountOwner, accountNumber, CurrentAccount.ACCOUNT_TYPE);
    }

    @Override
    public void withdraw(double amount) {
        double balance = this.getBalance();

        if ((balance - amount) < CurrentAccount.NEGATIVE_BALANCE_LIMIT) {
            System.out.println("Withdraw Failed - Limit of outstanding amount is: $" + CurrentAccount.NEGATIVE_BALANCE_LIMIT);
        }
        else {
            balance -= amount;
            this.setBalance(balance);

            System.out.println("Withdraw Successful");
            System.out.println("Amount withdrawn: $" + amount);
        }

        System.out.println("Current balance: $" + balance);
    }

    @Override
    public void showAccountInfo() {
        super.showAccountInfo();
        System.out.println("Negative balance limit: $" + CurrentAccount.NEGATIVE_BALANCE_LIMIT);
    }
}
