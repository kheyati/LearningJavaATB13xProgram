package ex_32_Collection_Framework_DSA.LIST.SET;

import java.util.*;
import java.util.jar.JarOutputStream;

public class Lab255_HS_LHS {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        //HasSet using hashing mechanism
        // Assigns a hashcode to the elements
        // keeps only lastest element, thats y duplicates are not allowed
        // does not maintain the order
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Orange");
        hs.add(null);
        hs.add(null);
        hs.add("Watermelon");

        System.out.println(hs);

        System.out.println("____________________");


        for (String s : hs){
            System.out.println(s);
        }
        System.out.println("____________________");

        Iterator iterator = hs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("****************************");


        Set lhs = new LinkedHashSet();
        // Linked List mechanism is used to store elements ; node mechanism
        // MAintains order
        // no duplicates allowed

        lhs.add("Apple");
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("Grapes");
        lhs.add("null");
        lhs.add("null");

        System.out.println(lhs);

        System.out.println("________________________");


        Set ts = new TreeSet();
        ts.add("QQApple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Watermelon");
        //ts.add(123);

        System.out.println(ts);

    }
}
