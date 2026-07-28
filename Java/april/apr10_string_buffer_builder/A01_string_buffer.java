package apr10_string_buffer_builder;

public class A01_string_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s1 = new StringBuffer("Dhananjay Kadam");
	
		s1.insert(10, "Nagnathrao ");
		System.out.println(s1);
	
		s1.replace(21, 26, "Deshmukh");
		System.out.println(s1);
		
		System.out.println(s1.substring(21));

		s1.replace(0, 29, "madak yajnanahD");
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		
		s1.delete(10, 16);
		System.out.println(s1);
	}

}
