package ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {
        //w/o p w/o r
        wo_p_wo_rt();
        //w/o p w r
        greet_with_Hello_wo_p_w_rt();
        //w p w/o r
        greet_with_details("Kheyati", 35, 9742117227d);
        //w p w r
        int result = sum_two_numbers(12,12,12,12);
        System.out.println("Sum of 4 numbers = " + result);
    }


    // Type 1: w/o param & w/o return type
    static void wo_p_wo_rt() {
        System.out.println("Without param & without return type");
    }


// Type 2: w/o param & with return type
    static String greet_with_Hello_wo_p_w_rt(){
        System.out.println("Without param but with return type");
    return ("String return type");
    }

// Type 3: with param & w/o return type

    static void greet_with_details(String name, int age, double phone_number){
        System.out.println("Hi, "+ name+ "\nYour age is " + age + "\nYour phone number is " +phone_number );

    }


// Type 4: with param & with return type
static int sum_two_numbers(int a, int b, int c, int d){
    return (a+b+c+d);
}
}