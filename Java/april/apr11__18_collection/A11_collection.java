package apr11__18_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class A11_collection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		upcasting
//		converting child class object into suiper class object
		
//		Object o1 = new A11_collection(); //implicite upcasting
//		Object o2 = (Object) new A11_collection(); //explicite upcasting
		
//		A11_collection a1 =new A11_collection();
		
		Collection c1 = new ArrayList();
//		properties of only collection interface
		
//		ArrayList<Integer> a= new ArrayList<>();
		c1.add("abcd");
		c1.add(123);
		c1.add(2);
		c1.add(4);
		c1.add("abcd");
		
		System.out.println("Heterogeneous values : "+c1);
		
		List c2 = new ArrayList();
		
		c2.add("abcd");
		c2.add("1234");
		c2.add("344");
		c2.add("Avcd");
		c2.add("ABbd");
		
		Collections.sort(c2);
		System.out.println(c2);
		

	}

}