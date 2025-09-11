public class PC75arrayToString {
    public static void main (String [] args){
        String[] arr = new String[]{"Ravi","Is","Good","Boy"};
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
