
package collections;
import java.util.LinkedList;

public class LLex{

	public static void main(String[] args) {LinkedList<String> list = new LinkedList<>();

    list.add("Apple");
    list.add("Banana");
    list.add("Orange");
    list.addFirst("Mango"); 
    list.addLast("Grapes"); 

    System.out.println("LinkedList: " + list); 

    // Removing elements
    list.removeFirst();
    list.removeLast();
    System.out.println("After removing first and last: " + list);

    // Access element
    System.out.println("Element at index 1: " + list.get(1)); 
		
	}

}
