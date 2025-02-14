package com.capgemini.exception_handling.multiple_catch_blocks;

import static com.capgemini.exception_handling.multiple_catch_blocks.MultipleCatchBlocks.multipleCatch;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        int[] nums =null;

        // Call methods and store result
        String result1=multipleCatch(numbers,4);
        String result2=multipleCatch(nums,0);
        String result3=multipleCatch(numbers,1);
        // Display results
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);



    }
}
