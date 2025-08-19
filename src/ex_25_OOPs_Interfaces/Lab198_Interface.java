package ex_25_OOPs_Interfaces;

public class Lab198_Interface {
    public static void main(String[] args) {
Square s = new Square();
s.getArea(10,20);

Rectangle r = new Rectangle();
r.getArea(20, 20);
    }
}

class Rectangle implements Polygon{
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area = "+ (length*breadth));
    }
}

class Square implements Polygon{
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of a square "+ (length * breadth));
    }
}


// Interface
interface Polygon{

    // Incomplete method
    void getArea(int length, int breadth);
    // Complete methods not allowed
//    void completeMethod();{
//
//    }

    // complete "default" methods are allowed
    default void defaultMethod(){
        System.out.println("Default methods are allowed in Interface");
    }

    // complete "static" methods are allowed
    static void staticMethod(){
        System.out.println("Static methods are allowed in Interface");
    }
}
