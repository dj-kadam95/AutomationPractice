package apr11__18_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A18_A_map_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> m = new HashMap<>();

		m.put("mouse", 15); // put method
		m.put("keyboard", 18);
		m.put("monitor", 19);
		m.put("cpu", 19);
		System.out.println("m " + m);

		Map<String, Integer> m1 = new HashMap<>();

		m1.putAll(m);
		System.out.println("m1 " + m1);

		System.out.println("\nIterate through keys using keyset\n");

		// Set<String> s1 = m1.keySet();
		for (String s : m1.keySet()) {
			System.out.println(s);
		}

		System.out.println("\nIterate through values using values\n");

		// Collection<Integer> s2 = m1.values();
		for (int s : m1.values()) {
			System.out.println(s);
		}

		System.out.println("\nIterate through key value pair using entrySet\n");

		Set<Entry<String, Integer>> s3 = m1.entrySet();
		for (Entry<String, Integer> s : m1.entrySet()) {
			System.out.println(s);
		}
		System.out.println(s3);

		System.out.println("\nIterate using Iterator\n");

		Set<Entry<String, Integer>> s4 = m1.entrySet();

		Iterator<Entry<String, Integer>> s5 = s4.iterator();

		while (s5.hasNext()) {

			Entry<String, Integer> s6 = s5.next();
			System.out.println(s6);

		}
	}

}
