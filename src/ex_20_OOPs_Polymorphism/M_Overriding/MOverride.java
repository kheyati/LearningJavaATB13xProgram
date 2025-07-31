package ex_20_OOPs_Polymorphism.M_Overriding;

import ex_01_Java_Basic._underscore;

public class MOverride {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        d1.moverload(3);

        Cat c1 = new Cat();
        c1.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("Default Sound!!");
    }
}

class Dog extends Animal {
    // sound method overides the method in Animal class
    @Override
    // annotation should be written in Child class
    void sound() {
        System.out.println("Bark");
    }

    void moverload() {
    }

    int moverload (int a) {
        System.out.println(a);
        return a;
    }
}



class Cat extends Animal{
    @Override // annotation should be written in Child class
    void sound(){
        System.out.println("Meow");
    }

}