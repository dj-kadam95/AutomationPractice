package apr25;

public class A01_typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;

		double b = a;           // widening implicitely

		System.out.println(b);

		double c = 4254.465;

		int d = (int) c;        // narrowing explicitely

		System.out.println(d);

		byte e = 12;

		int f = (byte) e;       // widening explicitely

		System.out.println(f);

		double g = 4254.465;

		float h = (float) g;    // narrowing explicitely

		System.out.println(h);
	}

}
