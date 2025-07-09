package EX_10_Switch;

import java.util.Scanner;

public class Lab085_Switch {
    public static void main(String[] args) {
// take user input & tell then wat day it is
        // 1 -> Mon
        // 5 -> Fri
        // 8 -> Not allowed
        System.out.println("Enter the day 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("Sunday");

            default:
                System.out.println("Not allowed");


        }


    }
}
