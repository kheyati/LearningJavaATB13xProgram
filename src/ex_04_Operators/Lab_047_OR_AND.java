package ex_04_Operators;

public class Lab_047_OR_AND {
    public static void main(String[] args) {

        // || gives preference to true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println("-----------------------");
        // && gives preference to false
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

    }

}
