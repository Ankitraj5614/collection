package collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

/*WAJP to create a collection and print 
 * the largest String and smallest String available in collection.
 * */
public class question9 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("3454");
		al.add("rsf");
		al.add("gssd");
		al.add("rgrgr");
		al.add("gfsv");
		al.add("srv");
		al.add("srgtv");
		al.add("gvvrsc");
		Iterator a=al.iterator();
		while(a.hasNext()) {
		Object b= a.Next();
		if(b instanceof String) {
			String s=(String) b;
			
			if(s>s.length) {}
			/*// Find smallest string (lexicographically)
        String min = strings.stream().min(Comparator.naturalOrder()).get();

        // Find largest string (lexicographically)
        String max = strings.stream().max(Comparator.naturalOrder()).get();

        System.out.println("Smallest String: " + min);
        System.out.println("Largest String: " + max);*/
			
		}
		}
	}

}
