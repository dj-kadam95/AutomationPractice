package assignments_037_053;

public class Assignment_52_child implements Assignment_52_interface_parent1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on multilevel inheritance using interface concept
		
		Assignment_52_child mo = new Assignment_52_child();
		System.out.println("add "+mo.addition(54, 15)); 
		System.out.println("sub "+mo.subtract(50, 15)); 
		System.out.println("multi "+mo.mul(10, 10)); 
		System.out.println("div "+mo.div(60, 20)); 
	
	}

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		int sum=a+b;
		return sum;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		int sub=a-b;
		return sub;
	}

	@Override
	public int mul(int a, int b) {
		int mul = a * b;
		return mul;
	}

	@Override
	public int div(int a, int b) {
		int div = a / b;
		return div;
	}

}
