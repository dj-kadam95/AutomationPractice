package a_18_Inheritance_MLI;

public class A18_MLI_child extends A18_MLI_parent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A18_MLI_child child = new A18_MLI_child();
		
		add();
		sub();
		mul();
		child.div();

	}

	static void add() {

		System.out.println("add_child");
	}

}
