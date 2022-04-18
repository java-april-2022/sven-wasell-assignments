public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numOfAccounts = 0;
    private static double totalAmount = 0;

    public BankAccount() {
        BankAccount.numOfAccounts++;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void deposit(double amount, String account) {
        if (account.equals("checking"))
            this.checkingBalance += amount;
        else if (account.equals("savings"))
            this.savingsBalance += amount;
        BankAccount.totalAmount += amount;
    }

    public void withdraw(double amount, String account) {
        if (account.equals("checking")){
            if (this.checkingBalance - amount >= 0){
                this.checkingBalance -= amount;
            }
            else {
                System.out.println("Insufficient Funds. Transaction Failed");
            }
        }
        else if (account.equals("savings")){
            if (this.savingsBalance - amount >= 0){
                this.savingsBalance -= amount;
            }
            else {
                System.out.println("Insufficient Funds. Transaction Failed");
            }
        }
    }

    public void AccountBalance() {
        System.out.println(String.format("Checking: $%.2f, Savings: $%.2f", this.checkingBalance, this.savingsBalance));
    }
}

