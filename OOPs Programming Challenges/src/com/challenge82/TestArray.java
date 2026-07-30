package com.challenge82;

public class TestArray {
    public static  void main ( String [] args ){
        ArrayOperation opr = new ArrayOperation();
        ArrayOperation.Statistics statistics = new ArrayOperation.Statistics();
        int[] array = statistics.inputArray();
        int NumOfEl = array.length ;
        System.out.println(statistics.mean(array,NumOfEl));
        System.out.println(statistics.median(array,NumOfEl));
    }
}
