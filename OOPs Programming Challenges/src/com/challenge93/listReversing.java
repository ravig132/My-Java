package com.challenge93;
import com.challenge92.swapping;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class listReversing {
    public static void main (String [] args ){
        List<Integer> list = Arrays.asList(1,2,3,4,5,7,9,10);
        System.out.println(list);
        reverse(list);
//        Collections.reverse(list);
        System.out.println(list);
    }
    public static  void reverse (List<Integer> list){
        for (int i = 0; i < list.size()/2 ; i++) {
            swapping.swap(list,i,list.size()-1-i);
        }
    }

}
