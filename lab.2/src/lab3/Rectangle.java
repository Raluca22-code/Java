package lab3;

public class Rectangle {

    int length; //attributes
    int width;

    int area() {
        int a = length * width;
        return a;
    }
    void printValues(){
        System.out.println("The length =" + length + "The width= " + width) ;
    }
    void setValues(int l, int w) {
        length = l;
        width = w;
        //l,w passing parameters
    }

    public static void main(String[] args) {
        Rectangle a; //null
        Rectangle b = new Rectangle(); //default constructor
        b.length = 4;
        b.width = 3;
        b.printValues();
        int area = b.area();
        System.out.println("area = " + area);
        Rectangle c = new Rectangle();
        c.setValues(5,6);
    }
}