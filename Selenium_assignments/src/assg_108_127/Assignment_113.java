package assg_108_127;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_113 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//   	WAP to perform login on https://www.flipkart.com/ 	

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement login = driver.findElement(By.xpath("//span['Login']"));
		login.click();
        WebElement id = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));// .sendKeys("dkdhananjay77@gmail.com");;
    	id.sendKeys("dkdhananjay77@gmail.com");
    	WebElement loginClick = driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']"));
		loginClick.click();
		Thread.sleep(15000);
		WebElement verify = driver.findElement(By.xpath("//button[@class='QqFHMw llMuju M5XAsp']"));
		verify.click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
