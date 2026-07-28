package assignments_001_036;

public class Assignment_36 {
	
	static String name = "Dhananjay";
	String Sname = "kadam";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WAP to update static and non static global variable
		
		Assignment_36 ab= new Assignment_36();
		add();
		ab.sub();
	}

	static void add() {
		name = "DJ";
		Assignment_36 ab= new Assignment_36();
		ab.Sname = "Deshmukh";
		System.out.println(name.concat(" "+ab.Sname));
	}
	
	void sub() {
		name="Yogesh";
		Sname="Kadam";
		System.out.println(name.concat(" "+Sname));
	}
}
