package com.challenge90.customComparator;

import java.sql.Array;
import java.util.*;

//use of custom comparator
public class comparator {
    public static  void main ( String [] args ) {
        List<String> list = new ArrayList<>();
        list.add("Bear");
        list.add("Lion");
        list.add("Ant");
        list.add("Monkey");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);


    }
    public static  void sortInDescending (List<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)){
                    return 0 ;
                } else if (o1.charAt(0)<o2.charAt(0)) {
                    return 1 ;
                }else {
                return -1 ;
                }

            }
        });

    }
}
