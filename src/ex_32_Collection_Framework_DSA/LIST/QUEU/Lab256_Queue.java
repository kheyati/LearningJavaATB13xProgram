package ex_32_Collection_Framework_DSA.LIST.QUEU;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab256_Queue {
    public static void main(String[] args) {

        Queue q = new PriorityQueue();
        q.add("Pramod");
        q.add("Dutta");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println("____________");
        q.offer("ATBx13");
        System.out.println(q);


    }
}
