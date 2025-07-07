package ex_04_Operators;

public class Lab_043_Interview_Concat_ {
    public static void main(String[] args) {
        String firstname = "Kheyati";
        String lastname = "Malhotra";

        int a = 10;
        int b = 10;

        System.out.println(firstname+ lastname + a + b);

        //since first + is acting as a concat then second + will also concatinate

        System.out.println(a + b + firstname + lastname);
        System.out.println(firstname+ lastname + (a + b));
    }
}
