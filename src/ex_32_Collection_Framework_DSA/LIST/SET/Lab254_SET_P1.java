package ex_32_Collection_Framework_DSA.LIST.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab254_SET_P1 {
    public static void main(String[] args) {
        //Sets dont allow duplicates


        Set hs1 = new HashSet();

        Set hs2 = new LinkedHashSet();

        Set h3 = new TreeSet();

        hs1.add("Kheyati");
        hs1.add("Malhotra");
        hs1.add("Kheyati");
        System.out.println(hs1);



    }
}
