package collection_Framework;
/*WAJP to create a collection and calculate 
 * sum of all the integer elements of collection.
 * */
import java.util.*;
public class question6 {

	public static void main(String[] args) {
		ArrayList<Integer> n1=new ArrayList<>();
		n1.add(34);
		n1.add(3);
		n1.add(345);
		n1.add(37);
		n1.add(123);
		int sum =n1.stream().filter(n->n instanceof Integer)
				.mapToInt(n->(Integer) n)
				.sum();
		System.out.println("Sum of all integer elemets: "+sum);
/*		int sum=0;
		Iterator<Integer> s=n1.iterator();
		while(s.hasNext()) {
			int h=s.next();
			sum +=h;
		}
		System.out.println("sum of all the collection is "+sum);//542
		*/
	}

}
