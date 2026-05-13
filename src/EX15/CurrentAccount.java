package EX15;

public class CurrentAccount implements Account {
    private double limit;
    private double balance;

    public CurrentAccount(double limit, double balance) {
        this.limit = limit;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= (this.balance + this.limit)) {
            this.balance -= amount;
        } else {
            System.out.println("Error: Insufficient balance and limit to withdraw R$ " + amount);
        }
    }

    @Override
    public double calculateInterest(double amount, int months) {
        if (this.balance < 0) {
            double totalDebt = Math.abs(this.balance);
            double interestest = 0.1;
            return totalDebt * interestest * months;
        }
        return 0;
    }

    @Override
    public void viewBalances() {
        System.out.println("--- Current Account ---");
        System.out.println("Balance: R$ " + this.balance);
        System.out.println("Limit: R$ " + this.limit);
        System.out.println("Total: R$ " + (this.balance + this.limit) +"\n");

        if (this.balance < 0) {
            System.out.println("Status: You are using your limit!");
        }
    }

    public double getLimit() { return limit; }
    public void setLimit(double limit) { this.limit = limit; }
    public double getBalance() { return balance; }
}