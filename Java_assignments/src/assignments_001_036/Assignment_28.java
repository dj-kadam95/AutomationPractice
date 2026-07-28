package assignments_001_036;

import java.util.Scanner;

public class Assignment_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to print Circumference of Triangle using Scanner Class
		
//		2a+b
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("length of side a, b, c is : ");
		double l = s1.nextDouble();
		
		double CoT1 = 3*l;
		double CoT2 =l+l+l;
		
		System.out.println("\nCircumference of Triangle is : "+CoT1);
		System.out.println("\nCircumference of Triangle is : "+CoT2);
		s1.close();
		
	}

}
