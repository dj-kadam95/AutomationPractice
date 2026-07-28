package assignments_001_036;

public class Assignment_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a Program on nested if Else Block

		int a = 20;
		int b = 23;
		int c = 44;
		
//	----------------------------------------------------------------------

		if (a < b) {
			if (b < c) {
				System.out.println("b is less than c ");
			} else {
				System.out.println("c is greater than b");
			}

		} else {

			System.out.println("a is greater than b");
		}
//	---------------------------------------------------------------------
		if (a > b) {

			if (b > c) {
				System.out.println("b is less than c");
			} else {
				System.out.println("c is greater than b");
			}

		} else {

			if (a > c) {
				System.out.println("a is less than c");

			} else {
				System.out.println("c is greater than a");
			}

		}

	}

}
