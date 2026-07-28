package apr24_encapsulation;

public class A01_encapsulation extends A02_sensetive_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A02_sensetive_info e = new A02_sensetive_info();
		System.out.println(e.getId());
		System.out.println(e.getPw());
		
		e.setId("deshmukhdhananjay76@gmail.com");
		e.setPw("Vaishubh@9");

		System.out.println(e.getId());
		System.out.println(e.getPw());
	}

}
