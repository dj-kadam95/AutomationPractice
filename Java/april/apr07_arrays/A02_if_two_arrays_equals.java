package apr07_arrays;

import java.util.Arrays;

public class A02_if_two_arrays_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a[] = new char[3];
		a[0] = 'a';
		a[1] = 'c';
		a[2] = 'b';
		
	    char b[] = new char[3];
		b[0] = 'b';
		b[1] = 'c';
		b[2] = 'a';
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean b1 = Arrays.equals(a, b);
		System.out.println(b1);
		
		if(b1==true) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
			
		}
		
	}

}
