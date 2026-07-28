package a_20_OOPS;

public class A05_method_overriding extends A06_method_overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A05_method_overriding a = new A05_method_overriding();
		a.addition(3, 7); // parent class method gets overridden

	}

	public void addition(int a, int b) {

		super.addition(7, 9);
		int sub = a - b;
		System.out.println(sub);
	}

}