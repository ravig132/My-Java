package com.challenge89;

public class Concatenate {
    public static  void main (String[] args){
        System.out.println (concatenateString("Ravi ","is ","a ","Good ","Boy"));


    }
    public static String concatenateString (String...a){
        // Its My Code true but unprofessional

//        String concatenate = "" ;
//        for (String i : a) {
//            concatenate += i;
//        }
//        return concatenate ;
        StringBuilder sb = new StringBuilder();
        for (String str : a){
            sb.append(str).append(" ");
        }
        return sb.toString() ;
    }


}
