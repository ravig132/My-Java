package com.challenge82;

import java.util.Scanner;

public class ArrayOperation {
    public static class Statistics{
        Scanner input = new Scanner(System.in);

            public static int[] inputArray(){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the Value of array size : ");
                int size = input.nextInt();
                int[] arr = new int[size];
                int index = 0 ;
                while(index<arr.length){
                    System.out.print("Enter the Value of element "+(index+1)+": ");
                    arr[index] = input.nextInt();
                    index++;
                }
                return arr ;
            }
        public float mean (int[] num , int numOfEle){
            int mean = 0;
            for (int i = 0; i < numOfEle; i++) {
                mean += num[i] ;
            }
           return (float) mean /numOfEle ;
        }

        public int median (int[] num, int numOfEle){
            int median = 0 ;
            if (numOfEle % 2 != 0){
                median = (numOfEle ) / 2  ;
            }else{
                median = (numOfEle+1) / 2 ;
            }
            return num[median] ;
        }


    }
}
