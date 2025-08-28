package ex_31_Generics;

public class Lab238_Generics_Class {
    public static void main(String[] args) {
        GenericsClass g = new GenericsClass(10);
        GenericsClass g1 = new GenericsClass("Kheyati");
        GenericsClass g2 = new GenericsClass(true);
        GenericsClass g3 = new GenericsClass(3.14f);


    }
}
class GenericsClass<T>{
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    //constructor
    public GenericsClass(T data) {
        this.data = data;
    }
}
