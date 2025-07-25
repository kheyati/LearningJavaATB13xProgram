package ex_16_Arrays;

import java.util.Scanner;

public class Lab_164_Right_Triangle {
    public static void main(String[] args) {
            // n = 3
        //*
        //**
        //***

        System.out.println( "Enter the number eg: 3 ");
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }



    }
}
