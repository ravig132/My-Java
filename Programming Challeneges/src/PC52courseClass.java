import java.util.Objects;

public class PC52courseClass {
    String courseName ;
    int enrollment;

    PC52courseClass(String courseName){
        this.courseName = courseName ;
    }

    static int maxCapacity ;

    String[] enrolledStudents = new String[maxCapacity];

    static void setMaxCapacity(int capacity){
        maxCapacity = capacity;
    }

    public void enrollStudent (String studentName){
        enrolledStudents[enrollment] = studentName ;
        enrollment ++ ;
    }

    public void unEnrollStudent (String[] enrolledStudents , String studentName ){
        int newSize = enrolledStudents.length ;
        String[] unEnrollStudent = new String[newSize];
        int i = 0 , j = 0 ;
        while (i< unEnrollStudent.length){
            while (j < i){
                if (!Objects.equals(enrolledStudents[i], studentName)){
                    unEnrollStudent [j] = enrolledStudents[i] ;
                    j++;
                }
            }
            i++ ;
        }
        System.out.println("Student has been removed successfully");
    }

    public static void main (String [] args){
        PC52courseClass course = new PC52courseClass("BBA");
        setMaxCapacity(5);
        course.enrollStudent("Ravi");
        course.unEnrollStudent(course.enrolledStudents, "Ravi" );
    }

}
