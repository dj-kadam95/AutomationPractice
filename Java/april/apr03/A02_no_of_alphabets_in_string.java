package apr03;

public class A02_no_of_alphabets_in_string {

	static int countNumber1 = 0;
	static int countSpace1 = 0;
	static int countAlpha1 = 0;
	static int countSpacialChars1 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "abc111 2st 45f t @%&  ";
		char[] b = a.toCharArray();
		System.out.println(a.length());

		int countNumber = 0;
		int countSpace = 0;
		int countAlpha = 0;
		int countSpacialChars = 0;
//		
		// System.out.println(Arrays.toString(b));

		for (int i = 0; i <= 21; i++) {

			boolean b1 = Character.isAlphabetic(b[i]);
			boolean b2 = Character.isSpaceChar(b[i]);
			boolean b3 = Character.isDigit(b[i]);

			if (b1 == true) {
				// System.out.println(b1);
				countAlpha++;
			} else if (b2 == true) {
				countSpace++;
			} else if (b3 == true) {
				countNumber++;
			} else {
				// System.out.println(b1);
				countSpacialChars++;
			}

			if (b1 == false && b2 == false && b3 == false) {
				// System.out.println(b1);
				countSpacialChars1++;
			}

			if (b1 == false && b2 == false && b3 == true) {
				// System.out.println(b1);
				countNumber1++;
			}
			if (b1 == false && b2 == true & b3 == false) {
				// System.out.println(b1);
				countSpace1++;
			}

			if (b1 == true) {
				// System.out.println(b1);
				countAlpha1++;
			}

		}
		System.out.println("countNumber " + countNumber + " countSpace " + countSpace + " countAlpha " + countAlpha
				+ " countSpacialChars " + countSpacialChars);

		System.out.println("countNumber " + countNumber1 + " countSpace " + countSpace1 + " countAlpha " + countAlpha1
				+ " countSpacialChars " + countSpacialChars1);
	}

}
