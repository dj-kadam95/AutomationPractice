package may_30_test_components;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import abstract_components.F_goToUrls;

public class B_May_30_base_test {

	public WebDriver driver;

	public F_goToUrls url;

	public WebDriver initDriver() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		return driver;
	}
	
	
	@BeforeMethod(alwaysRun = true)
	public F_goToUrls launchApplication1()  {

		driver = initDriver();
		url = new F_goToUrls(driver);
		return url;
	}
	

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
		
	}


}
	
