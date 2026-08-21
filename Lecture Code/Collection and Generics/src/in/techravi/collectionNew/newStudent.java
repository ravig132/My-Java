package in.techravi.collectionNew;

public class newStudent implements Comparable<newStudent>{
    private int age ;
    private String name ;
    private int weight ;


    public newStudent(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("newStudent{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public int compareTo(newStudent that) {
        //this method is called for current object
        if (this.age == that.age){
            return  this.name.compareTo(that.name);
        }
        return this.age - that.age ;
    }
}
