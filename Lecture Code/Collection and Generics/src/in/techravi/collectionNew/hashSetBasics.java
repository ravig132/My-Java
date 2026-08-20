package in.techravi.collectionNew;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashSetBasics {
    public static void main (String [] args ){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);


        System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);








        Set<Integer> st = new LinkedHashSet<>();
        st.add(10) ;
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30) ;


        System.out.println(st);


        Set<Integer> st1 = new TreeSet<>();
        st1.add(50);
        st1.add(10) ;
        st1.add(10);
        st1.add(10);
        st1.add(10);
        st1.add(10);
        st1.add(10);
        st1.add(20);
        st1.add(20);
        st1.add(30) ;


        System.out.println(st1);


        Set<Student> set = new HashSet<>();

        Student s1 = new Student(1,"Ravi");
        Student s2 = new Student(1,"Ravi");
        Student s3 = new Student(1,"Ravi");

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);



    }
}
