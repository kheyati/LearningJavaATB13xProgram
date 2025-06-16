package ex_05_TypeCasting;

import java.util.Scanner;

public class Task16June {
    public static void main(String[] args) {
        // take user input for 3 sides
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1");
        double side1 = scanner.nextDouble();

        System.out.println("Enter side 2");
        double side2 = scanner.nextDouble();

        System.out.println("Enter side 3");
        double side3 = scanner.nextDouble();

        // conditions to figure out the type of triangle
        // if 1= 2= 3 : Equilateral
        // if 1==2 or 2==3 or 3==1: Isosceles
        // if above two false then Scalene
        if (side1 == side2 && side2 == side3) {
            System.out.println("This is an Equilateral triangle.");
            System.out.println("All three sides are equal.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("This is an Isosceles triangle.");
            System.out.println("Exactly two sides are equal.");
        } else {
            System.out.println("This is a Scalene triangle.");
            System.out.println("No sides are equal.");
        }
    }
}