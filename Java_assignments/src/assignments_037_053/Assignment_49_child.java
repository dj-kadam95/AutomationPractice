package assignments_037_053;

public class Assignment_49_child extends Assignment_49_abstract_parent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on abstract class & abstract methods
		
		Assignment_49_child mo = new Assignment_49_child();
		System.out.println("add "+mo.addition(25, 15)); 
		System.out.println("sub "+mo.subtract(25, 15)); 
	
	}

	@Override
	int addition(int a, int b) {
		// TODO Auto-generated method stub
		int sum=a+b;
		return sum;
	}

	@Override
	int subtract(int a, int b) {
		// TODO Auto-generated method stub
		int sub=a-b;
		return sub;
	}

}
