
package collections;
import java.util.TreeSet;



public class Treeset {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();

        set.add("Banana");
        set.add("Apple");
        set.add("Orange");
        set.add("Apple"); // duplicate ignored

        System.out.println(set); // sorted order
    }
	}


