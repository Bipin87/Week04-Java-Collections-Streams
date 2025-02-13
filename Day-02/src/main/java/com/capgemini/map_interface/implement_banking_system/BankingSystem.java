package com.capgemini.map_interface.implement_banking_system;

import java.util.*;

public class BankingSystem {
    private Map<String, Double> accounts = new HashMap<>();
    private TreeMap<Double, String> sortedAccounts = new TreeMap<>();
    private Queue<String> withdrawalQueue = new LinkedList<>();

    // Method to add a new account
    public void addAccount(String accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    // Method to deposit money into an account
    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double newBalance = accounts.get(accountNumber) + amount;
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber);
        }
    }

    // Method to request a withdrawal
    public void requestWithdrawal(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
        }
    }

    // Process the next withdrawal request
    public void processWithdrawal(double amount) {
        if (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            if (accounts.get(accountNumber) >= amount) {
                double newBalance = accounts.get(accountNumber) - amount;
                accounts.put(accountNumber, newBalance);
                sortedAccounts.put(newBalance, accountNumber);
                System.out.println("Withdrawal of " + amount + " from " + accountNumber + " processed.");
            } else {
                System.out.println("Insufficient balance for " + accountNumber);
            }
        }
    }

    // Retrieve all accounts and their balances
    public Map<String, Double> getAccounts() {
        return accounts;
    }

    // Retrieve accounts sorted by balance
    public Map<Double, String> getSortedAccounts() {
        return sortedAccounts;
    }

}
