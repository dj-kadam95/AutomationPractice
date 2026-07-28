package assignments_060_071;

public class Assignment_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WAP to reverse a string
		
		String e = "Y A J N A N A H D";
		System.out.println(e);
		
		String name="";
		char c1 = 0;
		
		for(int i=16; i>=0; i--) {
			
			c1 = e.charAt(i);
			name=name+c1;
		}
		System.out.println(name);
		
	}
}
