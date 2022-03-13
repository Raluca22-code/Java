package lab4;

class Cylinder extends Circle{
    private double height=1.0;
    Cylinder(){
        super();
    }
    Cylinder(double radius){
        super(radius);

    }
    Cylinder(double radius,double height){
        super(radius); this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getRadius()*getRadius()*height*Math.PI;
    }
    @Override
    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }
}
