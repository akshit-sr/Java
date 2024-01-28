package DSA.Stacks;

import java.util.Stack;

public class stacks {
	public static void main(String[] args) {
		
//		Stack = LIFO data structure. Last-In First-Out
//				Stores objects into a sort of ("Vertical tower")
//				push() to add to top.
//				pop() to remove from top.
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("Terraria");
		stack.push("Genshin Impact");
		stack.push("Honkai Star Rail");
		stack.push("Splitgate");
		
//		stack.pop();
		
//		System.out.println(stack.empty());
		
//		String games = stack.pop();
//		System.out.println(games);				
		
//		Another way for above code is as follows :-
//		System.out.println(stack.peek());		// Prints the same output as above.
		
//		System.out.println(stack.search("Terraria"));		// Prints the position NOT THE INDEX!
//		System.out.print(stack.search("tModloader"));		// Returns -1 when not found.
		
//		Uses of Stacks :-
//		1. Undo/Redo features in the text editors.
//		2. Moving Back/Forward in browser history.
//		3. Backtracking Algorithm (maze, file directories)
//		4. Calling functions (call stack)
	}
}
