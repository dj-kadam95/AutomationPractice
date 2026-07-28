package assignments_091_107;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Assignment_105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to iterate a Map using iteratror

		Map<String, Integer> m = new HashMap<>();

		m.put("mouse", 15); // put method
		m.put("keyboard", 18);
		m.put("monitor", 19);
		m.put("cpu", 19);

		System.out.println(m);

		System.out.println("\nIterate through keys using keyset\n");

		for (String s : m.keySet()) {
			System.out.println(s);
		}

		System.out.println("\nIterate through values using values\n");

		for (int s : m.values()) {
			System.out.println(s);
		}

		System.out.println("\nIterate through key value pair using entrySet\n");

		for (Entry<String, Integer> s : m.entrySet()) {
			System.out.println(s);
		}

		System.out.println("\nIterate using Iterator\n");

		Set<Entry<String, Integer>> s4 = m.entrySet();

		Iterator<Entry<String, Integer>> s5 = s4.iterator();

		while (s5.hasNext()) {

			Entry<String, Integer> s6 = s5.next();
			System.out.println(s6);

		}
	}

}
