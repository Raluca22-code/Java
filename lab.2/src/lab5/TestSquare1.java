package lab5;

import lab4.Square;

public class TestSquare1 {
    public static void main(String[] args){
        Square test1 = new Square(22,"green", true);
        System.out.println("Side: " + test1.getSide());
        System.out.println("Color: " + test1.getColor());
        System.out.println("Color: " + test1);

    }
}

