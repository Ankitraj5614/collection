package StreamAPIProram;
import java.util.*;
public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {2,3,43,445,34,56,67,67};
        //	a.Arrays.stream(a).distinct().toArray();
		
		Arrays.stream(a).forEach(n->System.out.println(n+" "));
	}

}
