public class Function {
    public static void main(String[] args) {

        Function Greeting = new Function();
        Greeting.Greeting();
        Star1();
    }


    public void Greeting(){
        System.out.println("Good Morning From RK Gangwar ");

    }
    public static void Star1(){
        int rows = 0;
        while (rows<5){
            System.out.print("*");

            int i=0;
                    while(i<rows){
                        System.out.print(" *");
                        i++;
                    }
            System.out.println();
            rows++;
        }
    }
}
