package collection_Framework;
//WAJP to create a collection and print all the odd Integer elements of the collection.

import java.util.ArrayList;
import java.util.Collection;

public class question4 {

	public static void main(String[] args) {

		Collection<Integer> s1 =new ArrayList<>();
		s1.add(67);
		s1.add(63);
		s1.add(62);
		s1.add(61);
		s1.add(60);
		s1.add(59);
		s1.stream().filter(n->n%2==1).forEach(n->System.out.println(n));

	}

}
