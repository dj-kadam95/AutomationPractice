package apr03;

public class Apr_01_palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to check if given string is palindrome or not?

		String e = "cb A B C D C B A bc";
		System.out.println(e.length());
		System.out.println(e);

		String name = "";
		char c1 = 0;

		for (int i =18 ; i >= 0; i--) {

			c1 = e.charAt(i);
			name = name + c1;
		}
		System.out.println(name);

		if (name.equals(e)) {

			System.out.println("\nits a palindrome string");

		} else {

			System.out.println("\nits not a palindrome string");
		}

	
	}
}
