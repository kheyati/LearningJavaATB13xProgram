package Tasks;

import java.util.Scanner;

public class CP_CheckVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = scanner.next().toLowerCase().charAt(0);
        switch (ch){
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " is a Vowel");
            default -> System.out.println(ch + " is a consonant");
        }
    }
}
