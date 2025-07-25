package ex_15_StringBuffer_Builder_Functions;

public class Lab_145_SBuffer {
    public static void main(String[] args) {
        StringBuffer strbuff = new StringBuffer("Naman");

        strbuff.append(" Madam");
        // first Kheyati will be created
        // then it will be replaced by Kheyati Malhotra
        // only 1 object is created
        System.out.println(strbuff);
        System.out.println(strbuff.reverse());
    }

    }
