package collection_Framework;
//WAJP to create a collection and print and count all the three digit integers available in collection.
import java.util.*;

public class question5 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(878);
		a.add(89);
		a.add(676);
		a.add(341);
		a.add(12);
		a.add(234);
		
		long count =a.stream().filter(n->n>99&&n<=999).count();
		System.out.println(count);
//		for(int x:a) {
//			if(x>99&&x<1000) {
//				System.out.println("Print all the three digit number element "+x);
//			count++;
//			}
	}

}
