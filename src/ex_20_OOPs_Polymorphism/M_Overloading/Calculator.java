package ex_20_OOPs_Polymorphism.M_Overloading;

public class Calculator {
    public static void main(String[] args) {
        calci c1 = new calci();

        int r1= c1.add(2, 5);
        System.out.println(r1);
        double r2= c1.add(4.5, 6.2);
        System.out.println(r2);
    }

}

class calci{
    int attribute;
    int add (int a, int b){
        return a+b;
    }
    double add (double a, double b){
        return a+b;
    }

}
