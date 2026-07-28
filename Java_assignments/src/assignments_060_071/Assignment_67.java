package assignments_060_071;

public class Assignment_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WAP on below string functions
//		1. toUpperCase()
//		2. toLowerCase()
//		3. length()
//		4. charAt()
		
		String a = "hello";
		String b = a.toUpperCase();
		String c= b.toLowerCase();
		
		System.out.println("toUpperCase --- "+b+" "+"\ntolowerCase --- "+c);
		
		int len=a.length();
		System.out.println("length --- "+len);
		
		char c1 = a.charAt(1);
		System.out.println("charAt --- "+c1);
	}
}
