package ex_31_Generics;

public class Lab237_Generics_Fix {
    public static void main(String[] args) {
        display(3,4);
        display(345.88, 788.96);
        display(34.02f, 33.0f);
        display("hello", "world");
    }
static <T> void display(T a, T b){
    System.out.println(a);
    System.out.println(b);

}

}

