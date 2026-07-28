package assignments_001_036;

public class Assignment_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP with combination of static and non static methods and try calling both of them

		Assignment_13 object = new Assignment_13();

		object.add(32, 55);
		sub(49, 37);

	}

	void add(int a, int b) {

		int add = a + b;
		System.out.println(add);
	}

	static void sub(int a, int b) {

		int sub = a - b;
		System.out.println(sub);
	}
}
