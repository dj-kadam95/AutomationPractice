package a_18_Inheritance_SLI;

public class A18_child extends A18_parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A18_child c = new A18_child();
		
		add();
		sub();
		mul();
		div();
		c.addition();
		c.subtract();
		c.multi();
		c.divison();
		
		A18_parent p = new A18_parent();
		add();
		sub();
		p.addition();
		p.subtract();
	
		

	}

	   static void mul() {
			
			System.out.println("mul");
		}
		
	    static void div() {
			
			System.out.println("div");
		}
	    
	    void multi() {
			
			System.out.println("multi");
		}
		
	    void divison() {
			
			System.out.println("division");
		}

}
