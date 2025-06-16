package Tasks;
import java.util.Scanner;

public class task1_june18 {
    public static void main(String[] args) {
        // Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4 but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");

        // Validate input: only numbers allowed
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer year.");
            sc.next(); // consume invalid input
        }

        int input = sc.nextInt();

        // Leap year check with explicit parentheses
        if (((input % 4 == 0) && (input % 100 != 0)) || (input % 400 == 0)) {
            System.out.println(input + " is a leap year.");
        } else {
            System.out.println(input + " is not a leap year.");
        }
    }
}