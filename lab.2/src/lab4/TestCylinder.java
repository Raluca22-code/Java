package lab4;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(4, 5);
        System.out.println("Height : " + cylinder1.getHeight());
        System.out.println("Volume : " + cylinder1.getVolume());
        System.out.println("Area : " + cylinder1.getArea());
        System.out.println("String : " + cylinder1.toString());
    }
}