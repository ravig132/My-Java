public class reverseString {
    public static void main (String [] args ){
        String str = "AHANA";

        char[] name = str.toCharArray();

        for (int i = name.length-1;i>=0;i--){
            System.out.print(name[i]);
        }

    }
}
