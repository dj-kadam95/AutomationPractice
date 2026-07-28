package apr21_oops;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A01_exception {

	public static void main(String[] args) throws InputMismatchException, NegativeArraySizeException {
		// TODO Auto-generated method stub

		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("enter the length of an array");
			int length = sc.nextInt();

			System.out.println(length);

			int[] a = new int[length];

			for (int i = 0; i < length; i++) {

				a[i] = sc.nextInt();
			}
			System.out.println(Arrays.toString(a));
			sc.close();

		} 
		
		catch (InputMismatchException b) {

			System.out.println(b + " please enter the valid length of an array ");
			Scanner sc = new Scanner(System.in);

			int length = sc.nextInt();

			int[] a = new int[length];

			for (int i = 0; i < length; i++) {

				a[i] = sc.nextInt();
			}
			System.out.println(Arrays.toString(a));

			sc.close();
		} 
		finally  {

			System.out.println( " please enter the positive length of an array ");
			Scanner sc = new Scanner(System.in);

			int length = sc.nextInt();

			int[] a = new int[length];

			for (int i = 0; i < length; i++) {

				a[i] = sc.nextInt();
			}
			System.out.println(Arrays.toString(a));

			sc.close();
		}

	}
	
}
