package ex_30_Exceptions;

public class LAb219_String_Null_Pointer {
    public static void main(String[] args) {

        // Checked exception
       String name = null;
       name.trim();//java.lang.NullPointerException: Cannot invoke "String.trim()" because "name" is null

    }
}
