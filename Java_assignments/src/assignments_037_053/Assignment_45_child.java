package assignments_037_053;

public class Assignment_45_child extends Assignment_45_parent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on method overriding
		
		Assignment_45_child mo = new Assignment_45_child();
		System.out.println("addition "+mo.addition(12, 13)); 
		//parent method got overridden by child
		
		Assignment_45_parent mo1 = new Assignment_45_parent();
		System.out.println("subtraction "+mo1.addition(15, 10));
	
	}
	
	int addition(int a, int b) {
		
		int sum = a+b;
		return sum;
	}

}
