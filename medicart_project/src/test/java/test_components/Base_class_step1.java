package test_components;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import abstract_components.URL_step2;

public class Base_class_step1 {
	
	public WebDriver driver;
	
	public static URL_step2 url;
	 
	public WebDriver initDriver() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
				
	}
	
	@BeforeMethod(alwaysRun=true)
	public URL_step2 launchApp() {
		
		driver= initDriver();
		url = new URL_step2(driver);
		return url;
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}

}
