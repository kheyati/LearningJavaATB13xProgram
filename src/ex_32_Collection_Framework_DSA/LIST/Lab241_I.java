package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab241_I {
    public static void main(String[] args) {
        List l = new ArrayList(); // Dynamic dispatch
        l.add("hello");
        l.add(10);
        l.add(true);
        System.out.println(l);


    }
}
