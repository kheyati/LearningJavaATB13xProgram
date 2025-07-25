package ex_18_OOPs_Constructor;

public class LAb173_OOPS_Constructor {
    public static void main(String[] args) {
        // Object creation
        Baby b1 = new Baby();

    }
}


// Class creation
class Baby{
    // Attribute/ Instance Variable/ Member variables/  Data members

    //Default Constuctor: is called as soon as object gets created, there is no need to call explicitly
    // Anything you want to do without calling a method explicitly should be written in a constructor

    Baby (){
        System.out.println("Hi, I am a default constructor");
    }

// Behaviours/ Methods
    String name;

    void cry(){
        System.out.println("Cry");
    }
    void eat(){
        System.out.println("Eat");
    }
    void sleep(){
        System.out.println("Sleep");
    }
}

