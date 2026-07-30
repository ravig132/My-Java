package com.challenge92;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class swapping {
    public static  void main (String [] args ) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(0);
        list.add(2);
        list.add(6);
        System.out.println(list);
        swap(list,2,4);
        System.out.println(list);



    }

    public static  void swap (List<Integer> list ,int x , int y){
        int z = list.get(x);
        list.set(x , list.get(y)) ;
        list.set(y , z) ;
    }
}
