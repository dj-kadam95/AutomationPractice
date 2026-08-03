package missing_topics;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().addCookie(new Cookie("", ""));
//        driver.manage().getCookies();
//        driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("Automation Testing with Java Selenium");
		Thread.sleep(2000);
		e1.sendKeys(Keys.ENTER);
	}

}
