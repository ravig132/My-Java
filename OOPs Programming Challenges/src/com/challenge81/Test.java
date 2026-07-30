package com.challenge81;

public class Test {
    public static  void main ( String [] args){
        person person1 = new person("Suresh",45);
        person person2 = new person("Suresh",45);

        if (person1.equals(person2)){
            System.out.println("Matched Successfully !");
        }else {
            System.out.println("Not Matched !");
        }
        System.out.println(        person1.hashCode() + " = " + person2.hashCode());
    }
}
