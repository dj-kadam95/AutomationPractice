package assignments_001_036;

public class Assignment_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP for Method overloading for static and non static method. 
		
		Assignment_16 b= new Assignment_16();
		
		add(10,29);
		b.add("dj", "kadam");
		
	}
		
		static void add(int a, int b) {
			
			System.out.println("additon Of integers "+(a+b));
			
	}

		void add(String a, String b) {
			
			System.out.println("String concatination "+a+" "+b);
			
		}
		
		Assignment_16(int a) {
			System.out.println("assignment 16");
		}

		 Assignment_16() {
			// TODO Auto-generated constructor stub
		}
}
