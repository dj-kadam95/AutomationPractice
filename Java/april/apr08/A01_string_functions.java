package apr08;

import java.util.Arrays;

public class A01_string_functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		string replace function
		
		String a = "automation tester";
		
		String b = a.replace('a', 'A');
		String c = a.replace("er", "");
		String d =c.replaceAll("te(.*)", "tester");
		String e =a.replaceFirst("a(.*) ", "api ");
		String f = b.replaceAll("[a-z]", "");
		
		System.out.println(b+"\n"+c+"\n"+d+"\n"+e+"\n"+f);

//     	String endsWith function
		
		boolean g = a.endsWith("ter");
		System.out.println(g);
		
//		String lastIndesOf function
		
		int h = a.lastIndexOf('a');
		System.out.println(h);
		
//		string Split function 
		
		String[] i = a.split(" ");
		String[] j = a.split("t",5);
		String i1 = i[0].toString();
		String j1=Arrays.toString(j);
		
		System.out.println(i1 +" "+j1);
		
	}

}
