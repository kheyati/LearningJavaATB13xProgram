package ex_29_Primitive_Wrapper;

public class Lab215_Wrapper_Part2 {
    public static void main(String[] args) {

        String num = "10";
        //String to Wrapper

        Integer a = Integer.parseInt(num);
        Integer b = Integer.valueOf(num);



        // Convert String to primitive
        Integer a1 = Integer.parseInt(num);

        // Wrapper to String
        System.out.println(a.toString());

        // Primitive to String
        int age = 10;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());


    }
}
