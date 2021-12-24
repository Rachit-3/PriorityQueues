package DSA_java.priorityQueues;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQueuesBasic {
    public static void main(String[] args) {
//        PriorityQueue <Integer> a=new PriorityQueue<>();
        //the above queue is storing the value as Minheap i.e the priority of queue is smaller to larger
        PriorityQueue <Integer> a=new PriorityQueue<>(Collections.reverseOrder());
        //the above queue is storing the value as Maxheap i.e the priority of queue is  larger to smaller
        System.out.println(a.isEmpty());
        System.out.println("------------------");
        a.add(10);
        a.add(79);
        a.add(45);
        a.add(5);
        System.out.println(a.isEmpty());
        System.out.println("---------------");
        System.out.println(a.size());
        System.out.println("--------------------");
        System.out.println(a.peek());
        System.out.println("-----------------");
        System.out.println(a);
        System.out.println("------------------");
        System.out.println(a.poll());
        System.out.println("-----------------");
        System.out.println(a);
    }
}
