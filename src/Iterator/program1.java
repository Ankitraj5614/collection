package Iterator;
import java.util.Iterator;
import java.util.ArrayList;

public class program1 {
	public static void main(String[] args) {
	ArrayList <Integer> n1 =new ArrayList<>();
	n1.add(3);
	n1.add(31);
	n1.add(322);
	n1.add(23);
	n1.add(2);
	Iterator <Integer> r=n1.iterator();
		while (r.hasNext()) {
			System.out.println(r.next());
		}
	}
}
