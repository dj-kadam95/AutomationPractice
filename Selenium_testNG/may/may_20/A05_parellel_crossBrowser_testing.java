package may_20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class A05_parellel_crossBrowser_testing {

	WebDriver driver;

	// Upcasting child class(edgedriver) to super class(webdriver)
	@Test
	public void brouwserLaunch() {
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle() + " Edge");
		driver.quit();

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle() + " Chrome");
		driver.quit();
	}

	
	@Test(testName="parellel")
	public void EdgeLaunch() {
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle() + " Edge_parellel");
		driver.quit();
	}

	@Test(testName="parellel")
	public void ChromeLaunch() {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle() + " Chrome_Parellel");
		driver.quit();
	}
}
