package EX_10_Switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_087_Real_Switch_Automation {
    public static void main(String[] args) {
        //web automation
        // User input from browser
        //use to start automation in that browser

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser, which you want to start");
        String browser = sc.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting Chrome");
                System.out.println("-------------------");
                System.out.println("TC 1 executed");
                System.out.println("TC 2 executed");
                break;
            case "firefox":
                System.out.println("Starting Firefox");
                System.out.println("-------------------");
                System.out.println("TC 1 executed");
                System.out.println("TC 2 executed");
                break;
            case "safari":
                System.out.println("Starting Safari");
                System.out.println("-------------------");
                System.out.println("TC 1 executed");
                System.out.println("TC 2 executed");
                break;
            default:
                System.out.println("Please select supported browser only");
                break;


        }
    }
}
