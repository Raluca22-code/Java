package lab2;
import java.util.Scanner;
//game

public class ex7 {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber = rand.nectInt(100) + 1;
        System.out.println("Enter your guess (1-100): ");
        int playerGuess = scanner.nextInt();

        if(playerGuess == randomNumber) {
            System.out.println("Correct!You won!);
        }
        else if(randomNumber > playerGuess) {
            System.out.println("Guess again :)! Number too higher");
        }
        else {
            System.out.println("Guess again :)! Number too lower");
        }
    }
}




