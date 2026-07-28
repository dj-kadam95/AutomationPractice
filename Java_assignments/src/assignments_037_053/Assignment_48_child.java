package assignments_037_053;

public class Assignment_48_child extends Assignment_48_parent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to avoid method overriding using final method
		
		Assignment_48_child mo = new Assignment_48_child();
		System.out.println("add "+mo.addition(12, 13)); 
	
	}
	
	int addition1(int a, int b) {
		
		
		int sum = a+b;
		return sum;
		
	}

}
