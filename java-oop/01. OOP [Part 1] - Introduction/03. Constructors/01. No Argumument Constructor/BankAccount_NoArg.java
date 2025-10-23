public class BankAccount_NoArg {
    private String accountTitle;
    private double balance;

    // no-argument constructor
    public BankAccount_NoArg() {
        accountTitle = "untitled";
        balance = 0;
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
}
