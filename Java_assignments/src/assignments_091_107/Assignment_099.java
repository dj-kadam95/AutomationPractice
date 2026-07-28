package assignments_091_107;

import java.util.HashMap;
import java.util.Map;

public class Assignment_099 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on map concept using its methods
		
		Map<String, String> m = new HashMap<>();

		m.put("name", "Dhananjay");  //put method
		m.put("City", "Parbhani");
		m.put("City", "Palam");
		m.put("district", "Parbhani");
		System.out.println("m "+m);

		Map<String, String> m1 = new HashMap<>();

		m1.put("name", "Dhananjay");
		m1.put("City", "aParbhani");
		m1.put("City", "Palam");
		m1.put("district", "Parbhani");

		System.out.println("m1 "+m1);
		boolean b = m.equals(m1);    //equals
		System.out.println(b);

		Map<String, String> m2 = new HashMap<>();
		
		m2.putAll(m1);               //putAll method
		System.out.println("m2 "+m2);
		
		m2.putIfAbsent("sname", "Kadam");
		System.out.println(m2);      //putIfAbsent method
	
		m2.clear();					 //clear method
		boolean b1 = m2.isEmpty();   //isEmpty method
		System.out.println(b1);
		
		boolean b2 = m1.containsKey("name"); //containsKey
		boolean b3 = m1.containsValue("aParbhani"); //containsValue
		System.out.println(b2+" "+b3);
		
		m1.replace("City", "Parbhani");   //replace key's value
		System.out.println("m1 "+m1);
		
		m1.replace("City", "Parbhani", "Manwath");   
		//replace key's value with other value
		System.out.println("m1 "+m1);
		
		m1.remove("district");   //remove key & its value too
		m1.remove("City", "Manwath");   //remove key along with value
		System.out.println("m1 "+m1);
		
		String s =m1.get("name");   //get
		System.out.println(s);
		
	}

}
