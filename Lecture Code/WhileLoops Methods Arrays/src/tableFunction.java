public class tableFunction {
    public static void main(String[] args) {
     table(2);
    }

    public static void table(int num){
        for (int i = 1; i<=10; i++){
            System.out.printf("%d * %d = %d\n",num,i,num*i);
        }
    }
}
