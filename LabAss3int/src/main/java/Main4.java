// Program 4: Banking system using interfaces

import java.util.ArrayList;
import java.util.List;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    void viewBalance();
}

class SavingsAccount implements Account {
    private double balance;
    private double interestRate = 0.05;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited to Savings: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn from Savings: " + amount);
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void viewBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }

    public void applyInterest() {
        balance += calculateInterest();
        System.out.println("Interest applied. New Balance: " + balance);
    }
}

class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit = 5000;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited to Current: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn from Current: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

    public double calculateInterest() {
        return 0; // No interest for current accounts
    }

    public void viewBalance() {
        System.out.println("Current Account Balance: " + balance);
    }

    public void checkOverdraft() {
        System.out.println("Overdraft limit: " + overdraftLimit);
    }
}

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account added to bank.");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount sAcc = new SavingsAccount();
        CurrentAccount cAcc = new CurrentAccount();

        bank.addAccount(sAcc);
        bank.addAccount(cAcc);

        sAcc.deposit(1000);
        sAcc.applyInterest();
        sAcc.viewBalance();

        cAcc.deposit(2000);
        cAcc.withdraw(2500);
        cAcc.viewBalance();
        cAcc.checkOverdraft();
    }
}
