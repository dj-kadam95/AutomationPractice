package a_18_Inheritance_SLI;

class Nonstatic_parent
 {
	void add() {
		
		System.out.println("add");
	}
	
    void sub() {
		
		System.out.println("sub");
	}
}

public class A18_SLI_non_static_child extends Nonstatic_parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A18_SLI_non_static_child ob = new A18_SLI_non_static_child();
		Nonstatic_parent ob1= new Nonstatic_parent();
		ob.add();
		ob1.sub();
		ob.mul();
		ob.div();

	}
	
    void mul() {
		
		System.out.println("mul");
	}
	
    void div() {
		
		System.out.println("div");
	}

}
