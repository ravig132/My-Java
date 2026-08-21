package in.techravi.collectionNew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<newStudent> students = new ArrayList<>();

        students.add(new newStudent(19,"Louis",45));
        students.add(new newStudent(21,"Vipul",67));
        students.add(new newStudent(23,"Viru",67));
        students.add(new newStudent(18,"Villu",67));

        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);

    }
}
