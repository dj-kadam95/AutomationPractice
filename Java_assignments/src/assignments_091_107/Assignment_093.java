package assignments_091_107;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment_093 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to iterate a list using iteratror

		List<String> c1 = new ArrayList<>();// upcasting

		c1.add("Yogesh");
		c1.add("Vaishnavi");
		c1.add("Harsha");
		c1.add(null);
		c1.add(null);
		c1.add("DJ");
		c1.add("Sarita");
		System.out.println(c1+"\n");

		Iterator<String> it = c1.iterator();
		String s1 = "";
		for(int i=0; i<c1.size(); i++) {
			
		if (it.hasNext()) {
			s1 = it.next();
		}
		System.out.print(" "+s1);
		}

	}

}
