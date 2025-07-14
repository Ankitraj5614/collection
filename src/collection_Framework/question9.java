package collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

/*WAJP to create a collection and print 
 * the largest String and smallest String available in collection.
 * */
public class question9 {

	public static void main(String[] args) {
		
		System.out.println(" Start main method .......");
		ArrayList<String> al = new ArrayList<>();

		al.add("rsf");
		al.add("gssd");
		al.add("rgrgr");
		al.add("gfsv");
		al.add("srv");
		al.add("srgtv");
		al.add("gvvrsc");
		
		String biggest = al.get(0);
		String smallest = al.get(0);
		
		for(String x : al)
		{
			if(x.length()>biggest.length())
				biggest=x;
			
			else if(x.length()<smallest.length())
				smallest=x;
		}
		
		System.out.println( biggest +" has biggest length = "+ biggest.length());
		System.out.println( smallest +" has biggest length = "+ smallest.length());
		
		
	}

}
