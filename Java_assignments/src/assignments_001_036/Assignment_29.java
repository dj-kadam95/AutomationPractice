package assignments_001_036;

import java.util.Scanner;

public class Assignment_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to print Area of Square using Scanner Class
		
//		a^2
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("length of side a, b, c & d is : ");
		double l = s1.nextDouble();
		
		double AoS = Math.pow(l, 2);
	
		
		System.out.println("\nArea of square is : "+AoS);
		
		s1.close();
		
	}

}
