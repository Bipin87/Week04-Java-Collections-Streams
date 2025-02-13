package com.capgemini.list_interface.find_nth_element_from_the_end;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.capgemini.list_interface.find_nth_element_from_the_end.FindElement.findNthElementEnd;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create the object of List interface
        List<String>stringList = new ArrayList<>(Arrays.asList("Aman","Bipin","Vishal","Vipul","Bipin"));

        // User input for specific position
        System.out.println("Please enter the position:");
        int position = input.nextInt();

        // Call the method and store the find value
        String result=findNthElementEnd(stringList,position);

        // Display the result
        System.out.println("End side of n position list element is: " + result);
        input.close();

    }
}
