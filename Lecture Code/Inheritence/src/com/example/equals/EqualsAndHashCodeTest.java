package com.example.equals;

public class EqualsAndHashCodeTest {
    public static void main ( String [] args ){
        Person person1 = new Person("Ramesh",28,"ER567") ;
        Person person2 = new Person("Ramesh",28,"ER567") ;
        if (person1.equals(person2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

    }
}
