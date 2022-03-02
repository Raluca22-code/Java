package lab2;
import java.util.*;

//Being given an int number N, compute N! using 2 methods:
// a non recursive method
// a recursive method

public class ex6 {

    public static void main(STring[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("N= ");
        int N = in.nextInt();
        System.out.println("Recursive: " + compute_recursive(N));
        int result = 1;
        for(int i = N; i >= 2; i--)
            result *= i;
        System.out.println("Iterative: " + result);

    }

}
