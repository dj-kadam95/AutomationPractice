package apr25;

import java.util.Date;

public class A02_date_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d1 = new Date();

//		Long d2 = d1.getTime();
//		
//		System.out.println(d2);  

		// current Date

		Date d3 = new Date(d1.getTime());

		String f1 = d3.toString();

		System.out.println(f1);

		String date = f1.substring(8, 10);

		String month = f1.substring(4, 7);

		String year = f1.substring(24, 28);

		System.out.println(date.concat(" " + month).concat(" " + year));

		// future Date

		Date d4 = new Date(d1.getTime()+60*60*1000*24*2);

		String f2 = d4.toString();

		System.out.println(f2);

		String date1 = f2.substring(8, 10);

		String month1 = f2.substring(4, 7);

		String year1 = f2.substring(24, 28);

		System.out.println(date1.concat(" " + month1).concat(" " + year1));

		// past Date

		Date d5 = new Date(d1.getTime()-60*60*1000*24*2);

		String f3 = d5.toString();

		System.out.println(f3);

		String date2 = f3.substring(8, 10);

		String month2 = f3.substring(4, 7);

		String year2 = f3.substring(24, 28);

		System.out.println(date2.concat(" " + month2).concat(" " + year2));

	}

}
