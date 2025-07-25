package ex_14_Strings;

public class Lab140_Strings_IQ {
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = "Hello";

    // only one Hello is created in SCP only s1, s2 & s3 are different refernces
    String s4 = new String("Hello");
    String s5 = new String("Hello");
    String s6 = new String("Hello");
// SCP: 1
    // ObArea: 3
    //Total 4


}

