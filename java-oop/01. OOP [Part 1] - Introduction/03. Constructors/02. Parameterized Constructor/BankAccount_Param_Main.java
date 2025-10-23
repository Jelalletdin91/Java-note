public class BankAccount_Param_Main {
    public static void main(String[] args) {
        BankAccount_Param bankAccount = new BankAccount_Param("Bogdan", 20000);

        bankAccount.deposit(10000);

        bankAccount.withdraw(5000);
        bankAccount.withdraw(8000);

    }
}
