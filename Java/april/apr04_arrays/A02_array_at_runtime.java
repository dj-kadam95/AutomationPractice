package apr04_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A02_array_at_runtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int SOA = sc.nextInt(); 
		String a[]= new String[SOA];

		for(int i=0; i<SOA; i++) {
						
			System.out.println("Enter the value of index : "+i);
			a[i]=sc.next();
		}
		
		String c = Arrays.toString(a);
		
		System.out.println("\n"+c +" "+c.length());
		sc.close();

	}

}
