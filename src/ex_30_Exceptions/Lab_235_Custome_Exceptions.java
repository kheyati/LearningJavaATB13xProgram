package ex_30_Exceptions;

import java.util.Base64;

public class Lab_235_Custome_Exceptions {
    public static void main(String[] args) throws currencyMismatchException {
        Bank sbi = new Bank("INR", 100);
        Bank icici = new Bank("INR", 123);
        int total = sbi.add(icici);
        System.out.println(total);

        Bank jp = new Bank("USD", 101);
        int new_total = sbi.add(jp);
        System.out.println(new_total);
    }

}
