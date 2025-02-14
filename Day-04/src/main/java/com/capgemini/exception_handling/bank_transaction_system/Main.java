package com.capgemini.exception_handling.bank_transaction_system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //Use try and catch to handle exception which may come during the execution
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            BankTransactionSystem bank = new BankTransactionSystem(2300);

            //Get user inputs
            System.out.println("Welcome to Bank System");
            System.out.println("1. Deposit \n2. Withdraw");
            System.out.print("Please write your choice: ");
            String choice = br.readLine().trim();

            if(choice.equalsIgnoreCase("deposit")){
                System.out.print("Enter amount you want to deposit: ");
                double depositAmount = Integer.parseInt(br.readLine().trim());
                //Call  deposit method
                bank.deposit(depositAmount);
            }

            else if(choice.equalsIgnoreCase("withdraw")){
                System.out.print("Enter amount you want to withdraw: ");
                double withdrawAmount = Integer.parseInt(br.readLine().trim());
                //Call withdraw method
                bank.withdraw(withdrawAmount);
            }

            //Catch InsufficientBalanceException
        }catch (InsufficientBalanceException e){
            System.out.println("Insufficient balance!");
        }
        catch(IllegalArgumentException e){ //Catch illegal argument exception
            System.out.println("Invalid amount!");
        }catch (IOException e){ //Catch IO exception
            System.out.println("Exception Caught "+ e.getMessage());
        }
    }
}
