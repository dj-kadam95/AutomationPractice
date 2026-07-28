 package assignments_001_036;

public class Assignment_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to check person can vote only if he/she is 18 or above
//		and should not vote if age is less.

		int age = 18;
		int age_of_A = 17;
		int age_of_B = 45;


		if (age_of_A>=age) {

			System.out.println("A can vote");
		} else {
			System.out.println("A can't vote");
		}
		
		if (age_of_B>=age) {

			System.out.println("B can vote");
		} else {
			System.out.println("B can't vote");
		}

	}

}
