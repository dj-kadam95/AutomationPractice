package assignments_001_036;

import java.util.Scanner;

public class Assignment_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WAP to print Area of Triangle using Scanner Class
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("base of triangle is : ");
		long b = s1.nextLong();
		
		System.out.print("\nheight of triangle is :");
		long h = s1.nextLong();
		
		double AoT = 0.5*b*h;
		System.out.println("\nArea of triangle is : "+AoT);
		s1.close();

	}

}
