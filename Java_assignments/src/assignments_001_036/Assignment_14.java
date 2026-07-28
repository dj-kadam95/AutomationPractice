package assignments_001_036;

public class Assignment_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  WAP with combination of 4 non static parameterized methods and try calling all of them

		Assignment_14 object = new Assignment_14();

		object.add(32, 55);
		object.sub(49, 37);
		object.mul(15, 15);
		object.div(40,2);

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

	void div(int a, int b) {

		int div = a / b;
		System.out.println(div);
	}
}
