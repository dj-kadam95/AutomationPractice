package a_19_Inheritance_HLI;

public class A18_child2 extends A18_parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A18_child2 b = new A18_child2();
		
		mul();
		div();
		b.addition();
		b.subtract();

	}
	
    static void mul() {
		
		System.out.println("mul");
	}
	
    static void div() {
		
		System.out.println("div");
	}

}
