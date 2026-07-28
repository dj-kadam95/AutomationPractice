package apr02_string_functions;

public class A03_reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "yajnanahD";
		String s2 ="";
		
		for(int i=8; i>=0; i--) {
			
			char c1 = s1.charAt(i);
			System.out.println(c1);
			s2=s2+c1;
			System.out.println(s2);
		}

	}

}
