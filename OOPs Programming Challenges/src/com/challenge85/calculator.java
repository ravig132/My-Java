package com.challenge85;

public class calculator {


    public int add (int a , int b){
        return a+b;
    }

    public int add (int a , int b ,int c){
        return a+b+c ;
    }

    public double add (double a , double b){
        return a+b ;
    }

    public static void main(String[] args) {
        calculator Calc = new calculator();
        int sumInt = Calc.add(2,5);
        double sumD = Calc.add(2.4,3.6);
        int sumThree = Calc.add(1,5,8);

        System.out.printf("%d \n%f\n%d",sumInt,sumD,sumThree);



    }

}
