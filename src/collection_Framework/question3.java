package collection_Framework;

import java.util.ArrayList;
import java.util.Collection;

/* WAJP to create a collection and print 
 * all the even Integer elements of the collection.*/
public class question3 {
	public static void main(String[] args) {

		Collection<Integer> s1 =new ArrayList<>();
		s1.add(67);
		s1.add(63);
		s1.add(62);
		s1.add(61);
		s1.add(60);
		s1.add(59);
		s1.stream().filter(n->n%2==0).forEach(n->System.out.println(n));	
	}

}
