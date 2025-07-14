package collection_Framework;
/*WAJP to create a collection and remove 
 * all the elements other than Integer from the collection
 */

import java.util.ArrayList;
import java.util.*;

public class question10 {
    public static void main(String[] args) {
    	ArrayList s1 =new ArrayList();
		s1.add(67);
		s1.add(63);
		s1.add(62);
		s1.add(61);
		s1.add("erf");
		s1.add(59);
		Iterator s=s1.iterator();
		while(s.hasNext()) {
			Object ob=s.next();
			if(!(ob instanceof Integer))
			s.remove();
		}
		System.out.println("only integer is used list"+s1);
    }
}
