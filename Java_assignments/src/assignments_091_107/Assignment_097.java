package assignments_091_107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment_097 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to sort a List
		
		List<String> list = new ArrayList<String>();

		list.add("2");
		list.add("abcd");
		list.add("efgh");
		list.add("ASDTF");
		
		System.out.println(list+" ---- Normal");
		
		Collections.sort(list);
		
		System.out.println(list+" ---- Sorted");
		
	}

}
