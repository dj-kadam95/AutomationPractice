package a_17_basics;

public class A011_method_duplicates {

	/**
	 * 
	 */
	public A011_method_duplicates(int b) {
		
		System.out.println("const");
		
	}
	
    public A011_method_duplicates() {
		
		System.out.println("defailt const");
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A011_method_duplicates b = new A011_method_duplicates(2);
		A011_method_duplicates b1 = new A011_method_duplicates();
		
		// always follow above way of creating objects for calling non static methods
		
		//new A011_method_duplicates().add("dj");;
		add('b');
		add(99);
		b.add("dj");
		b1.add("gggg");
		

	}
	
//  1. method overloading -- same methods with different arguments
	
	static void add(int a) {
		
		System.out.println("method overloading 1");
	}

	static void add(char bb) {
		
		System.out.println("method overloading 2");

	}

	void add(String a) {
		
		System.out.println("method overloading 3");

	}
}
