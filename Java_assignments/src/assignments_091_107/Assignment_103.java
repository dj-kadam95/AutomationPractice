package assignments_091_107;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class Assignment_103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to fetch all the values present in the map
		
		Map<String, String> map1 = new HashMap<>();

		map1.put("name", "Dhananjay");
		map1.put("City", "Parbhani");
		map1.put("City", "Palam");
		map1.put("district", "Parbhani");
		
		System.out.println("map1 "+map1+"\n");
		
		Collection<String> Values= map1.values();
		
		System.out.println("Values = "+Values);
		
		
	}

}
