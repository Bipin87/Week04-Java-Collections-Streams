package com.capgemini.exception_handling.bank_transaction_system;


public class BankTransactionSystem {
    //Declare attribute
    private double balance;

    //Parameterized constructor
    public BankTransactionSystem(double balance){
        this.balance = balance;
    }

    // Method to deposit amount
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Your new balance is: "+ balance);
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    // Method to withdraw amount
    public double withdraw(double amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        if(amount < 0){
            throw new IllegalArgumentException("Invalid amount!");
        }
        else
            System.out.println("Withdrawal successful, new balance: "+ (balance - amount));
        return balance-amount;
    }
}
