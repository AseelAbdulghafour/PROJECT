import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private int accountNumber;
    private double balance;

    private List<String> transactionHistory;

    public BankAccount(int accountNumber, double balance, List<String> transactionHistory) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionHistory = transactionHistory;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    // public void deposit(double amount) {
    // balance += amount;
    // transactionHistory.add(new Transaction(new Date(), "Deposit", amount));
    // }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposit:+" + amount);

        } else {
            System.out.println("Invalid deposit amount");

        }
    }

    public void withdraw(double amount) {
        if (balance > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrawal:-" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getbalance() {
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    // Display transaction details
    // public void displayTransactionHistory() {

    // for (Transaction transaction : transactionHistory) {

    // }
}
