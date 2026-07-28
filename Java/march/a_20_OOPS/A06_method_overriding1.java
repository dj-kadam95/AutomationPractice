package a_20_OOPS;

public class A06_method_overriding1 extends A07_super_keyword_parent{

	public void addition(int a, int b){
		
		super.addition(9, 12);
		int sum = a+b;
		System.out.println( sum);
	}

}
