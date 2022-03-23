package lab5;

public class Rectangle1 extends Shape1 {
    protected double width=1.0,length=1.0;

    public Rectangle1() {
        super();
        width=1.0;
        length=1.0;
    }
    public Rectangle1(double width,double length){
        super();
        this.length=length;
        this.width=width;
    }
    public Rectangle1(double width,double length,String color,boolean filled){
        super();
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
    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }
    @Override
    public String toString(){
        return "A rectangle with width "+width+" length "+length+" which is a sublcass of "+super.toString();
    }
}



