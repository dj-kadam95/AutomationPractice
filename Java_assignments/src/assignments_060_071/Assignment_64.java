package assignments_060_071;

import java.util.Arrays;

public class Assignment_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program on finally keyword concept

		try {

			int[] a = new int[3];
			a[0] = 33;
			a[1] = 87;
			a[2] = 55;
			a[3] = 89;

			System.out.println(a.toString());

		} catch (ArrayIndexOutOfBoundsException a) {

			System.out.println(a+"\n");

			int[] d = new int[3];

			d[0] = 33;
			d[1] = 87;
			d[2] = 55;
			d[3] = 55;

			System.out.println(Arrays.toString(d));

		} finally {

			int[] a = new int[3];
			a[0] = 3;
			a[1] = 7;
			a[2] = 5;

			System.out.println(Arrays.toString(a));
		}

	}

}
