package a_20_OOPS;

public class A07_super_keyword_child extends A07_super_keyword_parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A07_super_keyword_child a = new A07_super_keyword_child();
		a.addition(3,7,2); //parent class method gets overridden

	}
	
       public void addition(int a, int b, int c){
		
		int sub = a-b+c;
		System.out.println(sub);
		super.addition(4,8,3);
		super.addition(4,8);
	}

}