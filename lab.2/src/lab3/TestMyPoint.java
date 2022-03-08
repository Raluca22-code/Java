package lab3;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint firstTest = new MyPoint();
        MyPoint secondTest = new MyPoint(2,4);
        System.out.println("Distance from" + firstTest + "to" + secondTest + "is" + firstTest.distance(secondTest));
        System.out.println("Distance from" + firstTest + " to (2,9) is " + firstTest.distance(2,9));
    }
}