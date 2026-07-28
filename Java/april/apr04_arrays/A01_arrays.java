package apr04_arrays;

import java.util.Arrays;

public class A01_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		declaring Array of Strings

//		type 1 :

//		String[] names = new String[7];

//		type 2 :

		String names[] = new String[7];

		names[0] = "Dhananjay";
		names[1] = "Yogesh";
		names[2] = "Vaishnavi";
		names[3] = "Sarita";
		names[4] = "Vishal";
		names[5] = "Jivan";
		names[6] = "Harsh";
		
		System.out.println(names.length);
		
//		for (int i = 0; i <= 6; i++) {
//
//			System.out.println(names[i]);
//		}
		String a =Arrays.toString(names);
		System.out.println(a);
		
//		declaring Array of boolean
		
		boolean ans[] = new boolean[2];

		ans[0] = false;
		ans[1] = true;
		
		
		for (int i = 0; i <= 1; i++) {

			System.out.println(ans[i]);
		}

	}

}
