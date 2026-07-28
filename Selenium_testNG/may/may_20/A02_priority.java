package may_20;

import org.testng.annotations.Test;

public class A02_priority {
	
	@Test(priority=2)
	public void logout() {
		System.out.println("logout");
	}
	@Test(priority=-1)
	public void registration() {
		System.out.println("registration");
	}
	@Test(priority=0)
	public void slogin() {
		System.out.println("login");
	}
	@Test
	public void signup() {
		System.out.println("signup");
	}
	@Test(priority=1)
	public void addToCart() {
		System.out.println("AddToCart");
	}
	@Test(priority=2)
	public void checkoutPage() {
		System.out.println("checkoutPage");
	}
	
	

}
