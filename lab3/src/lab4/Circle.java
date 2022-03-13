package lab4;

public class Circle {
    private double radius = 1.0;
    private String color = "red";


    Circle() {

    }
    Circle(double radius) {

    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {

        double pi = 3.14;
        int r = 4;
        double area = pi*(r*r);
        System.out.println("The area is: " + area);
        return 0;
    }
}
