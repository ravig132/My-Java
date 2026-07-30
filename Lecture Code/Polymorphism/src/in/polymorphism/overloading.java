package in.polymorphism;

public class overloading {
    overloading() {
        System.out.println("Default Constructor called !");
    }
    overloading(String pop ){
        System.out.println(pop);
    }

    public int add (int a  , int b) {
        return a + b ;
    }

    public int add (int a , int b , int c , int d){
        return a+b+c+d ;
    }

    public String add (String a , String b){
        return a+b ;
    }

    public static void main (String [] args ){
        overloading Overloading = new overloading("") ;
        System.out.printf(Overloading .add(4,5) + "\n"+
        Overloading .add("Ravi ","Gangwar"));
    }
}
