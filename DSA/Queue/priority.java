package DSA.Queue;

import java.util.*;

public class priority {
	public static void main(String[] args) {
//		Priority Queue = A FIFO data structure that serves elements
//							with the highest priorities first
//							before elements with lower priority
		Queue<Double> queue = new LinkedList<>();
		
		queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.5);
		queue.offer(2.0);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		System.out.println();
		Queue<String> string = new PriorityQueue<>(Collections.reverseOrder());    // Used for reversing the order *PROPERLY*.
		
		string.offer("Akshit");
		string.offer("Eshan");
		string.offer("Rishu");
		string.offer("Emily");
		
		while(!string.isEmpty()) {
			System.out.println(string.poll());
		}
	}
}
