package assignments_091_107;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment_098 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to store account number, account holder name
//		inside map by passing the values at runtime
//		for both account number, & account holder name
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter account holder name\n");
		
		String name1 =sc.next();
		String name2 =sc.next();
		String name3 =sc.next();
		
		System.out.println("enter account number");
		
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		int number3=sc.nextInt();
		
		Map<String, Integer> c = new HashMap<>();
		
		c.put(name1, number1);
		c.put(name2, number2);
		c.put(name3, number3);
		
		System.out.println(c);
		
		sc.close();
		
	}

}
