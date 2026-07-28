package assignments_054_055_058_AS1;

public class Assignment_54_access_specifier_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WAP on access specifiers within class for methods
		
		add();  //public
		sub();  //default
		div();  //private
		mul();  //protected

	}

	public static void add() {
		
		int a = 21;
		System.out.println(a);
		

	}

	static void sub() {
		
		System.out.println("efgh");
		

	}

	private static void mul() {
		
		System.out.println("ijkl");
		

	}

	protected static void div() {
		
		System.out.println("mnop");

	}

}
