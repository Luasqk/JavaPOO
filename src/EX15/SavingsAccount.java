package EX15;

public class SavingsAccount implements Account{
    protected double balance;
    private final double interest;

    public SavingsAccount(double interest, double balance) {
        this.interest = interest;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    public double calculateInterest(double amount, int months) {
        return Math.pow(interest + 1,months) * amount;
    }

    public void viewBalances() {
        System.out.println("--- Saving Account ---");
        System.out.println("Balance: R$ " + this.balance);
        System.out.println("Interest : "+ this.interest + "\n");

        if (this.balance < 0) {
            System.out.println("Status: You are using your limit!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        return interest;
    }
}
