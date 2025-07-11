package Tasks;

//Palindrome of String (chatAt())
import java.util.Scanner;

public class task2_june17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Validate input: only letters and spaces allowed
        if (!input.matches("[a-zA-Z ]+")) {
            System.out.println("Error: Input should contain only alphabets and spaces.");
        } else {
            // Remove spaces and convert to lowercase
            String processed = input.replaceAll(" ", "").toLowerCase();

            // Check palindrome
            boolean isPalindrome = true;
            int n = processed.length();
            for (int i = 0; i < n / 2; i++) {// n/2 because we will check only till first half of the characters coz after halfway we will just be checking the same characters again
                if (processed.charAt(i) != processed.charAt(n - 1 - i)) { // n - 1 - i will compare when i = 0-> first & last char; when i=1-> second and second last character
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
}
