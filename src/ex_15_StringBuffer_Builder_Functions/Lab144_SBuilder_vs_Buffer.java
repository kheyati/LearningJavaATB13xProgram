package ex_15_StringBuffer_Builder_Functions;

public class Lab144_SBuilder_vs_Buffer {
    public static void main(String[] args) {
        String s0= "Kheyati"; // SCP
        String s1 = new String("Kheyati"); //Ob Area

        StringBuffer strbuff = new StringBuffer("Kheyati");
        StringBuilder strbuild = new StringBuilder("Kheyati");


        System.out.println(s0);
        System.out.println(s1);
        System.out.println(strbuff);
        System.out.println(strbuild);
    }
}
