package assignments_091_107;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment_104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to fetch both keys & values present in the map
		
		Map<String, String> map1 = new HashMap<>();

		map1.put("name", "Dhananjay");
		map1.put("City", "Parbhani");
		map1.put("City", "Palam");
		map1.put("district", "Parbhani");
		
		System.out.println("map1 "+map1+"\n");
		
		Set<Entry<String, String>> keyValues= map1.entrySet();
		
		System.out.println("Key & values are\n\n"+keyValues);
		
	}

}
