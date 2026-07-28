package may_20;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A01_order_of_execution {

	@Test
	public void logout() {
		System.out.println("logout");
	}
	@Test
	public void registration() {
		System.out.println("registration");
	}
	@Test
	public void login() {
		System.out.println("login");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");	
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("AfterMethod");	
	}
	
}
