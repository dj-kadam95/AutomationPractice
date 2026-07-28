package may_30_testcases;
//import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import may_30_test_components.B_May_30_base_test;
import pom.A_May_30_loginPage;


public class C_May_30_loginPage extends B_May_30_base_test{

	@Test
	public void loginPage() throws InterruptedException {
		
		String Expected1 = "Login Successfully";
		String Expected2 = "Incorrect email or password.";
		String Expected3 = "Logout Successfully";
		
		A_May_30_loginPage LP = url.login();
		
		LP.login("dkdhananjay77@gmail.com", "Shubh@1561995");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);

		if (LP.actualMsg().equals(Expected1) || LP.actualMsg().equals(Expected3)) {

			System.out.println(LP.actualMsg());
			System.out.println(Expected1);
			Assert.assertEquals(LP.actualMsg(), Expected1, "True............");
			LP.logout();
			
			Thread.sleep(1000);

			System.out.println(LP.actualMsg());
			//System.out.println(Expected3);
			Assert.assertEquals(LP.actualMsg(), Expected3, "True............");
		
		} else {

			System.out.println(LP.actualMsg());
			System.out.println(Expected2);
			Assert.assertEquals(LP.actualMsg(), Expected2, "True............");

		}
	}
	
//	@Test
//	public void addToCart() throws InterruptedException {
//		
//		A_May_30_loginPage LP = url.login();
//		LP.login("dkdhananjay77@gmail.com", "Shubh@15061995");
//		LP.prodSize();
//		Thread.sleep(2000);
//		LP.addToCart("AUTOMATION 8");
//	
//	}
}

// Q what will happen in case of pom if elements are not initialized?
//--> it will get null pointer exception