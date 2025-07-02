package Java_Inheritance;

class BankAccount {
    String accountNumber;
    double balance;
}

class SavingsAccount extends BankAccount {
    double interestRate;

    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int termYears;

    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount();
        ((SavingsAccount)acc).interestRate = 5.5;
        ((SavingsAccount)acc).displayAccountType();
    }
}