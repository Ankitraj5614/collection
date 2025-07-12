package collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 
	WAJP to create a collection and print the largest integer 
	and smallest integer available in collection.

 * */

public class question7 {
	public static void main(String[] args) {
		ArrayList<Integer> s1=new ArrayList();
		s1.add(12);		s1.add(342);		s1.add(234);
		s1.add(11);		s1.add(3445);		s1.add(21);
		int max = s1.stream().max(Integer::compare).get();
        int min = s1.stream().min(Integer::compare).get();

        System.out.println("Using Stream API:");
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
		/*
		int big =Integer.MIN_VALUE,small=Integer.MAX_VALUE;
		Iterator<Integer> a=s1.iterator();
		while(a.hasNext()) {
		int n=a.next();
		if (n>big)
			big=n;
		else if(n<small)
			small=n;
		}
		System.out.println("Largest number is "+big);
		System.out.println("Smallest number is "+small);*/
	}
	
}
