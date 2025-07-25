package ex_19_Oops_Inheritence.ex_19_OOPs_Inhertience_Multilevel;

public class Multi_Dynamic_Dispatch {
    public static void main(String[] args) {
        Son amit = new Son();

        //Son s1 = new Father();

        //Son s1 = new Grandfather();

        Grandfather ss1 = new Son(); // dynamic dispatch; ss1 can access only grandfather functions, cannot access Son function
        ss1.home();

        Grandfather ss3 = new Father();// dynamic dispatch; ss1 can access only grandfather functions, cannot access Father function
        ss3.home();

        Father ss4 = new Son(); // dynamic dispatch; ss1 can access only father functions, cannot access Son function
        ss4.gf();
        ss4.home_f();
         //Webdriver driver= new Chromedriver;
    }

}
