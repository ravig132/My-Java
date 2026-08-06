public class test {
    public static void main (String [] args ){
        Student A = new Student(1,18,"Gyan",6,"Ramkali");
        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.nos);
        A.bunk();
        A.sleep();
        A.study();


        Student B = new Student(A);
        System.out.println(B.name);
        System.out.println(B.id);
        System.out.println(B.age);
        System.out.println(B.nos);
        B.bunk();
        B.sleep();
        B.study();


    }
}
