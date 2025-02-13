package com.capgemini.list_interface.rotate_element_in_list;

import java.util.List;

public class RotatedList {
    public static <T> void rotateList(List<T> list, int position){

        int count =0;
        position = position%list.size();
        for(int i =0; i<position; i++)
        {
            T temp = list.get(i);
            if(count < position){
                list.remove(temp);
                list.addLast(temp);
                count++;
                i--;


            }
        }
    }
}
