package a_17_basics;

import java.util.Scanner;

public class A13_scanner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);

		System.out.print("radius of circle is : ");
		double i =s1.nextDouble();
		
	    double square_of_radius=Math.pow(i, 2);
	    
	    double d1= Math.PI;
		System.out.println("\nvalue of PI is : "+d1);
		
		double area_of_circle = d1*square_of_radius;
		System.out.println("\n"+area_of_circle);
		
		System.out.print("\nMy name is : ");
		String name = s1.next();
		
		System.out.print("\nMy surname is : ");
		String sname = s1.next();
			
        String fullname=name.concat(" "+sname);   
        System.out.println("\nMy fullName is : "+fullname);
		s1.close();
		
//		 rect a*b
//		 sqare a*a
//		triangle 0.5*b*h
		

	}

}
