package lab4;
//the subclass of Rectangle

public class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square(double side){
        super.setWidth(side);
    }
    public Square(double side, String color, boolean filled){
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