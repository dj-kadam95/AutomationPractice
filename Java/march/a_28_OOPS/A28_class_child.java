package a_28_OOPS;

public class A28_class_child implements A28_interface_parent1, A28_interface_parent2  {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A28_class_child c1 = new A28_class_child();
		c1.add();
		c1.subtract();
		c1.mul();
		c1.div();
		c1.mod();
		c1.percent();
	    System.out.println(a);

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		System.out.println("addition");
		
	}

	@Override
	public void subtract() {
		// TODO Auto-generated method stub
		
		System.out.println("subtraction");
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("multiply");
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("divide");
		
	}

	@Override
	public void mod() {
		// TODO Auto-generated method stub
		
		System.out.println("modulus");
		
	}

	@Override
	public void percent() {
		// TODO Auto-generated method stub
		
		System.out.println("%age");
		
	}

}
