package ex_04_Operators;

public class Lab040_Logical_Operator {
    public static void main(String[] args) {
       boolean a = true;
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);

        boolean c = true || false; // always gives preference to true
        System.out.println(c);

        boolean d = true && false; // always gives preference to false
        System.out.println(d);

    }
}
