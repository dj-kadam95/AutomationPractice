package assignments_072_90;

import java.util.Date;

public class Assignment_85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP to findout the past, current & future dates

		Date d = new Date();
		long l = d.getTime();

		Date past = new Date(l + (60 * 60 * 1000 * 24 * (-5)));
		Date present = new Date(l + (60 * 1000));
		Date future = new Date(l + (60 * 60 * 1000 * 24 * 5));

		String f1 = past.toString();
		String f2 = present.toString();
		String f3 = future.toString();

		String past_day = f1.substring(8, 10);
		String past_month = f1.substring(4, 7);
		String past_year = f1.substring(24, 28);

		String present_day = f2.substring(8, 10);
		String present_month = f2.substring(4, 7);
		String present_year = f2.substring(24, 28);

		String future_day = f3.substring(8, 10);
		String future_month = f3.substring(4, 7);
		String future_year = f3.substring(24, 28);

		System.out.println("pastDate : " + past_day.concat(" " + past_month).concat(" " + past_year));
		System.out.println("pastDate : " + present_day.concat(" " + present_month).concat(" " + present_year));
		System.out.println("pastDate : " + future_day.concat(" " + future_month).concat(" " + future_year));

	}

}
