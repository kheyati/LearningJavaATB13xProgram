package Tasks;

import java.util.Scanner;

public class task2_june18 {
    public static void main(String[] args) {
        //Write a program that calculates and displays the letter grade for a given numerical score
        // (e.g., A, B, C, D, or F) based on the following grading scale:
//        A: 90-100 >= 90
//        B: 80-89 >=80
//        C: 70-79 >=70
//        D: 60-69 >=60
//        F: 0-59 >=50
        // take input using scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score ");

        // Validate input: only numbers allowed
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer score between 0 and 100.");
            sc.next(); // consume invalid input
        }
        int score = sc.nextInt();

        // Validate score range
        if (score < 0 || score > 100) {
            System.out.println("Score must be between 0 and 100.");
        } else {
            // Determine letter grade based on score
            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            // Display the result
            System.out.println("The letter grade is: " + grade);
            }
            }



    }

