package ex_23_OOPs_Super;

public class Lab194_Super {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.sound();
    }

}


class God{
    int gold = 100;

    void sound(){
        System.out.println("GOD sound");
    }
}

class Animal extends God{

    @Override
    void sound() {
        super.sound();
    }
    Animal(){
        super();
    }
    Animal (int a, int b){
        System.out.println(a+b);
    }
    void test(){
        System.out.println(super.gold);
    }
}