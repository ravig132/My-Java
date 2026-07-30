package in.techravi.varargs;

public class varArgsPrintMany {
    public static  void main (String [] args ){
        printMany("Ravi ","Is ","A ","Good ","Boy");
    }
    public static void printMany (String... a ){
        for (String s : a) {
            System.out.printf(s);
        }

    }
}
