package ex_19_Oops_Inheritence.ex_19_OOPs_Inhertience_Multilevel;

public class Runner_Multilevel {
    public static void main(String[] args) {
        Grandfather gf = new Grandfather();
        //gf.gold_gf
        gf.home();
        gf.gf();

        System.out.println("******************");
        Father f1 = new Father();
        f1.father_f();
        f1.home_f();
        int goldGf1 = f1.gold_gf;
        f1.gf();
        f1.home();
        System.out.println("---------------");

        Son s1 = new Son();
        int goldGf = s1.gold_gf;
        s1.father_f();
        s1.son_h();

    }
}
