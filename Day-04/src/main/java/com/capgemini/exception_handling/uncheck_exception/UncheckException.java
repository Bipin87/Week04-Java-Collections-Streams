package com.capgemini.exception_handling.uncheck_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            // Inputs from users
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            System.out.println(number1/number2); // if number2 = 0; then Arithmetic Exception occur
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException occured: "+ e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("InputMismatchException occued: "+ e.getMessage());
        }

    }
}
