package a_17_basics;

public class A17_SIB_IIB {

	static 
	{
		System.out.println("SIB_2");
	}
	
	{
		System.out.println("IIB_2");
	}
	
	A17_SIB_IIB(int a){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println("main method");
		new A17_SIB_IIB();
		new A17_SIB_IIB(200);	

	}
	
	A17_SIB_IIB(){
		System.out.println("contructor_1");
	}
	
	

	static 
	{
		System.out.println("SIB_1");
	}
	
	{
		System.out.println("IIB_1");
	}
}
