package EX15;

//4. Write a Java programming to create a banking system with three classes - Bank, Account,
// SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them.
// Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances.
// SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        Bank bank = new Bank();

        SavingsAccount sa = new SavingsAccount(0.005, 1000.0);
        CurrentAccount ca = new CurrentAccount(500.0, 100.0);

        bank.addAccount(sa);
        bank.addAccount(ca);

        sa.viewBalances();
        sa.deposit(500.0);

        System.out.println("Interest earned over the past 12 months based on current balance: " + sa.calculateInterest(1500, 12));
        sa.withdraw(2000.0);
        sa.viewBalances();

        ca.viewBalances();
        System.out.println("Withdrawing $400.00 (Using $300.00 of the overdraft limit)...");
        ca.withdraw(400.0);
        ca.viewBalances();

        double totalInterest = ca.calculateInterest(0, 1);
        System.out.println("Interest to be paid for using the limit (1 month): $ " + totalInterest);

        System.out.println("\n=== Testing polymorphism in the bank system ===\n");

        for (Account acc : bank.accounts) {
            System.out.println("--- Depositing a $50.00 bonus into all accounts ---\n");
            acc.deposit(50.0);
            acc.viewBalances();
        }
    }
}
