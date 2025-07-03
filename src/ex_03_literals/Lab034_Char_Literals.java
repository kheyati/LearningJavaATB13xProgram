package ex_03_literals;

public class Lab034_Char_Literals {
    public static void main(String[] args) {
       char c1 = 'A';
       char new_line = '\n';
       char tab_line = '\t';
       char back_space = '\b';
       char carriage_return = '\r';
        System.out.println("KheyatiMalhotra");
        System.out.println("Kheyati"+new_line+"Malhotra");
        System.out.println("Kheyati"+ tab_line+"Malhotra");
        System.out.println("Kheyati"+ back_space+"Malhotra");
        System.out.println("Kheyati"+ carriage_return+"Malhotra");

    char c10 = 'A';
        System.out.println(c10);
    //ASCII limited to A


        //UNICODE literals
        char rupee = '\u20B9';
        System.out.println(rupee);




    }
}
