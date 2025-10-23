public class BankAccount_ConstrOver {
    private String accountTitle;
    private double balance;

    // no-argument constructor
    public BankAccount_ConstrOver() {
        accountTitle = "untitled";
        balance = 0;
    }

    // parameterized constructor
    public BankAccount_ConstrOver(String title, double initialBankBalance) {
        accountTitle = title;
        balance = initialBankBalance;
    }


    public void deposit(double amount) {
        balance = balance + amount; // can be written as: balance += amount

        System.out.println("Amount deposited: $" + amount);
        printAvailableBalance();
    }

    public void withdraw(double amount) {
        System.out.println("Withdraw amount: $" + amount);

        if (balance < amount) {
            System.out.println("Error: you do not have sufficient balance in your account");
            return;
        }

        balance = balance - amount; // can be written as: balance -= amount

        System.out.println("Withdraw successful");
        printAvailableBalance();
    }

    private void printAvailableBalance() {
        System.out.println("Available Balance: $" + balance);
    }

    public void printAccountDetails() {
        System.out.println("====================");
        System.out.println("BANK ACCOUNT DETAILS");
        System.out.println("====================");
        System.out.println("Account Title: " + accountTitle);
        System.out.println("Current Balance: " + balance);
        System.out.println("====================\n");
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }
}
