package lab3;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    //1st overloaded constructor
    Circle(String type)
    {
       type = color;
    }

    //2nd overloaded constructor
    Circle(double length)
    {
        length = radius;
    }

    //public methods
    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        double pi = 3.14;
        int r = 4;
        double area = pi*(r*r);
        System.out.println("The area is: " + area);
        return 0;
    }
}
