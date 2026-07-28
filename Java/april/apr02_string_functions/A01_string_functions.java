package apr02_string_functions;

public class A01_string_functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. length
		
		String a = "hello";
		String a11 = "hello";
		int len=a.length();
		System.out.println("length "+len);
		
//		2. toUpperCase
//		3. tolowerCase
		
		String b = a.toUpperCase();
		String c= b.toLowerCase();
		System.out.println("toUpperCase "+b+" "+"\ntolowerCase "+c);
		
//		4. trim
		
		String d = "     DHANANJAY   ";
		System.out.println(d+"e");
		System.out.println("trim "+d.trim());
		
//		5. equals
		
		String e = "D H A N A N J A Y";
		boolean e1 = e.equals(d);
		System.out.println("equals "+e1);
		System.out.println("equals "+a.equals(c));
		System.out.println(a+" "+c);
		System.out.println("equals "+(a == a11)+" it");
		
//		6. equalsIgnorecase
		
		System.out.println("equalsIgnorecase "+a.equalsIgnoreCase(b));
		
//		7. contains
		
		boolean a1 = a.contains("ool");
		System.out.println("contains "+a1);

//		8. concat
		
		String name = "Dhananjay jay";
		String Sname= "kadam";
		System.out.println("concat "+name.concat(" "+Sname));
		
//		9. substring(begin index)
//		10. substring(begin index, ending index)
		
		String sub1 =name.substring(6);
		String sub2 = name.substring(0,6);
		
		System.out.println(sub2.concat(sub1));
		System.out.println("substring(6) "+name.substring(6));
		System.out.println("substring(0,6) "+name.substring(0,6));
		
//		11. charAt
		
		char c1 = name.charAt(0);
		System.out.println("charAt "+c1);
		
//		12. indexOf
		
		int c2 = name.indexOf("jay");
		System.out.println("indexOf "+c2);
		
//		13. lastIndexOf
		
		int c3 = name.lastIndexOf("jay");
		System.out.println("lastIndexOf "+c3);
		
//	    14. replaceAll ---> whatever string is getting replaced, should
//		    be a part of string defined or entire defined string
//		    & if not, then it wont get replaced
		
		String s1="12345";
		s1 = s1.replaceAll("abc", "1");
		System.out.println("replaceAll "+s1);
		s1 = s1.replaceAll("345", "1");
		System.out.println("replaceAll "+s1);
		
//		15. isEmpty -->true only if string is empty
		
		String s2="";
		boolean b1 = s1.isEmpty();
		boolean b2 = s2.isEmpty();
		System.out.println("isEmpty "+b1+" "+b2);
		
//		16. repeat
		System.out.println("repeat "+s1.repeat(3)+" "+b2);
		
		
		
		

	}

}
