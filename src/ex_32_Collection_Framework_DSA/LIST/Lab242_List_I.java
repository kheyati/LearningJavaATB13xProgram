package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab242_List_I {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PPP");
        arrayList.add(null);
        arrayList.add(44);
        arrayList.add("PPP");
        arrayList.add("MMM");
        arrayList.add(false);
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l = new ArrayList();
        l.add("123");
        l.add(32);
        l.add("kheyati");
        System.out.println(l);
        System.out.println(l.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());


    }
}
