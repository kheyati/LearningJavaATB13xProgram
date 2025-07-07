package ex_05_TypeCasting;

public class Lab061_TypeCasting {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total = course + GST; //incompatible types: possible lossy conversion from float to int
        int total = (course + (int)GST); //explicit narrowing
        System.out.println(total); // loss of data 118

        float total2 = course + GST; // implicit widening
        float total3 = course + (float)GST; // explicit widening
        System.out.println(total2);
        System.out.println(total3);
    }
}
