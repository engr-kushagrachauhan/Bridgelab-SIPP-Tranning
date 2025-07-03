package Java_Encapsulation_Polymorphism_Interface_AbstractClass;

import java.util.*;
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public abstract double calculateInterest();
    public void displayInfo() {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName + ", Balance: ₹" + balance);
    }
}
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04; // 4%
    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
    public void applyForLoan(double amount) {
        System.out.println("Loan Application Submitted for ₹" + amount);
    }
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}
class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.01; // 1%
    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    public double calculateInterest() {
        return getBalance() * interestRate;
    }
    public void applyForLoan(double amount) {
        System.out.println("Business Loan Application Submitted for ₹" + amount);
    }
    public boolean calculateLoanEligibility() {
        return getBalance() >= 25000;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        BankAccount sa = new SavingsAccount("SA1001", "Riya Sharma", 12000);
        BankAccount ca = new CurrentAccount("CA2001", "Vikas Mehta", 50000);
        accounts.add(sa);
        accounts.add(ca);
        for (BankAccount acc : accounts) {
            acc.displayInfo();
            System.out.println("Interest: ₹" + acc.calculateInterest());
            if (acc instanceof Loanable) {
                Loanable l = (Loanable) acc;
                l.applyForLoan(30000);
                System.out.println("Eligible for Loan: " + l.calculateLoanEligibility());
            }
            System.out.println("------------------------");
        }
    }
}
