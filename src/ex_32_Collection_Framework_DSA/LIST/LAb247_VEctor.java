package ex_32_Collection_Framework_DSA.LIST;

import java.util.Iterator;
import java.util.Vector;

public class LAb247_VEctor {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1= new Vector();

        v.add("Cat");
        v.add(67);
        v.add("Dog");
        v.add(false);

        System.out.println(v);

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        System.out.println("---------");

        Iterator iterator = v.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
