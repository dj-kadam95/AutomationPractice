package may_20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A05_parellel_crossBrowser_testing2 {

	WebDriver driver;

	@Parameters("Browser")
	@Test
	public void EdgeLaunch(String browser) {
		
		if (browser.equals("Edge")) {
		driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle() + " Edge_parellel");
		driver.quit();
		}
	}

	@Parameters("Browser")
	@Test
	public void ChromeLaunch(String browser) {

		if (browser.equals("Chrome")) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle() + " Chrome_Parellel");
		driver.quit();
		}
	}
}
