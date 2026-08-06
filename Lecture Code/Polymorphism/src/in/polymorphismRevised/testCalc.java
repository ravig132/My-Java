package in.polymorphismRevised;

public class testCalc {
    public static void main (String [] args ){
//        Calculator calc = new Calculator();
//
//        System.out.println(calc.add(2,3));
//        System.out.println(calc.add(3,4,5));
//        System.out.println(calc.add(2.4,5.6));
//        System.out.println(calc.add("Ravi ","Gangwar"));

        Circle circle = new Circle();
        doDrawing(circle);

        rect rectangle = new rect();
        doDrawing(rectangle);

        shape s = new shape();
        doDrawing(s);
    }

    public static void doDrawing(shape s ){
        s.draw();
    }
}
