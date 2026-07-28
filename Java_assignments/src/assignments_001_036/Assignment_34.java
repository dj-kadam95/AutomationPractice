package assignments_001_036;

public class Assignment_34 {
	
	static String name;
	String Sname;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WAP for static and non static global variables and 
//		utilize them in both static and non static methods
		
		Assignment_34 ab= new Assignment_34();
		add();
		ab.sub();
	}

	static void add() {
		name = "Dhananjay";
		Assignment_34 ab= new Assignment_34();
		ab.Sname = "Kadam";
		System.out.println(name.concat(" "+ab.Sname));
	}
	
	void sub() {
		name="Shubham";
		Sname="Deshmukh";
		System.out.println(name.concat(" "+Sname));
	}
}
