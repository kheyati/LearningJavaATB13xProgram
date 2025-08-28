package ex_32_Collection_Framework_DSA.LIST;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab251_User_Input {
    public static void main(String[] args) {
        //multiple inputs from user to store info about students
        // name, ages, store them

        ArrayList <String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        String continueInput = "y";

        while(continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter your name");
            String name = scanner.next();
            names.add(name);

            System.out.println("Enter the age ");
            Integer age = scanner.nextInt();
            ages.add(age);


            scanner.nextLine();
            System.out.println("Do you want to enter another record? (Y/N:)");
            continueInput = scanner.nextLine();
        }

        for (Object o1: names){
            System.out.println(o1);
        }
        for (Object o2: ages){
            System.out.println(o2);
        }

        scanner.close();

    }
}
