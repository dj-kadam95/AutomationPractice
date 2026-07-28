package assignments_072_90;

public class Assignment_83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to count a number of Alphabets, spacial characters
//		spaces & numbers used in the given sting

		String s = "abcd@12  45A &";

		char[] str1 = s.toCharArray();
		System.out.println(str1.length);

		int alpha = 0;
		int sp_char = 0;
		int space = 0;
		int numbers = 0;

		for (int i = 0; i < 14; i++) {

			boolean b1 = Character.isAlphabetic(str1[i]);
			boolean b2 = Character.isSpaceChar(str1[i]);
			boolean b3 = Character.isDigit(str1[i]);

			if (b1 == true) {
				alpha++;
			} else if (b2 == true) {
				space++;
			} else if (b3 == true) {
				numbers++;
			} else {
				sp_char++;
			}
		}

		System.out.println("alphabets : " + alpha + "\nspacial characters : " + sp_char + "\nspace : " + space
				+ "\nnumbers : " + numbers);
	}

}
