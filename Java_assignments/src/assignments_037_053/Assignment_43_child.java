package assignments_037_053;

public class Assignment_43_child extends Assignment_43_constructor1 {
	
	Assignment_43_child(int a){
		
		super(1);
		System.out.println("parameterized constrctor_"+a);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on super calling statement using non parameterized 
//		super calling statement
		
		new Assignment_43_child(0);
		
	}
	

}
