package lab4;

public class Circle3 extends Shape{

    private double radius = 1.0;
    private String color = "red";
    Circle3(){}
    Circle3(double radius){
        this.radius = radius;
    }
    Circle3(double a, String b,boolean filled){
        radius = a;
        color = b;
        super.setFilled(filled);

    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
}
