package com.capgemini.exception_handling.nested_try_catch_blocks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.capgemini.exception_handling.nested_try_catch_blocks.NestedTryCatchBlock.divideElementOnIndex;

public class Main {
    public static void main(String[] args) {
        //Use try and catch to handle exception which may come during the execution
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){

            //Get user inputs
            System.out.print("Enter size of your array: ");
            int size = Integer.parseInt(bufferedReader.readLine());
            int[] arr = new int[size];
            try {
                System.out.println("Enter array elements: ");
                for(int i = 0; i < size; i++){
                    arr[i] = Integer.parseInt(bufferedReader.readLine());
                }
            }catch (NumberFormatException e){
                System.out.println("Exception caught NumberFormatException "+ e.getMessage());
            }
            System.out.print("Enter divisor: ");
            int divisor = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Enter index: ");
            int index = Integer.parseInt(bufferedReader.readLine());

            divideElementOnIndex(arr,divisor,index);

            //Call the method and print result
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index!");
        }catch(ArithmeticException e){ //Catch illegal argument exception
            System.out.println("Cannot divide by zero!");
        }catch (IOException e){ //Catch IO exception
            System.out.println("Exception Caught "+ e.getMessage());
        }
    }
}
