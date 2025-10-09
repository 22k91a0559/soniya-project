
package collections;
import java.util.PriorityQueue;


public class Priorityqueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(50);
        pq.add(20);
        pq.add(40);
        pq.add(10);

        System.out.println("PriorityQueue: " + pq);

        System.out.println("Removed element (poll): " + pq.poll());

        System.out.println("Peek element: " + pq.peek());

	}

}
