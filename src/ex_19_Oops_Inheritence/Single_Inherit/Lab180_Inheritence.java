package ex_19_Oops_Inheritence.Single_Inherit;

public class Lab180_Inheritence {
    public static void main(String[] args) {

        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1 = new Son();
        s1.bhk3();
        s1.bhk2();
        System.out.println(s1.gold_f);
    }
}

class Father{
    int gold_f = 1000;

    void bhk2(){
        System.out.println("Father's 2 BHK");
    }
}

class Son extends Father{
    void bhk3(){
        System.out.println("Son's 3 BHK");
    }
}
