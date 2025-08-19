package ex_29_Primitive_Wrapper;

public class Lab214_Wrapper_Conversion {
    public static void main(String[] args) {
        int a = 10;

        Integer b = a; // Boxing -> automatically JVM will convert and store
        // Primitive to wrapper is called autoboxing

        System.out.println(b.intValue());
        System.out.println(Integer.MIN_VALUE);

        Integer a2 = 42;
    int v = a2; // Unboxing-> wrapper is removed, attributes are not available now
        System.out.println(v);


    }
}
