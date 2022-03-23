package lab5;
//the subclass of Rectangle

public class Square1 extends Rectangle1 {
    public Square1() {
        super();
    }
    public Square1(double side){
        super.setWidth(side);
    }
    public Square1(double side, String color, boolean filled){
        super.setWidth(side);
        super.setColor(color);
        super.setFilled(filled);

    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double width){
        super.setWidth(width);
    }
    @Override
    public void setWidth(double width){
        super.setWidth(width);
    }
    @Override
    public void setLength(double length){
        super.setLength(length);
    }
    @Override
    public String toString() {
        return "A square with side:" + getSide() + "which is a subclass of: " + super.toString();
    }
}