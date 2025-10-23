public class BankAccount_NoArg_Main {
    public static void main(String[] args) {
        BankAccount_NoArg bankAccount = new BankAccount_NoArg();

        bankAccount.deposit(10000);

        bankAccount.withdraw(5000);
        bankAccount.withdraw(8000);
    }
}
