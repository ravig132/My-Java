public class countStringVowels {
    public static void main (String [] args){
        String name = "Ravi Kumar Gangwar";
        int count = 0;
        for (int i =0; i<name.length();i++){
            char ch = name.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        System.out.println("Vowels count is : "+count);

    }
}
