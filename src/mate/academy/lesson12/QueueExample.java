package mate.academy.lesson12;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println("After peek: " + queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println("After poll: " + queue);
        System.out.println("Offer 5: "+ queue.offer(5));
        System.out.println("Offer -5: "+ queue.offer(-5));
        System.out.println("Offer 100: "+ queue.offer(100));
        System.out.println("Offer -100: "+ queue.offer(-100));
        System.out.println("After offer: " + queue);
        System.out.println("Offer -5: "+ queue.add(10));
        System.out.println("Offer 101: "+ queue.add(101));
        System.out.println("Offer -101: "+ queue.add(-101));
        System.out.println("After add: " + queue);
    }
}
