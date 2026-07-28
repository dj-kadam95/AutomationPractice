package assignments_001_036;

public class Assignment_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a Program on If else Block
		
		String name = "Dhananjay";
		String surName = "Kadam";
		String name1="Dhananjay";
		
		if (name != surName) {

			String Fullname = name.concat(" " + surName);

			System.out.println(Fullname+" -- if block");
		} else {
			System.out.println("same strings");
		}

		if (name != name1) {

			String Fullname = name.concat(" " + surName);

			System.out.println(Fullname+" if block");
		} else {
			System.out.println("same strings -- else block");
		}

	}

}
