package apr11__18_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A15_A_collection_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Integer> c1 = new ArrayList<>();
		
//		add method
		
		c1.add(123);
		c1.add(2);
		c1.add(4);
		System.out.println(c1);	
		
//		addAll method
		
		Collection<Integer> c2 = new ArrayList<>();
		c2.addAll(c1);
		System.out.println(c2);
		c2.add(5);
		System.out.println(c2);
		
//		contains method		
		
		boolean b1=c2.contains(5);
		System.out.println(b1);
		boolean b2=c2.containsAll(c1);
		System.out.println(b2);
		boolean b3=c1.containsAll(c2);
		System.out.println(b3);

//		remove
		
		c2.remove(5);
		System.out.println(c2);	
		
//		removeAll
		
		c2.add(78);
		c2.removeAll(c1);
		System.out.println(c2);	
		
//      isEmpty
		
		boolean b4=c2.isEmpty();
		System.out.println(b4);
		
//		clear
		
		c2.clear();
		System.out.println(c2);
		System.out.println(b4);
		
//		equals
		
		boolean b5=c2.equals(c1);
		System.out.println(b5);
		
//		Iterator
		
		Iterator<Integer> a = c1.iterator();
		boolean b6 =a.hasNext();
		System.out.println(b6);
//		int b =a.next();
//		int c =a.next();
//		System.out.println(c+b);
		int e=0;
		while(a.hasNext()==true) {
			int d =a.next();
			System.out.println(d);
			e =e+d; //0+123, 123+2 125+4
		    System.out.println(e);
			
		}
		
//      size
		
		int d = c1.size();
		System.out.println(d);
		
	}

}
