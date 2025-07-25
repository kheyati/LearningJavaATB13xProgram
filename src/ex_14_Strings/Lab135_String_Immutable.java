package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name = "Pramod"; //created in SCP
        //name.toUpperCase(); // another string is created PRAMOD
        //System.out.println(name); // Pramod will be pronted coz older version is pronted
        name = name.toUpperCase(); // Reassign the new value to the variable so it prints the new value
        System.out.println(name);
    }
}
