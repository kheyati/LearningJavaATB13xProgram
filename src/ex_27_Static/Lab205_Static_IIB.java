package ex_27_Static;

public class Lab205_Static_IIB {
    public static void main(String[] args) {
    parent p1 = new parent();
        System.out.println(parent.a);
        System.out.println(p1.a);
        parent p2 = new parent();
        //System.out.println(parent.b);
        p1.b = 25;
        System.out.println(p1.b);
        p2.b=35;
        System.out.println(p2.b);
    }
}

class parent{
    static int a = 10;// shared with everyone, common to everyone
            int b = 20;


            static {
                //This is a static block & it is called whenever a class is loaded
                System.out.println("Hi, this is static block & it is called during class loading");
            // Static block is used to Call a DB connection, excel file, webdrive


            }
}