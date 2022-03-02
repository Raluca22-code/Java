package lab2;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args){

        int numberOne;
        int numberTwo;
        int largest;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        numberOne = scan.nextInt();
        System.out.println("Enter the second number: ");
        numberTwo = scan.nextInt();

        if(numberOne > numberTwo)
            largest = numberOne;
        else
            largest = numberTwo;

        System.out.println("\nLargest = " +largest);

    }
}

