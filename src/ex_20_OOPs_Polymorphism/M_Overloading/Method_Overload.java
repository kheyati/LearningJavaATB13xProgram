package ex_20_OOPs_Polymorphism.M_Overloading;

public class Method_Overload {
    public static void main(String[] args) {
    // Object creation
        MathOperations m1 = new MathOperations();

        // Calling the same method, method name is add
    int r1 = m1.add(3, 4);
        System.out.println(r1);
    int r2 = m1.add(5, 6);
        System.out.println(r2);
    double r3 = m1.add(3.5, 4.3);
        System.out.println(r3);
    String r4 = m1.add("Kheyati", "Malhotra");
        System.out.println(r4);
    }
}

class MathOperations{
    // same name methods but different params & return types

    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    String add(String a , String b){
        return a+b;
    }


}
