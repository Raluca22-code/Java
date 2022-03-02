package lab2;
//Write a program which display prime numbers between A and B, where A and B are read from console.
// Display also how many prime numbers have been found.

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class ex3 {
       public static void main(String @NotNull [] args) {
           int primes = 0;
           int n = Integer.parseInt(args[0]);
           boolean[] isPrime = new boolean[n+1];

           Scanner reader = new Scanner(System.in);

           System.out.println("Enter lower bound: ");
           int low = reader.nextInt();

           System.out.println("Enter high bound: ");
           int high = reader.nextInt();

           while (low < high) {
               boolean flag = false;

               for(int i = 2; i <= low/2; ++i) {
                   // condition for nonprime number
                   if(low % i == 0) {
                       flag = true;
                       break;
                   }
               }

               if (!flag && low != 0 && low != 1)
                   System.out.print(low + " ");

               ++low;

               for(int i = 2; i <= n; i++){
                   if(isPrime[i]) primes++;
               }
               System.out.println("The number of primes <= " + n + " is " + primes);

         }

       }
}