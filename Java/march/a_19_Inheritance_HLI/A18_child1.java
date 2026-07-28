package a_19_Inheritance_HLI;

public class A18_child1 extends A18_parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A18_child1 c = new A18_child1();
		
		add();
		sub();
		c.multi();
		c.divison();
		
		A18_parent p = new A18_parent();
		add();
		sub();
		p.addition();
		p.subtract();
	
		

	}
	    
	    void multi() {
			
			System.out.println("multi");
		}
		
	    void divison() {
			
			System.out.println("division");
		}

}
