package apr11__18_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A15_C_list_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> c1 = new ArrayList<>();// upcasting

//		1. add 

		c1.add("Yogesh");
		c1.add("Vaishnavi");
		c1.add("Harsha");
		c1.add(null);
		c1.add(null);
		c1.add("DJ");
		c1.add("Sarita");
		System.out.println(c1);
		
	

//		2. ListIterator

		ListIterator<String> b = c1.listIterator();

//		listIterator is one the methopd from interface
//		called ListIterator & interface consist only abstract methods

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

//		3. Iterator

		Iterator<String> a = c1.iterator();
		boolean b7 = a.hasNext();
		System.out.println(b7);
//		int b =a.next();
//		int c =a.next();
//		System.out.println(c+b);

		while (a.hasNext() == true) {
			String d = a.next();
			System.out.println(d);

		}
		
		Collections.sort(c1);
		System.out.println(c1);
	}

}
