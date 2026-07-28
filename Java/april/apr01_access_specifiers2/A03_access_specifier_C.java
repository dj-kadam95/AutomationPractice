package apr01_access_specifiers2;

import apr01_access_specifiers1.A01_access_specifier_A;
import apr01_access_specifiers1.A06_public_class;

public abstract class A03_access_specifier_C extends A01_access_specifier_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A01_access_specifier_A.add();  //public
//		sub();  //default
//		mul();  //private
		div();  //protected
		
//		A01_default_class.main();   //default/pkg class
		A06_public_class.main();   //public class

	}

}
