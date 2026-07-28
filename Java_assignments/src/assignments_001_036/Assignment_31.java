package assignments_001_036;

import java.util.Scanner;

public class Assignment_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to print Area of rectangle using Scanner Class
		
//		rect a*b
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("length of rectangle : ");
		double l = s1.nextDouble();
		
		System.out.print("\nwidth of rectangle : ");
		double w = s1.nextDouble();
		
		double AreaOfRect = l*w;
		
		System.out.println("\nArea of rectangle is : "+AreaOfRect);
		s1.close();
		
	}

}
