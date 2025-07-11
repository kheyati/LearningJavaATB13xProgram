package ex_12_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {
        //Guess a number between 1 to 100
        // there is prebuild class called Random in Java which will select a random number
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1; // 0-100
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number! ");

        int guess;
        int attempts = 0;

        while (true){
            guess = sc.nextInt();
            attempts++;
            if (guess < numberToGuess ) {
                System.out.println("Too low, try again");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again");
            }else{
                System.out.println("Correct! You guessed it in " + attempts + " attempts");
            break;
            }
        }



    }
}
