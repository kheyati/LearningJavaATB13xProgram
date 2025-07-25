package Tasks;

import java.util.Scanner;

public class June23_task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        if (sc.hasNextInt()){
            int input = sc.nextInt();

            if (input < 0) {
                System.out.println(input + " is a negative number");
            } else if (input > 0) {
                System.out.println(input + " is a positive number");
            } else {
                System.out.println(input + "is 0 which is neither negative nor positive");
            }

        } else {
            System.out.println("Input is not a number");
        }



    }
}
