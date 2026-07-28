package assignments_091_107;

import java.util.ArrayList;
import java.util.List;

public class Assignment_092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on list concept using its methods

		List<String> list = new ArrayList<String>();

		list.add("2");
		list.add("abcd");
		list.add("efgh");
		list.add("ASDTF");
		
		System.out.println("List           "+list);
		list.add("ijkl");
		System.out.println("Add            "+list);
		
//		addAll method

		List<String> c2 = new ArrayList<>();
		
		c2.addAll(list);
		c2.add(1,"Yogesh");
		System.out.println("Add All         "+c2);

//		contains method		

		boolean b1 = c2.contains("vishal");
		System.out.println("Contains        "+b1);
		boolean b2 = c2.containsAll(list);
		System.out.println("ContainsAll     "+b2);
		boolean b3 = list.containsAll(c2);
		System.out.println("ContainsAll     "+b3);

//		remove

		System.out.println("                "+c2);
		c2.remove("Yogesh");
		System.out.println("remove          "+c2);

//		removeAll

		c2.add("Yogesh");
		c2.removeAll(list); 
		System.out.println("removeAll       "+c2);

//	    isEmpty

		boolean b4 = c2.isEmpty();
		System.out.println("IsEmpty         "+ b4);

//		clear

		c2.clear();
		System.out.println("clear            "+c2);

//		equals

		boolean b5 = c2.equals(list);
		System.out.println("equals           "+b5);
			
//	     size

		int d = list.size();
		System.out.println("sizeOfList        "+d);
		
	}

}
