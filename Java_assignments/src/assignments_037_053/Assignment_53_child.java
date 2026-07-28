package assignments_037_053;

public class Assignment_53_child implements
Assignment_53_interface_parent1, Assignment_53_interface_parent2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on multiple level inheritance
		
		Assignment_53_child mo = new Assignment_53_child();
		System.out.println("add "+mo.addition(10, 15)); 
		System.out.println("sub "+mo.subtract(45, 15)); 
		System.out.println("multi "+mo.mul(15, 15)); 
		System.out.println("div "+mo.div(45, 15)); 
	
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
