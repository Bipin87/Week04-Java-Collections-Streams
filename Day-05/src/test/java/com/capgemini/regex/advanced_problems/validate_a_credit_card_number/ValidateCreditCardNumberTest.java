package com.capgemini.regex.advanced_problems.validate_a_credit_card_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateCreditCardNumberTest {

    //this test case will pass if we give it a right card number
    @Test
    void isValidTest1(){
        assertTrue(ValidateCreditCardNumber.isVisaCard("4567897654312345"));
        System.out.println("✅ Test1 Passed");
    }

    //this test case will pass if we give it a right card number
    @Test
    void isValidTest2(){
        assertTrue(ValidateCreditCardNumber.isMasterCard("5567897654312345"));
        System.out.println("✅ Test2 Passed");
    }

    //this test case will fail if we give it a wrong card number
    @Test
    void isValidTest3(){
        assertTrue(ValidateCreditCardNumber.isVisaCard("3567897654312345"));
    }

    //this test case will fail if we give it a wrong card number
    @Test
    void isValidTest4(){
        assertTrue(ValidateCreditCardNumber.isMasterCard("4567897654312345"));
    }
}