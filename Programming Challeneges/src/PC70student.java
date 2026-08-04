public class PC70student {
    String Name ;
    int age ;
    int standard ;
    String schoolName  ;

    public PC70student(String name, int age, int standard, String schoolName) {
        Name = name;
        this.age = age;
        this.standard = standard;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name=" + Name +
                ", age=" + age +
                ", standard=" + standard +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
    public static void main (String [] args){
        PC70student Student = new PC70student("Ravi" , 17 ,12,"Little Angels School") ;
        System.out.println(Student);
    }
}
