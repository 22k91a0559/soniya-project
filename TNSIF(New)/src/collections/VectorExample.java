package collections;
import java.util.Vector;


public class VectorExample {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(20); 

        System.out.println("Vector: " + v);

        v.remove(2); 
        System.out.println("After removal: " + v); 

        System.out.println("Element at index 1: " + v.get(1)); 
    }
	}

