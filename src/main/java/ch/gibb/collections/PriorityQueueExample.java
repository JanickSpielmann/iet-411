package ch.gibb.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // import java.util.Queue;
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(20);
        queue.offer(1);
        queue.offer(5);
        queue.offer(3);
        queue.offer(9);
        queue.offer(12);
        System.out.println("queue = " + queue);
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue = " + queue);
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue = " + queue);
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue = " + queue);

    }
}
