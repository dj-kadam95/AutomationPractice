package assignments_060_071;

import java.util.Arrays;

public class Assignment_65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program to terminate any program using throw keyword

		int[] a = new int[4];
		a[0] = 33;
		a[1] = 87;
		a[2] = 55;
		a[3] = 89;

		System.out.println(Arrays.toString(a));

		throw new ArrayIndexOutOfBoundsException();


	}

}
