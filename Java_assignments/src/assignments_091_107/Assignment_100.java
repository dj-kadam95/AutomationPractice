package assignments_091_107;

import java.util.Enumeration;
import java.util.Vector;

public class Assignment_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on Enumeration
		
		Vector<Integer> v = new Vector<>();

		v.addElement(23);
		v.addElement(2);
		v.addElement(55);
		v.addElement(79);
		
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) {
			
			int b = e.nextElement();
			System.out.println(b);
		}
		
	}

}
