package com.capgemini.exception_handling.multiple_catch_blocks;

public class MultipleCatchBlocks {
    public static String multipleCatch(int[] array,int index){
        try {
            if(index < array.length){
                return ("Value at index X: " + array[index]);
            }
            else {
                int num=array[index]; // This will throw ArrayIndexOutOfBoundsException
            }
            int len = array.length;// This will throw NullPointerException
        } catch (ArrayIndexOutOfBoundsException e) {
            return ("Invalid index! " + e.getMessage());
        } catch (NullPointerException e) {
            return ("Array is not initialized! " + e.getMessage());
        }
        return "";
    }


}
