package assignments_072_90;

public class Assignment_86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on StringBuffer using Append, insert, Delete,substring
//		reverse, capacity, replace
		
		StringBuffer s1 =  new StringBuffer("Dhananjay");
		
		s1.append(" Kadam");
		System.out.println("append Kadam      : "+s1);

		s1.insert(9," Nagnathrao");
		System.out.println("insert Nagnathrao : "+s1);
		
		s1.delete((s1.length())-5,(s1.length())+1);
		System.out.println("delete Kadam      : "+s1);
		
		String s2 =s1.substring(0, 9);
		System.out.println("subString         : "+s2);
		
		StringBuffer s3 =  new StringBuffer(s2);
		s3.reverse();
		System.out.println("reverse Dhananjay : "+s3);
		
		int cap=s3.capacity();
		System.out.println("capacity s3       : "+cap);
		
		s3.replace(0, 9, s2);
		System.out.println("replace yajnanahD : "+s3);
		
	}

}
