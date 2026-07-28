package assignments_001_036;

public class Assignment_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to call three non static method in the main method

		Assignment_12 object = new Assignment_12();

		object.add(32, 55);
		object.sub(49, 37);
		object.mul(11, 11);

	}

	void add(int a, int b) {

		int add = a + b;
		System.out.println(add);
	}

	void sub(int a, int b) {

		int sub = a - b;
		System.out.println(sub);
	}
	
	void mul(int a, int b) {

		int mul = a * b;
		System.out.println(mul);
	}
}
