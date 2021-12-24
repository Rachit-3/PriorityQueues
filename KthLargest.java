package DSA_java.priorityQueues;

import java.util.PriorityQueue;

public class KthLargest
{
    public static int findKth(int []arr,int k)
    {
        PriorityQueue<Integer> a=new PriorityQueue<>();
        for(int i=0;i<k;i++)
            a.add(arr[i]);
        for(int i=k;i<arr.length;i++ )
        {
            System.out.println(a);
            if(arr[i]>a.peek())
            {
                a.poll();
                a.add(arr[i]);
            }
            System.out.println("---------");
        }
        return a.peek();
    }
//  the below code  is to find the kth minimum
//  public static int findKth(int []arr,int k)
//    {
//        PriorityQueue<Integer> a=new PriorityQueue<>(Collections.reverseOrder());
//        for(int i=0;i<k;i++)
//            a.add(arr[i]);
//        for(int i=k;i<arr.length;i++ )
//        {
//            System.out.println(a);
//            if(arr[i]<a.peek())
//            {
//                a.poll();
//                a.add(arr[i]);
//            }
//            System.out.println("---------");
//        }
//        return a.peek();
//    }
    public static void main(String[] args) {
        int []arr={5,2,8,1,3,9,0,6};
        System.out.println(findKth(arr,3));

    }
}
