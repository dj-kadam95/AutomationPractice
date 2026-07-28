package apr07_arrays;

import java.util.Arrays;

public class A03_if_two_strings_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "racer";
		String b = "carer";

//		we can check it in two ways
//		1. by checking whether length is same or not

		char c[] = a.toCharArray();
		char d[] = b.toCharArray();

		Arrays.sort(c);
		Arrays.sort(d);

		boolean b1 = Arrays.equals(c, d);
		System.out.println(b1);

		if (a.length() == b.length()) {

			System.out.println("anagram length");
			if (b1 == true) {
				System.out.println("anagram sort");
			}
		} else {
			System.out.println("not anagram");
		}
//		2. by sorting the array

		Arrays.sort(c);
		Arrays.sort(d);

		boolean b2 = Arrays.equals(c, d);
		System.out.println(b2);

		if (b2 == true) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");

		}

	}

}
