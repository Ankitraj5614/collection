package collection_Framework;
import java.util.Collection;
import java.util.ArrayList;
//WAJP to create a collection and print all the Integer elements of the collection.

public class program2 {

	public static void main(String[] args) {
		Collection s1 =new ArrayList();
		s1.add(67);
		s1.add(63);
		s1.add(62);
		s1.add(61);
		s1.add(60);
		s1.add("asd");
		for(Object x:s1) {
			if(x instanceof Integer)
		System.out.println("Print all the integer element : "+ x);
		}
	}
}
