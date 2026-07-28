package apr10_string_buffer_builder;

public class A01_string_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder s1 = new StringBuilder("Dhananjay Kadam");

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

		String s2 = "shirt";
		s2.concat("white");
		System.out.println(s2);
		// immutable

		StringBuilder s3 = new StringBuilder("shirt");
		s3.append(" white");
		System.out.println(s3);
		// mutable
	}

}
