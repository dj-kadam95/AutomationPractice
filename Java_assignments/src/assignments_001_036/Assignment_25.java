 package assignments_001_036;

import java.util.Scanner;

public class Assignment_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to print Area of Circle using Scanner Class

		Scanner s1 = new Scanner(System.in);
		
		System.out.print("radius of circle is : ");
		double d = s1.nextDouble();
		
		double Sqr_Of_d = Math.pow(d,2);
		double Pi=Math.PI;
		
		System.out.println("\nvalue of pi is : "+Pi);
		
		double AoC = Pi*Sqr_Of_d;
		
		System.out.println("\nArea of Circle is : "+AoC);
		s1.close();
	}

}
