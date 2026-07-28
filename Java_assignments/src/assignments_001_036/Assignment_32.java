package assignments_001_036;

import java.util.Scanner;

public class Assignment_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to print Circumference of Rectangle using Scanner Class
		
//		2(a+b)
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("length of rectangle : ");
		double l = s1.nextDouble();
		
		System.out.print("\nwidth of rectangle : ");
		double w = s1.nextDouble();
		
		double CircumOfRect = 2*(l+w);
		
		System.out.println("\nArea of rectangle is : "+CircumOfRect);
		s1.close();
		
	}

}
