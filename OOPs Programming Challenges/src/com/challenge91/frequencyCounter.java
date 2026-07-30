package com.challenge91;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class frequencyCounter {
    public static  void main (String [] args ){
        List<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Bobby");
        list.add("Ravi");
        list.add("Barley");
        list.add("Ram");
        int freq = Collections.frequency(list,"Ravi");
        System.out.println(freq);

    }
}
