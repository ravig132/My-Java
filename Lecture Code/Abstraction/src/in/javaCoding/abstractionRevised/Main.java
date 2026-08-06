package in.javaCoding.abstractionRevised;
abstract class Bird{
    abstract void fly();
    abstract void eat ();
}

class sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow is flying ");
    }

    @Override
    void eat() {
        System.out.println("Sparrow is eating ");
    }
}

class crow extends Bird {
    @Override
    void fly() {
        System.out.println("crow is flying ");
    }

    @Override
    void eat() {
        System.out.println("crow is eating ");
    }
}


public class Main {

    public static void doBirdStuff(Bird b){
        b.fly();
        b.eat();
    }

    public static void main(String[] args) {
        doBirdStuff(new sparrow());
        doBirdStuff(new crow());

    }
}
