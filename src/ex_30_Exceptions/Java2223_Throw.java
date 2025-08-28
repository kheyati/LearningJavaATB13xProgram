package ex_30_Exceptions;

public class Java2223_Throw {
    public static void main(String[] args) {
        dividedbyzero(0);

    }
    static void  dividedbyzero(int a){
        if (a == 0){
            throw new ArithmeticException("Error a = 0");
        }
    }
}
