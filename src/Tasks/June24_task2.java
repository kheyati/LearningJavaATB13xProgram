package Tasks;

import java.util.Scanner;

public class June24_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        try {
            int s1 = scanner.nextInt();
            if (s1 % 2 == 0) {
                System.out.println(s1 + " is a even number");

            } else {
                System.out.println(s1 + " is an odd number");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Enter a valid number");
        }
    }
}
