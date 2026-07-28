package assignments_072_90;

public class Assignment_87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on StringBuilder using Append, insert, Delete,substring
//		reverse, capacity, replace
		
		StringBuilder s1 =  new StringBuilder("Yogesh");
		
		s1.append(" Kadam");
		System.out.println("append Kadam      : "+s1);

		s1.insert(6," Nagnathrao");
		System.out.println("insert Nagnathrao : "+s1);
		
		s1.delete((s1.length())-5,(s1.length())+1);
		System.out.println("delete Kadam      : "+s1);
		
		String s2 =s1.substring(0, 6);
		System.out.println("subString         : "+s2);
		
		StringBuffer s3 =  new StringBuffer(s2);
		s3.reverse();
		System.out.println("reverse Yogesh    : "+s3);
		
		int cap=s3.capacity();
		System.out.println("capacity s3       : "+cap);
		
		s3.replace(0, 7, s2);
		System.out.println("replace hsegoY    : "+s3);
		
	}

}
