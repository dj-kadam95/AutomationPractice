package may_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A03_testcase2_4_login_logout {
	
	WebDriver driver;
	
	@Test
	public void login() throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		
		driver.findElement(By.id("userEmail")).sendKeys("dkdhananjay77@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Shubh@15061995");
		driver.findElement(By.id("login")).click();
		Thread.sleep(1000);
		String actual =driver.findElement(By.className("toast-container")).getText();
		String Expected = "Login Successfully";
		
		System.out.println(actual);
		
		Assert.assertEquals(actual, Expected, "True............");
		driver.quit();
	}
	
	@Test
	public void login_logout() throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		
		driver.findElement(By.id("userEmail")).sendKeys("dkdhananjay77@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Shubh@15061995");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("fa-sign-out")).click();
		Thread.sleep(1000);
		String actual =driver.findElement(By.className("toast-container")).getText();
		String Expected = "Logout Successfully";
		
		System.out.println(actual);
		
		Assert.assertEquals(actual, Expected, "True............");
		driver.quit();	
	}

}
