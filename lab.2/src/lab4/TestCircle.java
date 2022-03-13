package lab4;

public class TestCircle {
    public static void main(String[] args){
        Circle firstRing = new Circle();
             double x,y;
             x  = firstRing.getArea();
             y  = firstRing.getRadius();
        System.out.println("The area is: " + x);
        System.out.println("The radius is: " + y);


        Circle secondRing = new Circle(2.3);
             double a,b;
             a = secondRing.getArea();
             b = secondRing.getRadius();
        System.out.println("The area is: " + a);
        System.out.println("The radius is: " + b);


        firstRing.getArea();
        secondRing.getRadius();

    }
}
