package ex_05_TypeCasting;

public class Lab059_TypeCasting {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val; // implicit narrowing not allowed
        byte b1 = (byte)val;
        System.out.println(b1); // = 44
        // 300 is converted into binary number (32 bits memory)
        // byte only 8 bits is used
        //so 8 bits binary converted into integral will give 44


    }
}
