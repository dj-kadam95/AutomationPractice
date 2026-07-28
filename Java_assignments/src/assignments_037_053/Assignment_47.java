package assignments_037_053;

public class Assignment_47 {
	
	int a = 20;
	int b;
	String name = "Dhananjay";
	String sname;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WAP on this Keyword		
		
		Assignment_47 ab = new Assignment_47(30);
		ab.man("Kadam");
	}
	
	Assignment_47(int b){
		
		this.b=b;
		System.out.println("b "+b);
		int a = 0;
		a=this.a;
		System.out.println("a = "+a+" b = "+b+" a+b= "+(a+b));
		
	}
	
	void man(String sname ) {
		
		this.sname=sname;
		System.out.println(sname);
		
		String name=null;
		name=this.name;
		System.out.println(name+" "+sname);
		
	}

}
