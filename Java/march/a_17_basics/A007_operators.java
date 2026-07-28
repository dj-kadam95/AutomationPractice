package a_17_basics;

public class A007_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(2,5);
		sub(5,2);
		mul(3,3);
		div(8,2);
		mod(8,2);
		comparison(18);

	}
	
//	Arithmetic Operators
	
	static void add(int a, int b) {
		int add = a+b;
		System.out.println("addition of "+a+" & "+b+" is : "+add);
	}
	
	static void sub(int a, int b) {
		int sub = a-b;
		System.out.println("subtraction of "+a+" & "+b+" is : "+sub);
	}
	
	static void mul(int a, int b) {
		int mul = a*b;
		mul++;
		System.out.println("multiplication of "+a+" & "+b+" is : "+mul);
		--mul;
		System.out.println("multiplication of "+a+" & "+b+" is : "+mul);
	}
	
	static void div(int a, int b) {
		int div = a/b;
		div--;
		System.out.println("divison of "+a+" & "+b+" is : "+div);
		++div;
		System.out.println("divison of "+a+" & "+b+" is : "+div);
	}
	
	static void mod(int a, int b) {
		int mod = a%b;
		System.out.println("modulas of "+a+" & "+b+" is : "+mod);
	}
	
//	Comparison Operators (<,>,<=,>=,!=,==)
	
	static void comparison(int age) {
		
		if(age<18) {
			System.out.println("1");
		}
		if(age>18) {
			System.out.println("2");
		}
		if(age<=18) {
			System.out.println("3");
		}
		if(age>=18) {
			System.out.println("4");
		}
		if(age!=18) {
			System.out.println("5");
		}
		if(age==18) {
			System.out.println("6");
		}
		
	}
	

}
