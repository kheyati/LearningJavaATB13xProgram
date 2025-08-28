package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab243_AL {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 = new ArrayList(10);
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        list1.add("6");
        list1.add("tttt");

        System.out.println(list1.size());
        System.out.println(list1.isEmpty());
        System.out.println(list1.contains("1"));
        System.out.println(list1.contains(1));


        // return the index
        System.out.println(list1.indexOf("4"));
        System.out.println(list1.lastIndexOf("3"));
        System.out.println("-------------");

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }

        System.out.println("***********************");
        for (Object o: list1){
            System.out.println(o);
        }


        list1.set(1, 25);
        System.out.println(list1);
        System.out.println("::::::::::::::::");
        list1.remove(0);
        System.out.println(list1);
        System.out.println("{{{{{{{{{}}}}}}}}}}}");

        list1.clear();
        System.out.println(list1);
    }
}
