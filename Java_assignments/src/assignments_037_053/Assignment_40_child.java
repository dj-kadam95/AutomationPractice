package assignments_037_053;

public class Assignment_40_child extends Assignment_40_parent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on multilevel inheritance

		Assignment_40_child child = new Assignment_40_child();

		child.a(); //child class
		child.ab(); // parent_1 class
		child.abc(); // parent_2 class

	}

	void a() {

		System.out.println("child");
	}

}
