public class PC46palindromeArray {
    public static void main(String []  args){
        System.out.println("WELCOME TO THE PALINDROME ARRAY CHECKER");
        int[] array = arrayUtility.inputArray();
        int size = array.length;
        int[] newArr = PC45reverseArray.reverseArray(array,size);
        boolean isPalindrome = palindrome(array,newArr);
        if (isPalindrome){
            System.out.println("Array is Palindrome");
        }else{
            System.out.println("Array is not Palindrome");
        }
    }
    public static boolean palindrome (int[] array, int[] newArr ){
        int i = 0 , j=0 ;
        while (i< newArr.length){
            if (array[i] != newArr[j]){
                return false ;
            }
            j++;
            i++;
        }
        return true ;
    }
}
