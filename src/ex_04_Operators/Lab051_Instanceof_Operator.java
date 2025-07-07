package ex_04_Operators;

public class Lab051_Instanceof_Operator {
    public static void main(String[] args) {
        String s1 = new String ("Kheyati");
        System.out.println(s1 instanceof String);
        System.out.println(s1 instanceof Object);
        //System.out.println(s1 instanceof Integer); // error: String cannot be converted to java.lang.Integer
    }
}
