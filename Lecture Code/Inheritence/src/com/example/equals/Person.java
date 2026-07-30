package com.example.equals;

import java.util.Objects;

public class Person {
    private String name ;
    private int age ;
    private String ID ;

    public Person (String name , int age , String ID){
        this.name = name ;
        this.age = age ;
        this.ID = ID;
    }
     public String getName(){
        return name ;
     }

     public void setName(String name ){
        this.name = name ;
     }

     public int getAge(){
        return age ;
     }
     public  void setAge(int age ){
        this.age = age ;
     }
     public String getID(){
        return ID ;
     }
     public void setID(String ID){
        this.ID = ID ;
     }

    @Override
    public String toString() {
        return "Name: "
                + name +" Age: "
                +age+" ID: "+ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(ID, person.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, ID);
    }
}
