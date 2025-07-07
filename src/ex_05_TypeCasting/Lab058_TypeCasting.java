package ex_05_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {

        byte b = 10;
        int a = b; // implicit widening
        int a1 = (int) b; // explicit widening
    }
}
