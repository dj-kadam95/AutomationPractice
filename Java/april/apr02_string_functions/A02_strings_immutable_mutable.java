package apr02_string_functions;

public class A02_strings_immutable_mutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "shirt";
		       s1.concat("white");
		       System.out.println(s1);
		       //immutable
		       
		StringBuilder s2 = new StringBuilder("shirt");  
		              s2.append(" white");
		              System.out.println(s2);
		              //mutable
		              
		              


	}

}
