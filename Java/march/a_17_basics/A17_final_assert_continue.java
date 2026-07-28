package a_17_basics;

public class A17_final_assert_continue {

	final static int a = 28;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. final
		
		System.out.println(a);
       final int a=24;
      // a=23;   can not initialized again
       System.out.println(a);
		
//		2. assert

		int age = 19;
		assert age >= 18;

		System.out.println("lets vote");

//		int age1 = 17;
//		assert age1>=18:"error msg --- can't vote" ;
//		
//		System.out.println("lets vote");

//		3. continue 

		for (age = 0; age <= 100; age++) {

			if (age > 17) {
				continue;
			}

			System.out.println(age + " cant vote");
		}

		for (age = 0; age <= 100; age++) {

			if (age < 18) {
				continue;
			}
			System.out.println(age + " can vote");

		}
	}
}
