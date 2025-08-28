package ex_32_Collection_Framework_DSA.LIST.QUEU;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LAb257_LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(1);
        queue.add(8);

        System.out.println(queue);

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);
        }
        System.out.println("____________");

        for (Object o: queue){
            System.out.println(o);
        }
    }
}
