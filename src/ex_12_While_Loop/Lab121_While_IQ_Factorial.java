package ex_12_While_Loop;
import java.math.BigInteger;
import java.util.Scanner;

public class Lab121_While_IQ_Factorial {
    public static void main(String[] args) {
        //Factorial Program
        //User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the factorial program\nEnter the number");
        // if not an integer
        if(!scanner.hasNextInt()){
            System.out.println("Enter a integer");
            return; // exit the program
        }
        int number = scanner.nextInt();
        //Actual program use Big Integer to avoid overflow, out of memory error
        long factorial = 1;
        // negative numbers not allowed
        if (number < 0){
            System.out.println("Negative factorial not allowed");
            return;
        }
        // number = 0, print factorial
        if (number <=0){
            System.out.println(factorial);
        }else {
            //calculate factorial
            for (int i = 1; i <= number; i++) {
                factorial = factorial*i;
            }
        }
        System.out.println("Factorial for " + number + " is " +factorial);
    }
}