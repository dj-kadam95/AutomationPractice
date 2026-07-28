package apr08;

public class A02_mutable_string_buffer_builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s1 =new StringBuffer(13);
		StringBuffer s2 =new StringBuffer("Dhananjay");
		StringBuffer s3 =new StringBuffer(10);
		s1.append("123879987");
		s3.append("123456789876543212334888888"+"kk");
		
		System.out.println(s1.length());
		System.out.println(s2);
		System.out.println(s1.capacity());
		System.out.println(s1.reverse());

	}

}
