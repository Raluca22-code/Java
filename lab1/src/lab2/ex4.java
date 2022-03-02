package lab2;
import java.util.Collections;
import java.util.Vector;
//Giving a vector of N elements,
// display the maximum element in the vector.

public class ex4 {
    public static void main(String args[]) {
        Vector vec = new Vector();
        vec.add(7);
        vec.add(3);
        vec.add(9);
        vec.add(5);
        vec.add(8);
        System.out.println("The Vector elements are: " + vec);
        System.out.println("The maximum element of the Vector is: " + Collections.max(vec));
    }
}

