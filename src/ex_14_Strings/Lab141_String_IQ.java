package ex_14_Strings;

public class Lab141_String_IQ {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2= "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");
// == Checks location of s1 & s3 are same
        System.out.println(s1 == s3); //false coz one is in SCP & the other is in Ob Area
        System.out.println(s1 == s2);
        System.out.println(s4 == s5);
        System.out.println("------------------");
        // = checks the value
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));


    }
}
