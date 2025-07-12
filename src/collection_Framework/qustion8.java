package collection_Framework;
/*
 * WAJP to create a collection of Strings and
 *  print the length of each String available in collection*/
import java.util.ArrayList;
import java.util.Iterator;

public class qustion8 {

	public static void main(String[] args) {
		ArrayList  s1=new ArrayList<>();
		s1.add("dsgg");
		s1.add("sg");
		s1.add("gsg");
		s1.add(45);
		s1.add("sgs");
		s1.add("dsf");
		s1.add("2334");
		s1.stream().filter(n->n instanceof String).map(n->((String)n).length())
		.forEach(n->System.out.println(n));
		/*
		Iterator a=s1.iterator();
		while(a.hasNext()) {
			Object i=a.next();
			if(i instanceof String) {
				String str=(String) i;
			System.out.println(str.length());
			}
			}
			.filter(n->((String) n).length())
				.forEach(n->System.out.println(n));
			*/
	}

}
