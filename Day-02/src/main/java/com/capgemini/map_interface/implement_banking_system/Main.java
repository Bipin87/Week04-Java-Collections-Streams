package com.capgemini.map_interface.implement_banking_system;

public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Add  accounts
        bank.addAccount("A123", 50000.00);
        bank.addAccount("B456", 24000.00);
        bank.addAccount("C789", 7000.00);

        // Deposit money
        bank.deposit("A123", 2000.00);

        // Request withdrawals
        bank.requestWithdrawal("B456");
        bank.requestWithdrawal("A123");

        // Process withdrawals
        bank.processWithdrawal(1000.00);
        bank.processWithdrawal(500.00);

        // Display account details
        System.out.println("Accounts (HashMap): " + bank.getAccounts());
        System.out.println("Sorted Accounts (TreeMap): " + bank.getSortedAccounts());
    }
}
