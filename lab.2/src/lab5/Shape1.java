package lab5;

abstract class Shape1 {

    protected String color="red";
    protected boolean filled=true;

    public Shape1(){
        color = "green";
        filled = true;
    }
    public Shape1(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public String toString(){
        if(filled==true) {
            return " A shape with color " + color + " and filled ";
        }
        else
            return " A shape with color " + color + " and not filled ";
    }
    abstract double getArea();
    abstract double getPerimeter();
}
