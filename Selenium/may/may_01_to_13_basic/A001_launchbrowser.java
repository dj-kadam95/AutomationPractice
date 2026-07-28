package may_01_to_13_basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class A001_launchbrowser {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.quit();

	}


}
