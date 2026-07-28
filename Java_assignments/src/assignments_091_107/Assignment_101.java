package assignments_091_107;

import java.util.HashMap;
import java.util.Map;

public class Assignment_101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on Map using methods like get(), containsKey(),
//		containsValue, putIfAbsent, equals 
		
		Map<String, String> map1 = new HashMap<>();

		map1.put("name", "Dhananjay");
		map1.put("City", "Parbhani");
		map1.put("City", "Palam");
		map1.put("district", "Parbhani");
		System.out.println("map1 "+map1);

		Map<String, String> map2 = new HashMap<>();

		map2.put("name", "Dhananjay");
		map2.put("City", "aParbhani");
		map2.put("district", "Parbhani");

		System.out.println("map2 "+map2);
		
		String s =map1.get("name");       //get
		System.out.println("name = "+s);
		
		boolean b2 = map1.containsKey("name"); //containsKey
		boolean b3 = map2.containsValue("aParbhani"); //containsValue
		System.out.println(b2+" "+b3);
		
		map2.putIfAbsent("sname", "Kadam");
		System.out.println(map2);      //putIfAbsent method
		
		boolean b = map1.equals(map2);    //equals
		System.out.println("map1==map2 "+b);
			
	}

}
