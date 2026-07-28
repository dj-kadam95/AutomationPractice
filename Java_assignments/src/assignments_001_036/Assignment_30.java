package assignments_001_036;

import java.util.Scanner;

public class Assignment_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to print Circumference of Square using Scanner Class
		
//		4*l
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("length of side a, b, c & d is : ");
		double l = s1.nextDouble();
		
		double CoS = 4*l;
		
		System.out.println("\nCircumference of square is : "+CoS);
		
		s1.close();
		
	}

}
