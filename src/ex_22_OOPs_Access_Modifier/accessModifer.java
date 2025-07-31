package ex_22_OOPs_Access_Modifier;

public class accessModifer {
    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println(s1.bhk3);
        System.out.println(s1.car);
    }
}
class Father{
    private int gols = 10;
    int car = 1;
    public int bhk3 = 1;

}

class Son extends Father{
    void wecanUse(){
        //System.out.println(gold); // cannot use since it si private
        System.out.println(car);
        System.out.println(bhk3);
    }
}