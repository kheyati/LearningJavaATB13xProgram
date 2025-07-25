package ex_16_Arrays;

import java.util.Scanner;

public class Lab_165_Multiplication {
    // Print
    // 0*0 | 0*1 | 0*2
    // 1*0 | 1*1 | 1*2
    // 2*0 | 2*1 | 2*2

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int size_of_table = scanner.nextInt();

        for (int i = 0; i < size_of_table; i++) {
            for (int j = 0; j < size_of_table; j++) {
                System.out.print(i*j + " | ");

            }
            System.out.println();
            
        }
    }
}
