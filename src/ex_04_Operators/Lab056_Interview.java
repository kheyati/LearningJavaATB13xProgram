package ex_04_Operators;

public class Lab056_Interview {
    public static void main(String[] args) {
        short s = 10;
        char c = 'A';
        String s123 = "A";
        System.out.println(s + c); // when char is with another char or Integral it acts as ASCII value
        System.out.println(c); // when it is alone it acts as string
        System.out.println(c + c);
        System.out.println(s123 + c); //Concatinates AA
    }
}
