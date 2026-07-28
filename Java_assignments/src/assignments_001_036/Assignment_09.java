package assignments_001_036;

public class Assignment_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on logical operators with AND, OR, AND-NOT and Or-not

		int a = 20;
		int b = 20;
		int c = 20;
		int d = 44;

//		1. AND

		if (a == b && b == c) {

			System.out.println("AND Operator");
		}

		if (a > 15 || d > 50) {

			System.out.println("OR operartor");
		}

		if (!(a != b && b != c)) {

			System.out.println("NOT AND Operator");
		}

		if (!((a < 15) || (d > 55))) {

			System.out.println("NOT OR operartor");
		}

	}

}
