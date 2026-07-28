package assignments_056_057_059_AS2;

import assignments_054_055_058_AS1.Assignment_54_access_specifier_A;

public abstract class Assignment_56_access_specifier_C extends Assignment_54_access_specifier_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WAP on access specifiers outside the package
//		by becoming the subclass for methods
		
		Assignment_54_access_specifier_A.add();  //public
//		sub();                                   //default
//		mul();                                   //private
		Assignment_54_access_specifier_A.div();  //protected
		

	}

}
