package assignments_001_036;

import java.util.Scanner;

public class Assignment_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to print Circumference of Circle using Scanner Class

		Scanner s1 = new Scanner(System.in);
		
		System.out.print("radius of circle is : ");
		long d = s1.nextLong();
		
		double diameter = Math.multiplyExact(d,2);
		System.out.println("\ndiameter of circle is : "+diameter);
		
		double Pi=Math.PI;
		System.out.println("\nvalue of pi is : "+Pi);
		
		double CoC = Pi*diameter;
		System.out.println("\nCircumference of Circle is : "+CoC);
		
		s1.close();
	}

}
