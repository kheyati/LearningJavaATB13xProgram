package Tasks;

import java.util.Scanner;
// Count vowels and consonants in a String

public class task1_june17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Validate input: only letters and spaces allowed
        if (!input.matches("[a-zA-Z ]+")) {
            System.out.println("Error: Input should contain only alphabets and spaces.");
        } else {
            // Convert input to lowercase for easier comparison
            String lowerInput = input.toLowerCase();

            System.out.print("Vowels: ");
            // Print vowels
            for (int i = 0; i < lowerInput.length(); i++) { //because it is index it starts from 0 we are not using i < = lowerInput.length()
               char ch = lowerInput.charAt(i);
               if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                   System.out.print(ch + " ");
                }
            }
            System.out.println();// next line to print consonants

            System.out.print("Consonants: ");
            // Print consonants using else block
            for (int i = 0; i < lowerInput.length(); i++) {
                char ch = lowerInput.charAt(i);
                //if (Character.isLetter(ch)) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        // do nothing
                    } else {
                        // consonant
                        System.out.print( ch + " ");
                    }

            }
            //System.out.println();
        }
    }
}
