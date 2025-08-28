package ex_31_Generics;

public class Lab236_Generics {
    public static void main(String[] args) {
        temp_sum1(2,4);
        temp_sum2(300.45, 432.98);
        temp_sum3(3.45f, 4.56f);
    }
    static int temp_sum1(int a, int b){
        return a+b;
    }
    static double temp_sum2(double a, double b){
        return a+b;
    }

    static double temp_sum3(float a, float b){
        return a+b;
    }

}

