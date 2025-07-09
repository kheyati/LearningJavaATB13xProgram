package ex_07_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {
    public static void main(String[] args) {

       // input for string
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());

        // input for int
        System.out.println("Enter the number");
        Scanner sc  = new Scanner(System.in);
        System.out.println(scanner.nextInt());

        // input for double
        System.out.println("Enter the double value");
        Scanner sc2  = new Scanner(System.in);
        System.out.println(scanner.nextDouble());


    }
}
