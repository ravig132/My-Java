public class Student {
    // attributes
    public int id ;

    public int age ;

    public String name ;

    public int nos ;

    private String gf;


    public Student(int id , int age ,String name,int nos,String gf  ){
        this.id = id ;
        this.age = age ;
        this.name = name ;
        this.nos = nos ;
        this.gf = gf ;
    }

    // copy constructor

    public Student(Student srcObj){
        this.id = srcObj.id;
        this.age = srcObj.age;
        this.name = srcObj.name;
        this.nos = srcObj.nos;
    }

    //methods and behaviours

    public void study(){
        System.out.println(name+" Studying");
    }

    public void sleep(){
        System.out.println(name+" Sleeping");
    }

    public void bunk(){
        System.out.println(name+" Bunking");
    }

    private void gfChatting(){
        System.out.println(name+" Chatting with "+gf);
    }



}
