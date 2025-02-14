package com.capgemini.exception_handling.nested_try_catch_blocks;

public class NestedTryCatchBlock {
    // Method to divide array index element to divisor
    public static int divideElementOnIndex(int[] arr, int divisor, int index) throws ArrayIndexOutOfBoundsException{
        if(index > (arr.length - 1)){
            throw new ArrayIndexOutOfBoundsException();
        }
        try{
            int ans = arr[index] / divisor;
            System.out.println("Your answer is: "+ ans);
            return ans;
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }
    }
}
