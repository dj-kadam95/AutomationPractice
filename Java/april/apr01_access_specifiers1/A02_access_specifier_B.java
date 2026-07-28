package apr01_access_specifiers1;

public class A02_access_specifier_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A01_access_specifier_A.add();  //public
		A01_access_specifier_A.sub();  //default
//      A01_access_specifier_A.mul();  //private
		A01_access_specifier_A.div();  //protected
		
		A05_default_class.main();   //default/pkg class
		A06_public_class.main();   //public class
		main(4);

	}
	
	public static void main(int a) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
	}

}
