package lab4;

public class Rectangle extends Shape {
    private double width=1.0,length=1.0;
    public Rectangle() {
        width=1.0;length=1.0;
    }
    public Rectangle(double width,double length){
        this.length=length; this.width=width;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        this.length=length;
        this.width=width;
        super.setColor(color);
        super.setFilled(filled);
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*width+2*length;
    }
    @Override
    public String toString(){
        return "A rectangle with width "+width+" length "+length+" which is a sublcass of "+super.toString();
    }
}

