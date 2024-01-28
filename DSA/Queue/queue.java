package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String[] args) {
//		Queue = FIFO data structure. First-In First-Out (eg. First come first serve)
//				A collection designed for holding elements prior to processing
//				Linear data structure
//				It's a interface class.
		
//				add		=	enqueue, offer()
//				remove	=	dequeue, poll()
		
		Queue<String> name = new LinkedList<String>();			// !! Remeber to import LinkedList, ArrayDeque or PriorityQueue. FOR NOW I ONLY KNOW THAT THESE 3 CAN BE ONLY INSTANCE VARIABLE.
		
		name.offer("Akshit");
		name.offer("Rishu");
		name.offer("Eshan");
		
		System.out.println(name.peek());		// This code executes first then the poll() happens so no "Akshit" will be shown in Queue.
		
		name.poll();			// Removes Akshit from TOP.
		
		System.out.println(name);
		
		System.out.println(name.isEmpty());			// False since not empty.
		System.out.println(name.size());			// Actual it's 3 but since we poll() "Akshit" it's showing 2.
		System.out.println(name.contains("Rishu"));	// True as it exists
		
		while(!name.isEmpty()) {
			System.out.println(name.poll());
		}
		
//		Where are Queue's useful?
		
//		1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
//		2. Printer Queue (print jobs should be completed in order)
//		3. Used in LinkedLists, PriorityQueues, Breadth-first search
	}
}
