package assignments_037_053;

public class Assignment_39_child extends Assignment_39_parent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on single level inheritance
		
		Assignment_39_child child = new Assignment_39_child();
		
		child.ab();  //child class
		child.abc(); //parent class
		
	}
	
	 void ab() {
		
		
		final int a = 29;
		System.out.println("child "+a);
	}

}
