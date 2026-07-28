package assignments_091_107;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment_102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to fetch all the keys present in the map
		
		Map<String, String> map1 = new HashMap<>();

		map1.put("name", "Dhananjay");
		map1.put("City", "Parbhani");
		map1.put("City", "Palam");
		map1.put("district", "Parbhani");
		
		System.out.println("map1 "+map1+"\n");
		
		Set<String> keys= map1.keySet();
		
		System.out.println("Keys = "+keys);
		
	}

}
