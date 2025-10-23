public class BankAccount_ConstrOver_Main {
    public static void main(String[] args) {

        // call no-argument constructor
        BankAccount_ConstrOver aliceAccount = new BankAccount_ConstrOver();
        aliceAccount.setAccountTitle("Alice Helen"); // set account title using a setter method

        // call parameterized constructor
        BankAccount_ConstrOver bogdanAccount = new BankAccount_ConstrOver("Bogdan", 10000);

        aliceAccount.printAccountDetails();
        bogdanAccount.printAccountDetails();
    }
}
