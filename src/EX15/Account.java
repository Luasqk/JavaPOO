package EX15;

public interface Account {
    public void deposit(double amount);
    public void withdraw(double amount);;
    public double calculateInterest(double amount, int months);
    public void viewBalances();
}
