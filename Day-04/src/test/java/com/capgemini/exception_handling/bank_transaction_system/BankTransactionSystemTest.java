package com.capgemini.exception_handling.bank_transaction_system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionSystemTest {
    BankTransactionSystem bank = new BankTransactionSystem(500);

    @Test
    void testFirst(){
        assertThrows(InsufficientBalanceException.class, ()-> bank.withdraw(900));
    }

    @Test
    void testSecond(){
        assertThrows(IllegalArgumentException.class, ()-> bank.deposit(-80));

    }


}