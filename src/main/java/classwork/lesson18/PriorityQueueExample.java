package classwork.lesson18;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> queue=  new PriorityQueue<>();
        queue.add("petros");
        queue.add("poxos");
        queue.add("martiros");
        queue.add("aram");
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
