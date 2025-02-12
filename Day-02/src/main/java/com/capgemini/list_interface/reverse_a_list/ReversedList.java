package com.capgemini.list_interface.reverse_a_list;


import java.util.List;

public class ReversedList<T> {

    // Method to reverse a ArrayList
    public static<T> void reversedArrayList(List<T> list){
        int left =0;
        int right = list.size()-1;
        for(int i = 0; i<right; i++){
            if(left < right){
                // Swap the ArrayList elements
                T temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right,temp);
                left++;
                right--;
            }
        }
    }

    // Method to reverse a LinkedList
    public static <T> void reversedLinkedList(List<T> list){
        int left =0;
        int right = list.size()-1;
        for(int i=0; i<right; i++){
            if(left < right){
                // Swap the ArrayList elements
                T temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right,temp);
                left++;
                right--;
            }
        }

    }

}
