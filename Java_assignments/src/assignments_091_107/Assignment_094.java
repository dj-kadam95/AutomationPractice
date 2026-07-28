package assignments_091_107;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment_094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to iterate a list using list iteratror
		
		List<String> c1 = new ArrayList<>();// upcasting

		c1.add("Yogesh");
		c1.add("Vaishnavi");
		c1.add("Harsha");
		c1.add(null);
		c1.add(null);
		c1.add("DJ");
		c1.add("Sarita");
		System.out.println(c1);
		
		ListIterator<String> b = c1.listIterator();

		boolean b6 = b.hasNext();
		System.out.println(b6);

		while (b.hasNext() == true) {
			String d = b.next();
			System.out.println(d + " forword");

		}

		System.out.println("");

		while (b.hasPrevious() == true) {
			String d = b.previous();
			System.out.println(d + " backword");

		}	
		
	}

}
