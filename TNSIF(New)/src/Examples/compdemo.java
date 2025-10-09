
package Examples;
import java.util.ArrayList;
import java.util.Collections;

public class compdemo {

	public static void main(String[] args) {
		ArrayList<comp> li = new ArrayList<comp>();
		li.add(new comp("dell",40400,15));
		li.add(new comp("hp",40700,16));
		li.add(new comp("asus",40600,17));
		Collections.sort(li);
		for(comp l:li)
		{
			System.out.println(l);
		}

	}

}
