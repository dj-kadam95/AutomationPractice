package apr04_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A03_copy_aaray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char a[] = new char[3];
		a[0] = 'a';
		a[1] = 'b';
		a[2] = 'c';

		// String s1 = Arrays.toString(c);
		char b[] = new char[a.length];

		for (int i = 0; i < a.length; i++) {

			b[i] = a[i];
		}
		System.out.println("Array of a : " + Arrays.toString(a));
		System.out.println("Array of b : " + Arrays.toString(b));

//		using scanner class

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the size of array :");
		int c = sc.nextInt();

		int[] d = new int[c];
		int[] e = new int[d.length];

		for (int i = 0; i < c; i++) {

			System.out.println("Enter value of index : " + i);
			d[i] = sc.nextInt();
			e[i] = d[i];

		}
		System.out.println("Array of d : " + Arrays.toString(d));
		System.out.println("Array of e : " + Arrays.toString(e));

		sc.close();
	}
}
