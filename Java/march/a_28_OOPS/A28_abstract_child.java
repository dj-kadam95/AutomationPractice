package a_28_OOPS;

public class A28_abstract_child extends A28_abstract_case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A28_abstract_child c1 = new A28_abstract_child();
		c1.add();
		add(3);
		c1.mul();
		div("Dhananjay");

	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		
		System.out.println("abc");
		
	}

	@Override
	void mul() {
		// TODO Auto-generated method stub
		System.out.println("abcd");
		
	}

}
