package assignments_091_107;

public class Assignment_107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WAP on encapsulation

		A02_sensetive_info e = new A02_sensetive_info();
		System.out.println(e.getId());
		System.out.println(e.getPw());

		e.setId("deshmukhdhananjay76@gmail.com");
		e.setPw("Vaishubh@9");

		System.out.println(e.getId());
		System.out.println(e.getPw());

	}

}

class A02_sensetive_info {

	private String id = "dkdhananjay77@gmail.com";
	private String pw = "Shubh@15061995";

	public String getId() {

		return id;

	}

	public String getPw() {
		return pw;
	}

	public void setId(String id) {
		this.id = id;

	}

	public void setPw(String pw) {
		this.pw = pw;

	}

}
