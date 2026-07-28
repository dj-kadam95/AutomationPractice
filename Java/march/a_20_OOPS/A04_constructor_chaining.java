package a_20_OOPS;

public class A04_constructor_chaining {
	
	A04_constructor_chaining(){
		
		System.out.println("1");
		
	}
	A04_constructor_chaining(int a){
		 
		this();
		System.out.println(a);
		
	}
	A04_constructor_chaining(String a){
		
		this(2);
		System.out.println(a);
		
	}
	A04_constructor_chaining(char a){
		
		this("3");
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new A04_constructor_chaining('4');

	}

}
