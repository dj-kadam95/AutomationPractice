package assignments_072_90;

import java.util.Arrays;

public class Assignment_80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to copy one array into another array in reverse order
		
		String[] str1 =new String[4];
		
		str1[0]="MNOP";
		str1[1]="IJKL";
		str1[2]="ABCD";
		str1[3]="EFGH";
		
		String s1 =Arrays.toString(str1);
		
		System.out.println("\nstr1 : "+s1);
		
		Arrays.sort(str1);
		
		String s2 =Arrays.toString(str1);
	
		System.out.println("\nsorted : "+s2);
	
	}

}
