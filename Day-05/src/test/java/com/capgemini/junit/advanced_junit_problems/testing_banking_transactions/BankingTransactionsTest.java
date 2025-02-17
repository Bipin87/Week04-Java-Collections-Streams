package com.capgemini.junit.advanced_junit_problems.testing_banking_transactions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankingTransactionsTest {
    @Test
    void testDeposit() {
        BankingTransactions account = new BankingTransactions(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
        System.out.println("Test1 Passed");
    }

    @Test
    void testWithdrawSuccessful() {
        BankingTransactions account = new BankingTransactions(200);
        assertTrue(account.withdraw(50));
        assertEquals(150, account.getBalance());
        System.out.println("Test2 Passed");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankingTransactions account = new BankingTransactions(100);
        assertFalse(account.withdraw(200));
        assertEquals(100, account.getBalance());
        System.out.println("Test3 Passed");
    }

    @Test
    void testNegativeDeposit() {
        BankingTransactions account = new BankingTransactions(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-50));
        assertEquals("Deposit amount must be positive.", exception.getMessage());
        System.out.println("Test4 Passed");
    }

    @Test
    void testNegativeWithdrawal() {
        BankingTransactions account = new BankingTransactions(100);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(-30));
        assertEquals("Withdrawal amount must be positive.", exception.getMessage());
        System.out.println("Test5 Passed");
    }

    @Test
    void testInitialNegativeBalance() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new BankingTransactions(-50));
        assertEquals("Initial balance cannot be negative.", exception.getMessage());
        System.out.println("Test6 Passed");
    }

}