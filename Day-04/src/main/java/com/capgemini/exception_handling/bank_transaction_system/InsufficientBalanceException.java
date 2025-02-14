package com.capgemini.exception_handling.bank_transaction_system;

public class InsufficientBalanceException extends Exception{
    // Default constructor
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
