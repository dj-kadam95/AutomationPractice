package assignments_001_036;

public class Assignment_17 extends Assignment_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to call Constructor with parameter and without parameter
		
		new Assignment_17();
		new Assignment_17(200);
		
	}

	Assignment_17(){
		super(300);
		System.out.println("\ndefault/non-parameterized constructor");
	
	}
	
	Assignment_17(int a){
		
		System.out.println("\nparameterized constructor "+a);
		
	}
}
