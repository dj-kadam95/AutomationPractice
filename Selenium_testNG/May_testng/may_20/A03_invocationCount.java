package may_20;

import org.testng.annotations.Test;

public class A03_invocationCount {
	
	@Test(priority=2)
	public void logout() {
		System.out.println("logout");
	}
	@Test(invocationCount=2, enabled=false)
	public void registration() {
		System.out.println("registration");
	}
	@Test(invocationCount=3, priority=-1)
	public void login() {
		System.out.println("login");
	}

}
