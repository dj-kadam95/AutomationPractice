package assg_108_127;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_109 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		WAP to launch and Close Any Website
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}

}
