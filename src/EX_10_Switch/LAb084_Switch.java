package EX_10_Switch;

import java.util.Scanner;

public class LAb084_Switch {
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
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not allowed");
                break;

        }


    }
}
