
package streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class javastreamEx {

	public static void main(String[] args) {
		List<product> pl=new ArrayList<product>();
		
		pl.add(new product(1,"hp",25000f));
		pl.add(new product(2,"Dell",30000f));
		pl.add(new product(1,"Apple",95000f));
		pl.add(new product(1,"lenova",15000f));
		
		List<Float> Pl2=pl.stream().filter(P->P.price>30000)
				.map(p->p.price)
				.collect(Collectors.toList());
				System.out.println(Pl2);

	}

}
