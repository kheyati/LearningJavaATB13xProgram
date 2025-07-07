package ex_06_Ternary_Operator;

public class Lab_066_Nested_TO {
    public static void main(String[] args) {


        // age = 23
        // age < 18 -> minor
        // 65 < age > 18 -> adult
        // age > 65 -> Senior Citizen

        int age = 88;
        String result = (age < 18) ? "Minor" : (age < 65 ? "Adult" : "Senior Citizen");
        System.out.println(result);
    }
}
