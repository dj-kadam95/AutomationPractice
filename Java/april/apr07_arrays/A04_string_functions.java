package apr07_arrays;

public class A04_string_functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      String regex function		
		
		String a ="caac";
		boolean b= a.matches("....");
		System.out.println(b);
		
		boolean b1= a.matches("c(.*)");
		System.out.println(b1);
		
		boolean b2= a.matches("(.*)c");
		System.out.println(b2);
		
		String b3="manchester";
		String c="ironman";
		String d = "salmanKhan";
		
		boolean b4= b3.matches("man(.*)");
		boolean b5 =c.matches("(.*)man");
		boolean b6 =d.matches("(.*)man(.*)");
		
		System.out.println(b4+" "+b5+" "+b6);
		
	}

}
