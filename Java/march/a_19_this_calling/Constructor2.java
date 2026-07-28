package a_19_this_calling;

public class Constructor2 {

	Constructor2() {

		this(1);    // to call one constructor from another constructor within same class
		System.out.println("2");

	}

	Constructor2(int a) {

		System.out.println(a);

	}

}
