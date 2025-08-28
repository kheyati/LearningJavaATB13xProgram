package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab246_LL_P2 {
    public static void main(String[] args) {
        List mylist = new ArrayList<>(5);
        List mylist2 = new LinkedList(); // doubly linked list
        mylist2.add("Kheyati");
        mylist2.add("Malhotra");
        mylist2.add(null);
        mylist2.add(345);
        mylist2.add(true);
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.get(2));
        System.out.println(mylist2.contains("Malhotra"));
        System.out.println(mylist2.indexOf("Kheyati"));

        System.out.println("___________________");

        Iterator iterator = mylist2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
