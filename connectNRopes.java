package DSA_java.priorityQueues;

import java.util.PriorityQueue;

public class connectNRopes {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        int[] arr ={7,3,5,2,9,5,1,6};
        for (int j : arr) p.add(j);
        while (!p.isEmpty())
        {
            int a=p.poll();
            int b=0;
            if(!p.isEmpty())
                b=p.poll();
            else
            {System.out.println(a);
            System.exit(0);}
            p.offer(a+b);


        }


    }
}
