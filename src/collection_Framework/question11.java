package collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

/*WAJP to create a collection of integers and count
 *  and print all the prime numbers available in collection.
 */

public class question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a= new ArrayList<>();
		a.add(17);
		a.add(43);
		a.add(13);
		a.add(42);
		a.add(7);
		int count =0;
		Iterator<Integer> b=a.iterator();
		while(b.hasNext())
		{
			int n=b.next();
			if(getPrime(n))
				count++;
			else
				b.remove();
		}
		
		System.out.println("count the prime number "+count);
		System.out.println("count the prime number"+a);
		
	}

	public static boolean getPrime(int n) {
		if(n<=2)
			return false;
		else if(n==2||n==3)
			return true;
		else if(n%2==0)
			return false;
		int i=3;
		while(i*i<=n) {
			if(n%i==0)
				return false;
			i+=2;
		}
		return true;
	}

}
