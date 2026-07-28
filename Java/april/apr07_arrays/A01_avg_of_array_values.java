package apr07_arrays;

public class A01_avg_of_array_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[3];
		a[0] = 5;
		a[1] = 10;
		a[2] = 9;

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		int avg = sum / a.length;
		System.out.println(avg);
	}

}
