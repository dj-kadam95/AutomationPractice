package assignments_091_107;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment_096 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to iterate a set using iteratror

		Set<Integer> s1 = new HashSet<>();

		s1.add(12);
		s1.add(2);
		s1.add(2);
		s1.add(4);
		s1.add(null);
		System.out.println(s1+"\n");

		Iterator<Integer> a = s1.iterator();
		boolean b7 = a.hasNext();
		System.out.println(b7+"\n");

		while (a.hasNext() == true) {
			
			Integer d = a.next();
			
			System.out.println(d);

		}

	}

}
