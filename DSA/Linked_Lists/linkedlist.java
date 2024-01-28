package DSA.Linked_Lists;

import java.util.*;

public class linkedlist {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
//		LiskedList as Stacks :-
//		list.push("A");
//		list.push("B");
//		list.push("C");
//		list.push("D");
//		list.push("F");
//		list.pop();
		
//		LinkedList as Queue :-
		list.offer("A");
		list.offer("B");
		list.offer("C");
		list.offer("D");
		list.offer("F");
//		list.poll();
		
		System.out.println(list.indexOf("A"));		// Finding the index. Here A -> since we're printing before adding "0" in the group.
		System.out.println(list.peekFirst());		// Prints the head
		System.out.println(list.peekLast());		// Prints the tail
		list.add(4, "E");					// Insertion in LinkedList
		list.addFirst("0");					// Inserts a new head
		list.addLast("G"); 					// Inserts a new tail
		list.remove("F");					// Deletion in LinkedList
//		String first = list.removeFirst();
//		String last = list.removeLast();
		
		System.out.println(list);
	}
}
