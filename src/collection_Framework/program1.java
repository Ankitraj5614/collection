package collection_Framework;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection <Integer> s1=new ArrayList<>();
		s1.add(34);
		s1.add(40);
		s1.add(23);
		s1.add(39);
		s1.add(34);
		Iterator s=s1.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		
	}

}
