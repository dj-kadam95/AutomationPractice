package apr04_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A04_copy_in_reverse_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the size of array :");
		int c = sc.nextInt();

		int[] d = new int[c];
		int[] e = new int[d.length];

		for (int i = 0, j = c - 1; i < c; i++, j--) {

			System.out.println("Enter value of index : " + i);
			d[i] = sc.nextInt();
			e[j] = d[i];

		}

		System.out.println("Array of d : " + Arrays.toString(d));
		System.out.println("Array of e : " + Arrays.toString(e));
		sc.close();

		for (int i = 0, j = c - 1; i < c; i++, j--) {

			e[j] = d[i];
			
		}
		System.out.println("Array of d : " + Arrays.toString(d));
		System.out.println("Array of e : " + Arrays.toString(e));

	}

}