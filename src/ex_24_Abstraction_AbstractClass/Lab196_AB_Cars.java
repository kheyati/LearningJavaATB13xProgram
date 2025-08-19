package ex_24_Abstraction_AbstractClass;

public class Lab196_AB_Cars {
    public static void main(String[] args) {
        Engine.WagonR car = new Engine.WagonR();
        car.drive();


    }
}


abstract class gearMgmt{
    abstract void gearSet();

}

abstract class Engine{
    abstract void startEnginer();
    abstract void stopEngine();

    void checkEngine(){
        System.out.println("All Good");
    }



static class WagonR extends Engine{

    @Override
    void startEnginer() {
        System.out.println("Starting enginee");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping Engine");

    }
    void drive(){
        startEnginer();
        stopEngine();
        checkEngine();
    }
}

}
