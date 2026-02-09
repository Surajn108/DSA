import java.util.*;
public class LQueue {
    public static void ArrayDeque(){
        ArrayDeque<Integer> deq =new ArrayDeque<>();
        

        deq.offer(23);
        deq.offer(43);
        deq.offerLast(2);
        deq.offer(64);
        deq.offerFirst(31);
        deq.offer(26);
        deq.offer(74);
        System.out.println(deq.peekLast());
        System.out.println(deq.pollLast()); //remove last ele
        
       
        System.out.println(deq);
    }


    public static void PriorityQueue(){
        // BAsed on MinHeap and MAxHeap
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        PriorityQueue<Integer>pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        
        pq.offer(23);
        pq.add(52);
        pq.offer(35);
        pq.offer(63);
        pq.offer(61);
        pq.offer(2);
        pq.offer(39);
        

        System.out.println("PQ:"+pq);

        pq2.offer(23); 
        pq2.add(52);
        pq2.offer(35);
        pq2.offer(63);
        pq2.offer(61);
        pq2.offer(2);
        pq2.offer(39);

        System.out.println("PQ Reverse:"+pq2);
    }
    public static void main(String[] args) {

        //ArrayDeque();
        PriorityQueue();
    }
    



}
