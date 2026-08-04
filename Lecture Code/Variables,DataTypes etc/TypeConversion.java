public class TypeConversion {
    public static void main (String [] args){
        //here the literal is small but data type is big so it can be automatically converted into bigger datatype literal
        //by default
        double d= 45;
        System.out.println(d);
        float a= 56;
        System.out.println(a);


        // here the literal is big but we want to convert it on small data type so we uses explicit conversion
        //if user want

        int c = (int) 4.98;
        //this line means that convert the big data type literal into small datatype literal then execute the code
        // now it will print int type data
        System.out.println(c);


    }

}
