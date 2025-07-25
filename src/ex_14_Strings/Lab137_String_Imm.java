package ex_14_Strings;

public class Lab137_String_Imm {
    public static void main(String[] args) {
        String s1 = "Hello";
        //s1.concat("world");
        //System.out.println(s1); // Hello , not reassigned so the first value gets printed
        s1= s1.concat(" World");
        System.out.println(s1); // Now Hello World will get printed coz s1 is reassigned

    }
}
