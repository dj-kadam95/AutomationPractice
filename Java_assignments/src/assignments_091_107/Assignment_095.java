package assignments_091_107;

import java.util.HashSet;
import java.util.Set;

public class Assignment_095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WAP on Set concept using its methods

		Set<Integer> s1 = new HashSet<>();

//		1. add method

		s1.add(12);
		s1.add(2);
		s1.add(2);
		s1.add(4);
		s1.add(null);
		System.out.println("s1               "+s1);

		Set<String> s2 = new HashSet<>();
		s2.add("Dhananjay");
		s2.add("Dhananjay");
		s2.add("DJ");
		s2.add("Vaishnavi");
		s2.add("Harsha");
		s2.add(null);
		System.out.println("s2               "+s2);

		s2.add("ijkl");
		System.out.println("Add              "+s2);

//		addAll method

		Set<String> s3 = new HashSet<>();

		s3.addAll(s2);
		s3.add("Yogesh");
		System.out.println("AddAll_s3        "+ s3);

//		contains method		

		boolean b1 = s2.contains("vishal");
		System.out.println("Contains         "+ b1);
		boolean b2 = s3.containsAll(s2);
		System.out.println("ContainsAll      "+ b2);
		boolean b3 = s2.containsAll(s3);
		System.out.println("ContainsAll      "+ b3);

//		remove

		s3.remove("Yogesh");
		System.out.println("remove            "+s3);

//		removeAll

		s3.add("Yogesh");
		s3.removeAll(s2);
		System.out.println("removeAll         "+s3);

//	    isEmpty

		boolean b4 = s1.isEmpty();
		System.out.println("s1_IsEmpty        "+ b4);

//		clear

		s3.clear();
		System.out.println("clear_s3          "+ s3);

//		equals

		boolean b5 = s1.equals(s2);
		System.out.println("equals_s1==s2     "+ b5);

//	     size

		int d = s2.size();
		System.out.println("sizeOfList_s2      "+ d);

		
	}

}
