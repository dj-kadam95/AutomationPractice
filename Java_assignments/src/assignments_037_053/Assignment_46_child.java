package assignments_037_053;

public class Assignment_46_child extends Assignment_46_parent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on super keyword
		
		Assignment_46_child mo = new Assignment_46_child();
		System.out.println("add "+mo.addition(12, 13)); 
	
	}
	
	int addition(int a, int b) {
		
		System.out.println("subtract "+super.addition(15,10));
		int sum = a+b;
		return sum;
	}

}
