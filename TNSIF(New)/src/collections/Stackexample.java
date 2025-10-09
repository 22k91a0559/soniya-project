package collections;
import java.util.Stack;



public class Stackexample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        System.out.println("Stack: " + stack); 

        System.out.println("Popped element: " + stack.pop());
        System.out.println("After pop: " + stack); 

        System.out.println("Top element: " + stack.peek());
        
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
		
		
	}

