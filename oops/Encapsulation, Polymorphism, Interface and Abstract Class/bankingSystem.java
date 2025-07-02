
import java.util.*;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
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

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    public void applyForLoan(double amount) {
        System.out.println("SavingsAccount Loan Applied: " + amount);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double calculateInterest() {
        return 0;
    }

    public void applyForLoan(double amount) {
        System.out.println("CurrentAccount Loan Applied: " + amount);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() + overdraftLimit > 5000;
    }
}

public class bankingSystem {
    public static void processAccounts(List<BankAccount> accounts) {
        for (BankAccount account : accounts) {
            System.out.println("Account: " + account.getAccountNumber());
            System.out.println("Holder: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loan = (Loanable) account;
                loan.applyForLoan(20000);
                System.out.println("Loan Eligible: " + loan.calculateLoanEligibility());
            }

            System.out.println("-----");
        }
    }

    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SA123", "Harshita", 15000, 0.04));
        accounts.add(new CurrentAccount("CA456", "Ravi", 4000, 2000));

        processAccounts(accounts);
    }
}
