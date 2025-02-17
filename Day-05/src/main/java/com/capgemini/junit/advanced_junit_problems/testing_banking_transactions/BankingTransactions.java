package com.capgemini.junit.advanced_junit_problems.testing_banking_transactions;

public class BankingTransactions {
    private double balance;

    // Constructor
    public BankingTransactions(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // Withdraw money
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            return false; // Insufficient funds
        }
        balance -= amount;
        return true;
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }
}
