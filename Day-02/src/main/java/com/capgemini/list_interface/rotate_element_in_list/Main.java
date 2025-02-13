package com.capgemini.list_interface.rotate_element_in_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.capgemini.list_interface.rotate_element_in_list.RotatedList.rotateList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int position = input.nextInt();
        rotateList(list,position);
        System.out.println(list);
    }
}
