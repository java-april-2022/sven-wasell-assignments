public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.deposit(2500.50, "checking");
        acc1.deposit(1000, "savings");
        acc1.AccountBalance();
        System.out.println("---------------------");

        BankAccount acc2 = new BankAccount();
        acc2.deposit(500, "checking");
        acc2.withdraw(450, "checking");
        acc2.withdraw(200, "savings");
        acc2.AccountBalance();
    }
}
