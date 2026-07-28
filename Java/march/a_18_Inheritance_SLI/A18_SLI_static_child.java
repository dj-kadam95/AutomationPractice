package a_18_Inheritance_SLI;

class parent 
 {
	static void add() {
		
		System.out.println("add");
	}
	
    static void sub() {
		
		System.out.println("sub");
	}
}

public class A18_SLI_static_child extends parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add();
		sub();
		mul();
		div();

	}
	
    static void mul() {
		
		System.out.println("mul");
	}
	
    static void div() {
		
		System.out.println("div");
	}

}
