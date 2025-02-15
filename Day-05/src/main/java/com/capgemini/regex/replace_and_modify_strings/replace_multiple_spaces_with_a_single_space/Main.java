package com.capgemini.regex.replace_and_modify_strings.replace_multiple_spaces_with_a_single_space;

import java.util.Scanner;

import static com.capgemini.regex.replace_and_modify_strings.replace_multiple_spaces_with_a_single_space.ReplaceMultipleToSingleSpace.replacedSpace;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String replacedText=replacedSpace(text);
        System.out.println(replacedText);
    }
}
