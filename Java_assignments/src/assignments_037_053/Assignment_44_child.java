package assignments_037_053;

public class Assignment_44_child {
	
	Assignment_44_child(){
		
		this(2);
		System.out.println("constructor_3");
		
	}
	Assignment_44_child(int a){
		
		this("constructor_", 1);
		System.out.println("constructor_"+a);
		
	}
	Assignment_44_child(String a, int b){
		
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on this calling statement
		
		new Assignment_44_child();
		
	}
	

}
